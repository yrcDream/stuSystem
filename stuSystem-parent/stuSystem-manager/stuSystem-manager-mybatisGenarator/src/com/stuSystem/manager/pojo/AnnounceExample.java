package com.stuSystem.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnounceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public AnnounceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
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
     * This method corresponds to the database table announce
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
     * This method corresponds to the database table announce
     *
     * @mbggenerated Tue Jun 09 08:44:08 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announce
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
     * This class corresponds to the database table announce
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

        public Criteria andAnnouIdIsNull() {
            addCriterion("annou_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnouIdIsNotNull() {
            addCriterion("annou_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouIdEqualTo(Integer value) {
            addCriterion("annou_id =", value, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdNotEqualTo(Integer value) {
            addCriterion("annou_id <>", value, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdGreaterThan(Integer value) {
            addCriterion("annou_id >", value, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("annou_id >=", value, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdLessThan(Integer value) {
            addCriterion("annou_id <", value, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdLessThanOrEqualTo(Integer value) {
            addCriterion("annou_id <=", value, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdIn(List<Integer> values) {
            addCriterion("annou_id in", values, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdNotIn(List<Integer> values) {
            addCriterion("annou_id not in", values, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdBetween(Integer value1, Integer value2) {
            addCriterion("annou_id between", value1, value2, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("annou_id not between", value1, value2, "annouId");
            return (Criteria) this;
        }

        public Criteria andAnnouNameIsNull() {
            addCriterion("annou_name is null");
            return (Criteria) this;
        }

        public Criteria andAnnouNameIsNotNull() {
            addCriterion("annou_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouNameEqualTo(String value) {
            addCriterion("annou_name =", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameNotEqualTo(String value) {
            addCriterion("annou_name <>", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameGreaterThan(String value) {
            addCriterion("annou_name >", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameGreaterThanOrEqualTo(String value) {
            addCriterion("annou_name >=", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameLessThan(String value) {
            addCriterion("annou_name <", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameLessThanOrEqualTo(String value) {
            addCriterion("annou_name <=", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameLike(String value) {
            addCriterion("annou_name like", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameNotLike(String value) {
            addCriterion("annou_name not like", value, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameIn(List<String> values) {
            addCriterion("annou_name in", values, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameNotIn(List<String> values) {
            addCriterion("annou_name not in", values, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameBetween(String value1, String value2) {
            addCriterion("annou_name between", value1, value2, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouNameNotBetween(String value1, String value2) {
            addCriterion("annou_name not between", value1, value2, "annouName");
            return (Criteria) this;
        }

        public Criteria andAnnouContentIsNull() {
            addCriterion("annou_content is null");
            return (Criteria) this;
        }

        public Criteria andAnnouContentIsNotNull() {
            addCriterion("annou_content is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouContentEqualTo(String value) {
            addCriterion("annou_content =", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentNotEqualTo(String value) {
            addCriterion("annou_content <>", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentGreaterThan(String value) {
            addCriterion("annou_content >", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentGreaterThanOrEqualTo(String value) {
            addCriterion("annou_content >=", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentLessThan(String value) {
            addCriterion("annou_content <", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentLessThanOrEqualTo(String value) {
            addCriterion("annou_content <=", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentLike(String value) {
            addCriterion("annou_content like", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentNotLike(String value) {
            addCriterion("annou_content not like", value, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentIn(List<String> values) {
            addCriterion("annou_content in", values, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentNotIn(List<String> values) {
            addCriterion("annou_content not in", values, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentBetween(String value1, String value2) {
            addCriterion("annou_content between", value1, value2, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouContentNotBetween(String value1, String value2) {
            addCriterion("annou_content not between", value1, value2, "annouContent");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthIsNull() {
            addCriterion("annou_auth is null");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthIsNotNull() {
            addCriterion("annou_auth is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthEqualTo(String value) {
            addCriterion("annou_auth =", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthNotEqualTo(String value) {
            addCriterion("annou_auth <>", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthGreaterThan(String value) {
            addCriterion("annou_auth >", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthGreaterThanOrEqualTo(String value) {
            addCriterion("annou_auth >=", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthLessThan(String value) {
            addCriterion("annou_auth <", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthLessThanOrEqualTo(String value) {
            addCriterion("annou_auth <=", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthLike(String value) {
            addCriterion("annou_auth like", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthNotLike(String value) {
            addCriterion("annou_auth not like", value, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthIn(List<String> values) {
            addCriterion("annou_auth in", values, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthNotIn(List<String> values) {
            addCriterion("annou_auth not in", values, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthBetween(String value1, String value2) {
            addCriterion("annou_auth between", value1, value2, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouAuthNotBetween(String value1, String value2) {
            addCriterion("annou_auth not between", value1, value2, "annouAuth");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkIsNull() {
            addCriterion("annou_link is null");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkIsNotNull() {
            addCriterion("annou_link is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkEqualTo(String value) {
            addCriterion("annou_link =", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkNotEqualTo(String value) {
            addCriterion("annou_link <>", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkGreaterThan(String value) {
            addCriterion("annou_link >", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkGreaterThanOrEqualTo(String value) {
            addCriterion("annou_link >=", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkLessThan(String value) {
            addCriterion("annou_link <", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkLessThanOrEqualTo(String value) {
            addCriterion("annou_link <=", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkLike(String value) {
            addCriterion("annou_link like", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkNotLike(String value) {
            addCriterion("annou_link not like", value, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkIn(List<String> values) {
            addCriterion("annou_link in", values, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkNotIn(List<String> values) {
            addCriterion("annou_link not in", values, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkBetween(String value1, String value2) {
            addCriterion("annou_link between", value1, value2, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouLinkNotBetween(String value1, String value2) {
            addCriterion("annou_link not between", value1, value2, "annouLink");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedIsNull() {
            addCriterion("annou_visited is null");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedIsNotNull() {
            addCriterion("annou_visited is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedEqualTo(Integer value) {
            addCriterion("annou_visited =", value, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedNotEqualTo(Integer value) {
            addCriterion("annou_visited <>", value, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedGreaterThan(Integer value) {
            addCriterion("annou_visited >", value, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedGreaterThanOrEqualTo(Integer value) {
            addCriterion("annou_visited >=", value, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedLessThan(Integer value) {
            addCriterion("annou_visited <", value, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedLessThanOrEqualTo(Integer value) {
            addCriterion("annou_visited <=", value, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedIn(List<Integer> values) {
            addCriterion("annou_visited in", values, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedNotIn(List<Integer> values) {
            addCriterion("annou_visited not in", values, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedBetween(Integer value1, Integer value2) {
            addCriterion("annou_visited between", value1, value2, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouVisitedNotBetween(Integer value1, Integer value2) {
            addCriterion("annou_visited not between", value1, value2, "annouVisited");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeIsNull() {
            addCriterion("annou_intime is null");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeIsNotNull() {
            addCriterion("annou_intime is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeEqualTo(Date value) {
            addCriterion("annou_intime =", value, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeNotEqualTo(Date value) {
            addCriterion("annou_intime <>", value, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeGreaterThan(Date value) {
            addCriterion("annou_intime >", value, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("annou_intime >=", value, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeLessThan(Date value) {
            addCriterion("annou_intime <", value, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeLessThanOrEqualTo(Date value) {
            addCriterion("annou_intime <=", value, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeIn(List<Date> values) {
            addCriterion("annou_intime in", values, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeNotIn(List<Date> values) {
            addCriterion("annou_intime not in", values, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeBetween(Date value1, Date value2) {
            addCriterion("annou_intime between", value1, value2, "annouIntime");
            return (Criteria) this;
        }

        public Criteria andAnnouIntimeNotBetween(Date value1, Date value2) {
            addCriterion("annou_intime not between", value1, value2, "annouIntime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table announce
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
     * This class corresponds to the database table announce
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