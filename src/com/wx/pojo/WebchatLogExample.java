package com.wx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebchatLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebchatLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNull() {
            addCriterion("log_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNotNull() {
            addCriterion("log_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogIpEqualTo(String value) {
            addCriterion("log_ip =", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotEqualTo(String value) {
            addCriterion("log_ip <>", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThan(String value) {
            addCriterion("log_ip >", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("log_ip >=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThan(String value) {
            addCriterion("log_ip <", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThanOrEqualTo(String value) {
            addCriterion("log_ip <=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLike(String value) {
            addCriterion("log_ip like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotLike(String value) {
            addCriterion("log_ip not like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpIn(List<String> values) {
            addCriterion("log_ip in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotIn(List<String> values) {
            addCriterion("log_ip not in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpBetween(String value1, String value2) {
            addCriterion("log_ip between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotBetween(String value1, String value2) {
            addCriterion("log_ip not between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNull() {
            addCriterion("log_url is null");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNotNull() {
            addCriterion("log_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogUrlEqualTo(String value) {
            addCriterion("log_url =", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotEqualTo(String value) {
            addCriterion("log_url <>", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThan(String value) {
            addCriterion("log_url >", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThanOrEqualTo(String value) {
            addCriterion("log_url >=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThan(String value) {
            addCriterion("log_url <", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThanOrEqualTo(String value) {
            addCriterion("log_url <=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLike(String value) {
            addCriterion("log_url like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotLike(String value) {
            addCriterion("log_url not like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlIn(List<String> values) {
            addCriterion("log_url in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotIn(List<String> values) {
            addCriterion("log_url not in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlBetween(String value1, String value2) {
            addCriterion("log_url between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotBetween(String value1, String value2) {
            addCriterion("log_url not between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogDescIsNull() {
            addCriterion("log_desc is null");
            return (Criteria) this;
        }

        public Criteria andLogDescIsNotNull() {
            addCriterion("log_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLogDescEqualTo(String value) {
            addCriterion("log_desc =", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotEqualTo(String value) {
            addCriterion("log_desc <>", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescGreaterThan(String value) {
            addCriterion("log_desc >", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescGreaterThanOrEqualTo(String value) {
            addCriterion("log_desc >=", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescLessThan(String value) {
            addCriterion("log_desc <", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescLessThanOrEqualTo(String value) {
            addCriterion("log_desc <=", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescLike(String value) {
            addCriterion("log_desc like", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotLike(String value) {
            addCriterion("log_desc not like", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescIn(List<String> values) {
            addCriterion("log_desc in", values, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotIn(List<String> values) {
            addCriterion("log_desc not in", values, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescBetween(String value1, String value2) {
            addCriterion("log_desc between", value1, value2, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotBetween(String value1, String value2) {
            addCriterion("log_desc not between", value1, value2, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("log_time =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("log_time <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("log_time >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_time >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("log_time <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("log_time <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("log_time in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("log_time not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("log_time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("log_time not between", value1, value2, "logTime");
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