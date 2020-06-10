package com.stuSystem.manager.mapper;

import com.stuSystem.manager.pojo.Courser;
import com.stuSystem.manager.pojo.CourserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int countByExample(CourserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int deleteByExample(CourserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int deleteByPrimaryKey(String courserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int insert(Courser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int insertSelective(Courser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    List<Courser> selectByExample(CourserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    Courser selectByPrimaryKey(String courserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int updateByExampleSelective(@Param("record") Courser record, @Param("example") CourserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int updateByExample(@Param("record") Courser record, @Param("example") CourserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int updateByPrimaryKeySelective(Courser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courser
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    int updateByPrimaryKey(Courser record);
}