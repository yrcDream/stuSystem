package com.stuSystem.manager.serviceImp;

import com.stuSystem.manager.custpojo.ExcelUser;
import com.stuSystem.manager.custpojo.UserInfo;
import com.stuSystem.manager.mapper.StudentMapper;
import com.stuSystem.manager.myException.UserException;
import com.stuSystem.manager.other.productService.ProductService;
import com.stuSystem.manager.other.usercheck.AbstractUserCheck;
import com.stuSystem.manager.other.usercheck.StudentCheck;
import com.stuSystem.manager.other.usercheck.UserCheck;
import com.stuSystem.manager.pojo.Student;
import com.stuSystem.manager.pojo.StudentExample;
import com.stuSystem.manager.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Service("stuServiceImp")
public class StuServiceImp implements StuService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 使用封装后的通用信息查询学生
     * @param userInfo
     * @return
     * @throws Exception
     */
    @Override
    public Student findStudent(UserInfo userInfo) throws Exception {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuPwdEqualTo(userInfo.getPwd());
        criteria.andStuIdEqualTo(userInfo.getUsername());
        List<Student> stuLsit = studentMapper.selectByExample(studentExample);
        if(stuLsit.size()>0){
           Student stu =  stuLsit.get(0);
           stu.setStuOnline(1);
           return stu;
        }


        return null;
    }

    /**
     * 使用学号查询学生
     * @param stuId
     * @return
     * @throws Exception
     */
    @Override
    public Student findStudentByStuId(String stuId) throws Exception {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuIdEqualTo(stuId);
        List<Student> stuList = studentMapper.selectByExample(studentExample);
        if(stuList.size()>0){
            return stuList.get(0);
        }
        return null;
    }

    /**-
     * 通过userInfo信息插入一条学生记录
     * @param userInfo
     * @return
     * @throws UserException
     */
    @Override
    public boolean insertOneStuItem(UserInfo userInfo) throws UserException {
        UserCheck<Student> userCheck = new StudentCheck<>();
        //System.out.println("进入服务");
        Student stu = userCheck.checkOneItem(userInfo,Student.class);
       // System.out.println("学生id："+stu.getStuId());

        try{
            int flag=0;
            if(findStudentByStuId(stu.getStuId())==null){
                   flag  = studentMapper.insertSelective(stu);
                System.out.println("插入成功");
            }
            if(flag==1){
                return true;
            }else{
                throw new UserException("学号错误");
            }

        }catch (UserException e){
            throw e;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 只记录插入成功的数据
     * @param mFile
     * @return
     * @throws Exception
     */
    @Override
    public ExcelUser<Student> insertStuTable(MultipartFile mFile) throws Exception {
       /*
       //单线程处理过程
       UserCheck<Student> userCheck = new StudentCheck<>();
        ExcelUser<Student> studentExcelUser = userCheck.checkManyItems(mFile,Student.class);
        List<Student> stuList = new ArrayList<>();
        for(Student stu:studentExcelUser.getSuccessDeal()){
            if(findStudentByStuId(stu.getStuId())==null){
                int flag = studentMapper.insertSelective(stu);
                if(flag==0){
                    stuList.add(stu);
                }
            }else{
                stuList.add(stu);
            }
        }
        studentExcelUser.setFailImport(stuList);
        return studentExcelUser;*/

        UserCheck<Student> check= new StudentCheck<>();
        ExcelUser<Student> studentExcelUser = new ExcelUser<>();
        List<Student> stuList = new ArrayList<>();
        ProductService service =  check.sumbit(mFile.getInputStream());
        System.out.println(service.isEmpty()+","+service.isfinish());
        int successCount=0;

        while(service.isfinish() || !service.isEmpty()){
            System.out.println("开始获取数据");
            Student stu= (Student)service.get();
           if(stu!=null){
               successCount++;
               if(findStudentByStuId(stu.getStuId())==null){
                   int flag = studentMapper.insertSelective(stu);
                   if(flag==0){
                       stuList.add(stu);
                   }
               }else{
                   stuList.add(stu);
               }
           }
        }
        System.out.println("插入已经结束");
        studentExcelUser.setTotal(service.totoal());
        studentExcelUser.setSuccessCount(successCount);
        studentExcelUser.setFailImport(stuList);
        return studentExcelUser;

    }

    /**
     * 用于测试
     * @param args
     */
    public static void main(String args[]){
        String filename = "hello.xlsx";
        int index = filename.lastIndexOf(".");
        if(index!=-1){
            System.out.println(index);
            System.out.println(filename.substring(index+1));
        }

    }
}
