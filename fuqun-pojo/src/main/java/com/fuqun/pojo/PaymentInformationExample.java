package com.fuqun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentInformationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("Order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("Order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("Order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("Order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("Order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("Order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("Order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("Order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("Order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("Order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("Order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("Order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("Order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("Order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIsNull() {
            addCriterion("Pay_platform is null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIsNotNull() {
            addCriterion("Pay_platform is not null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformEqualTo(String value) {
            addCriterion("Pay_platform =", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformNotEqualTo(String value) {
            addCriterion("Pay_platform <>", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformGreaterThan(String value) {
            addCriterion("Pay_platform >", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_platform >=", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformLessThan(String value) {
            addCriterion("Pay_platform <", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformLessThanOrEqualTo(String value) {
            addCriterion("Pay_platform <=", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformLike(String value) {
            addCriterion("Pay_platform like", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformNotLike(String value) {
            addCriterion("Pay_platform not like", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIn(List<String> values) {
            addCriterion("Pay_platform in", values, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformNotIn(List<String> values) {
            addCriterion("Pay_platform not in", values, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformBetween(String value1, String value2) {
            addCriterion("Pay_platform between", value1, value2, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformNotBetween(String value1, String value2) {
            addCriterion("Pay_platform not between", value1, value2, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberIsNull() {
            addCriterion("platform_number is null");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberIsNotNull() {
            addCriterion("platform_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberEqualTo(String value) {
            addCriterion("platform_number =", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberNotEqualTo(String value) {
            addCriterion("platform_number <>", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberGreaterThan(String value) {
            addCriterion("platform_number >", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberGreaterThanOrEqualTo(String value) {
            addCriterion("platform_number >=", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberLessThan(String value) {
            addCriterion("platform_number <", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberLessThanOrEqualTo(String value) {
            addCriterion("platform_number <=", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberLike(String value) {
            addCriterion("platform_number like", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberNotLike(String value) {
            addCriterion("platform_number not like", value, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberIn(List<String> values) {
            addCriterion("platform_number in", values, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberNotIn(List<String> values) {
            addCriterion("platform_number not in", values, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberBetween(String value1, String value2) {
            addCriterion("platform_number between", value1, value2, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformNumberNotBetween(String value1, String value2) {
            addCriterion("platform_number not between", value1, value2, "platformNumber");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusIsNull() {
            addCriterion("platform_statuus is null");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusIsNotNull() {
            addCriterion("platform_statuus is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusEqualTo(String value) {
            addCriterion("platform_statuus =", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusNotEqualTo(String value) {
            addCriterion("platform_statuus <>", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusGreaterThan(String value) {
            addCriterion("platform_statuus >", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusGreaterThanOrEqualTo(String value) {
            addCriterion("platform_statuus >=", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusLessThan(String value) {
            addCriterion("platform_statuus <", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusLessThanOrEqualTo(String value) {
            addCriterion("platform_statuus <=", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusLike(String value) {
            addCriterion("platform_statuus like", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusNotLike(String value) {
            addCriterion("platform_statuus not like", value, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusIn(List<String> values) {
            addCriterion("platform_statuus in", values, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusNotIn(List<String> values) {
            addCriterion("platform_statuus not in", values, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusBetween(String value1, String value2) {
            addCriterion("platform_statuus between", value1, value2, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andPlatformStatuusNotBetween(String value1, String value2) {
            addCriterion("platform_statuus not between", value1, value2, "platformStatuus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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