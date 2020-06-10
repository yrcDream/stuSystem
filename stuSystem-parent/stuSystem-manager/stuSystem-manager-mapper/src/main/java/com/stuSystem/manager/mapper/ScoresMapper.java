package com.stuSystem.manager.mapper;

import com.stuSystem.manager.custpojo.CstmScores;
import com.stuSystem.manager.pojo.Scores;
import com.stuSystem.manager.pojo.ScoresExample;
import java.util.List;
import java.util.Map;

import com.stuSystem.manager.pojo.Student;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;

public interface ScoresMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int countByExample(ScoresExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int deleteByExample(ScoresExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int deleteByPrimaryKey(Integer scoresId);


    /**
     * 自定义批量插入
     * @param list
     * @return
     */
    int insertBatch(@Param("list") List<Scores> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int insert(Scores record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int insertSelective(Scores record);


    /**
     * 自定义查询：
     * 根据学生ID查询该学生4类成绩的平均分
     * @param stuId
     * @return
     */
    List<Double> selectStuTypesAveScoresByStuId(@Param("stuId") String stuId);
    /**
     * 自定义查询
     * 查询出某授课的所有学生（通过外键搜索数据）
     * @param tcId
     * @return
     */
    List<CstmScores> selectStuIdsByTcId(@Param("tcId") String tcId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    List<Scores> selectByExample(ScoresExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    Scores selectByPrimaryKey(Integer scoresId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int updateByExampleSelective(@Param("record") Scores record, @Param("example") ScoresExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int updateByExample(@Param("record") Scores record, @Param("example") ScoresExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int updateByPrimaryKeySelective(Scores record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scores
     *
     * @mbggenerated Tue Jun 02 20:22:34 CST 2020
     */
    int updateByPrimaryKey(Scores record);

    /**
     * 使用InsertProvidr支持批量插入
     * @param scores
     * @return
     */
}