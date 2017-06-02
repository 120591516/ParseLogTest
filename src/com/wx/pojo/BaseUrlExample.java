package com.wx.pojo;

import java.util.ArrayList;
import java.util.List;

public class BaseUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseUrlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUrlIdIsNull() {
            addCriterion("url_id is null");
            return (Criteria) this;
        }

        public Criteria andUrlIdIsNotNull() {
            addCriterion("url_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrlIdEqualTo(Integer value) {
            addCriterion("url_id =", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotEqualTo(Integer value) {
            addCriterion("url_id <>", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThan(Integer value) {
            addCriterion("url_id >", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("url_id >=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThan(Integer value) {
            addCriterion("url_id <", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThanOrEqualTo(Integer value) {
            addCriterion("url_id <=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdIn(List<Integer> values) {
            addCriterion("url_id in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotIn(List<Integer> values) {
            addCriterion("url_id not in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdBetween(Integer value1, Integer value2) {
            addCriterion("url_id between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("url_id not between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlDescIsNull() {
            addCriterion("url_desc is null");
            return (Criteria) this;
        }

        public Criteria andUrlDescIsNotNull() {
            addCriterion("url_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUrlDescEqualTo(String value) {
            addCriterion("url_desc =", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotEqualTo(String value) {
            addCriterion("url_desc <>", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescGreaterThan(String value) {
            addCriterion("url_desc >", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescGreaterThanOrEqualTo(String value) {
            addCriterion("url_desc >=", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescLessThan(String value) {
            addCriterion("url_desc <", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescLessThanOrEqualTo(String value) {
            addCriterion("url_desc <=", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescLike(String value) {
            addCriterion("url_desc like", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotLike(String value) {
            addCriterion("url_desc not like", value, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescIn(List<String> values) {
            addCriterion("url_desc in", values, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotIn(List<String> values) {
            addCriterion("url_desc not in", values, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescBetween(String value1, String value2) {
            addCriterion("url_desc between", value1, value2, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlDescNotBetween(String value1, String value2) {
            addCriterion("url_desc not between", value1, value2, "urlDesc");
            return (Criteria) this;
        }

        public Criteria andUrlNameIsNull() {
            addCriterion("url_name is null");
            return (Criteria) this;
        }

        public Criteria andUrlNameIsNotNull() {
            addCriterion("url_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrlNameEqualTo(String value) {
            addCriterion("url_name =", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotEqualTo(String value) {
            addCriterion("url_name <>", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameGreaterThan(String value) {
            addCriterion("url_name >", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameGreaterThanOrEqualTo(String value) {
            addCriterion("url_name >=", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameLessThan(String value) {
            addCriterion("url_name <", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameLessThanOrEqualTo(String value) {
            addCriterion("url_name <=", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameLike(String value) {
            addCriterion("url_name like", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotLike(String value) {
            addCriterion("url_name not like", value, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameIn(List<String> values) {
            addCriterion("url_name in", values, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotIn(List<String> values) {
            addCriterion("url_name not in", values, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameBetween(String value1, String value2) {
            addCriterion("url_name between", value1, value2, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlNameNotBetween(String value1, String value2) {
            addCriterion("url_name not between", value1, value2, "urlName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdIsNull() {
            addCriterion("url_type_id is null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdIsNotNull() {
            addCriterion("url_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdEqualTo(Integer value) {
            addCriterion("url_type_id =", value, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdNotEqualTo(Integer value) {
            addCriterion("url_type_id <>", value, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdGreaterThan(Integer value) {
            addCriterion("url_type_id >", value, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("url_type_id >=", value, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdLessThan(Integer value) {
            addCriterion("url_type_id <", value, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("url_type_id <=", value, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdIn(List<Integer> values) {
            addCriterion("url_type_id in", values, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdNotIn(List<Integer> values) {
            addCriterion("url_type_id not in", values, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("url_type_id between", value1, value2, "urlTypeId");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("url_type_id not between", value1, value2, "urlTypeId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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