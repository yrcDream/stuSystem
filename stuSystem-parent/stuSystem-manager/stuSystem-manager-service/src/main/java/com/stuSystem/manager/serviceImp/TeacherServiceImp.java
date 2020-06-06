package com.stuSystem.manager.serviceImp;

import com.stuSystem.manager.custpojo.ExcelUser;
import com.stuSystem.manager.custpojo.UserInfo;
import com.stuSystem.manager.mapper.TeacherMapper;
import com.stuSystem.manager.pojo.other.myException.UserException;
import com.stuSystem.manager.pojo.other.usercheck.TeacherCheck;
import com.stuSystem.manager.pojo.other.usercheck.UserCheck;
import com.stuSystem.manager.pojo.Teacher;
import com.stuSystem.manager.pojo.TeacherExample;
import com.stuSystem.manager.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("teacherServiceImp")
public class TeacherServiceImp implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public Teacher findTeacher(UserInfo userInfo) throws Exception {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeachIdEqualTo(userInfo.getUsername());
        criteria.andTeachPwdEqualTo(userInfo.getPwd());
        List<Teacher> teacherList = teacherMapper.selectByExample(teacherExample);
        if(teacherList.size()>0){
            Teacher teacher = teacherList.get(0);
            teacher.setTeachLine(1);
            return teacher;
        }
        return null;
    }

    @Override
    public Teacher findTeacherByTeachId(String teachId) throws Exception {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeachIdEqualTo(teachId);
        List<Teacher> teaList = teacherMapper.selectByExample(teacherExample);
        if(teaList.size()>0){
            return teaList.get(0);
        }
        return null;
    }
    @Override
    public boolean insertOneTeachItem(UserInfo userInfo) throws UserException {
        UserCheck<Teacher> userCheck = new TeacherCheck<>();
        Teacher teacher = userCheck.checkOneItem(userInfo,Teacher.class);
        try{
            int flag=0;
            if(findTeacherByTeachId(teacher.getTeachId())==null){
                flag  = teacherMapper.insert(teacher);
            }
            if(flag==1){
                System.out.println("插入成功");
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

    @Override
    public ExcelUser<Teacher> insertTeachTable(MultipartFile mFile) throws Exception {
        UserCheck<Teacher> userCheck = new TeacherCheck<>();
        ExcelUser<Teacher> studentExcelUser = userCheck.checkManyItems(mFile,Teacher.class);
        List<Teacher> stuList = new ArrayList<>();
        for(Teacher teacher:studentExcelUser.getSuccessDeal()){
            if(findTeacherByTeachId(teacher.getTeachId())==null){
                int flag = teacherMapper.insert(teacher);
                if(flag==0){
                    stuList.add(teacher);
                }
            }else{
                stuList.add(teacher);
            }
        }
        studentExcelUser.setFailImport(stuList);
        return studentExcelUser;
    }

    @Override
    public List<Map<String, String>> findAllTeachers() {
        return teacherMapper.selectAll();
    }


    @Override
    public boolean updateTeachInfo(Teacher teacher) {
        int flag = teacherMapper.updateByPrimaryKey(teacher);
        if(flag==1){
            return true;
        }else{
            return false;
        }
    }
}
