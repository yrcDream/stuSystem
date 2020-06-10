package com.stuSystem.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeachcourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public TeachcourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTcIdIsNull() {
            addCriterion("tc_id is null");
            return (Criteria) this;
        }

        public Criteria andTcIdIsNotNull() {
            addCriterion("tc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcIdEqualTo(String value) {
            addCriterion("tc_id =", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotEqualTo(String value) {
            addCriterion("tc_id <>", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdGreaterThan(String value) {
            addCriterion("tc_id >", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdGreaterThanOrEqualTo(String value) {
            addCriterion("tc_id >=", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLessThan(String value) {
            addCriterion("tc_id <", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLessThanOrEqualTo(String value) {
            addCriterion("tc_id <=", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLike(String value) {
            addCriterion("tc_id like", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotLike(String value) {
            addCriterion("tc_id not like", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdIn(List<String> values) {
            addCriterion("tc_id in", values, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotIn(List<String> values) {
            addCriterion("tc_id not in", values, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdBetween(String value1, String value2) {
            addCriterion("tc_id between", value1, value2, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotBetween(String value1, String value2) {
            addCriterion("tc_id not between", value1, value2, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcCourserIsNull() {
            addCriterion("tc_courser is null");
            return (Criteria) this;
        }

        public Criteria andTcCourserIsNotNull() {
            addCriterion("tc_courser is not null");
            return (Criteria) this;
        }

        public Criteria andTcCourserEqualTo(String value) {
            addCriterion("tc_courser =", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserNotEqualTo(String value) {
            addCriterion("tc_courser <>", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserGreaterThan(String value) {
            addCriterion("tc_courser >", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserGreaterThanOrEqualTo(String value) {
            addCriterion("tc_courser >=", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserLessThan(String value) {
            addCriterion("tc_courser <", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserLessThanOrEqualTo(String value) {
            addCriterion("tc_courser <=", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserLike(String value) {
            addCriterion("tc_courser like", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserNotLike(String value) {
            addCriterion("tc_courser not like", value, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserIn(List<String> values) {
            addCriterion("tc_courser in", values, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserNotIn(List<String> values) {
            addCriterion("tc_courser not in", values, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserBetween(String value1, String value2) {
            addCriterion("tc_courser between", value1, value2, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcCourserNotBetween(String value1, String value2) {
            addCriterion("tc_courser not between", value1, value2, "tcCourser");
            return (Criteria) this;
        }

        public Criteria andTcTeacherIsNull() {
            addCriterion("tc_teacher is null");
            return (Criteria) this;
        }

        public Criteria andTcTeacherIsNotNull() {
            addCriterion("tc_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTcTeacherEqualTo(String value) {
            addCriterion("tc_teacher =", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherNotEqualTo(String value) {
            addCriterion("tc_teacher <>", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherGreaterThan(String value) {
            addCriterion("tc_teacher >", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("tc_teacher >=", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherLessThan(String value) {
            addCriterion("tc_teacher <", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherLessThanOrEqualTo(String value) {
            addCriterion("tc_teacher <=", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherLike(String value) {
            addCriterion("tc_teacher like", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherNotLike(String value) {
            addCriterion("tc_teacher not like", value, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherIn(List<String> values) {
            addCriterion("tc_teacher in", values, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherNotIn(List<String> values) {
            addCriterion("tc_teacher not in", values, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherBetween(String value1, String value2) {
            addCriterion("tc_teacher between", value1, value2, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcTeacherNotBetween(String value1, String value2) {
            addCriterion("tc_teacher not between", value1, value2, "tcTeacher");
            return (Criteria) this;
        }

        public Criteria andTcLevelIsNull() {
            addCriterion("tc_level is null");
            return (Criteria) this;
        }

        public Criteria andTcLevelIsNotNull() {
            addCriterion("tc_level is not null");
            return (Criteria) this;
        }

        public Criteria andTcLevelEqualTo(Integer value) {
            addCriterion("tc_level =", value, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelNotEqualTo(Integer value) {
            addCriterion("tc_level <>", value, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelGreaterThan(Integer value) {
            addCriterion("tc_level >", value, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc_level >=", value, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelLessThan(Integer value) {
            addCriterion("tc_level <", value, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelLessThanOrEqualTo(Integer value) {
            addCriterion("tc_level <=", value, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelIn(List<Integer> values) {
            addCriterion("tc_level in", values, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelNotIn(List<Integer> values) {
            addCriterion("tc_level not in", values, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelBetween(Integer value1, Integer value2) {
            addCriterion("tc_level between", value1, value2, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("tc_level not between", value1, value2, "tcLevel");
            return (Criteria) this;
        }

        public Criteria andTcStucountIsNull() {
            addCriterion("tc_stuCount is null");
            return (Criteria) this;
        }

        public Criteria andTcStucountIsNotNull() {
            addCriterion("tc_stuCount is not null");
            return (Criteria) this;
        }

        public Criteria andTcStucountEqualTo(Integer value) {
            addCriterion("tc_stuCount =", value, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountNotEqualTo(Integer value) {
            addCriterion("tc_stuCount <>", value, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountGreaterThan(Integer value) {
            addCriterion("tc_stuCount >", value, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc_stuCount >=", value, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountLessThan(Integer value) {
            addCriterion("tc_stuCount <", value, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountLessThanOrEqualTo(Integer value) {
            addCriterion("tc_stuCount <=", value, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountIn(List<Integer> values) {
            addCriterion("tc_stuCount in", values, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountNotIn(List<Integer> values) {
            addCriterion("tc_stuCount not in", values, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountBetween(Integer value1, Integer value2) {
            addCriterion("tc_stuCount between", value1, value2, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStucountNotBetween(Integer value1, Integer value2) {
            addCriterion("tc_stuCount not between", value1, value2, "tcStucount");
            return (Criteria) this;
        }

        public Criteria andTcStartIsNull() {
            addCriterion("tc_start is null");
            return (Criteria) this;
        }

        public Criteria andTcStartIsNotNull() {
            addCriterion("tc_start is not null");
            return (Criteria) this;
        }

        public Criteria andTcStartEqualTo(Date value) {
            addCriterion("tc_start =", value, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartNotEqualTo(Date value) {
            addCriterion("tc_start <>", value, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartGreaterThan(Date value) {
            addCriterion("tc_start >", value, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartGreaterThanOrEqualTo(Date value) {
            addCriterion("tc_start >=", value, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartLessThan(Date value) {
            addCriterion("tc_start <", value, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartLessThanOrEqualTo(Date value) {
            addCriterion("tc_start <=", value, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartIn(List<Date> values) {
            addCriterion("tc_start in", values, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartNotIn(List<Date> values) {
            addCriterion("tc_start not in", values, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartBetween(Date value1, Date value2) {
            addCriterion("tc_start between", value1, value2, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcStartNotBetween(Date value1, Date value2) {
            addCriterion("tc_start not between", value1, value2, "tcStart");
            return (Criteria) this;
        }

        public Criteria andTcEndIsNull() {
            addCriterion("tc_end is null");
            return (Criteria) this;
        }

        public Criteria andTcEndIsNotNull() {
            addCriterion("tc_end is not null");
            return (Criteria) this;
        }

        public Criteria andTcEndEqualTo(Date value) {
            addCriterion("tc_end =", value, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndNotEqualTo(Date value) {
            addCriterion("tc_end <>", value, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndGreaterThan(Date value) {
            addCriterion("tc_end >", value, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndGreaterThanOrEqualTo(Date value) {
            addCriterion("tc_end >=", value, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndLessThan(Date value) {
            addCriterion("tc_end <", value, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndLessThanOrEqualTo(Date value) {
            addCriterion("tc_end <=", value, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndIn(List<Date> values) {
            addCriterion("tc_end in", values, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndNotIn(List<Date> values) {
            addCriterion("tc_end not in", values, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndBetween(Date value1, Date value2) {
            addCriterion("tc_end between", value1, value2, "tcEnd");
            return (Criteria) this;
        }

        public Criteria andTcEndNotBetween(Date value1, Date value2) {
            addCriterion("tc_end not between", value1, value2, "tcEnd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teachcourse
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 09 08:44:08 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teachcourse
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}