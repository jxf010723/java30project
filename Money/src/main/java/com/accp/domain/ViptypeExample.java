package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ViptypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViptypeExample() {
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

        public Criteria andViptypeIdIsNull() {
            addCriterion("vipType_id is null");
            return (Criteria) this;
        }

        public Criteria andViptypeIdIsNotNull() {
            addCriterion("vipType_id is not null");
            return (Criteria) this;
        }

        public Criteria andViptypeIdEqualTo(Integer value) {
            addCriterion("vipType_id =", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotEqualTo(Integer value) {
            addCriterion("vipType_id <>", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdGreaterThan(Integer value) {
            addCriterion("vipType_id >", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipType_id >=", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdLessThan(Integer value) {
            addCriterion("vipType_id <", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("vipType_id <=", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdIn(List<Integer> values) {
            addCriterion("vipType_id in", values, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotIn(List<Integer> values) {
            addCriterion("vipType_id not in", values, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdBetween(Integer value1, Integer value2) {
            addCriterion("vipType_id between", value1, value2, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vipType_id not between", value1, value2, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeNameIsNull() {
            addCriterion("vipType_name is null");
            return (Criteria) this;
        }

        public Criteria andViptypeNameIsNotNull() {
            addCriterion("vipType_name is not null");
            return (Criteria) this;
        }

        public Criteria andViptypeNameEqualTo(String value) {
            addCriterion("vipType_name =", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameNotEqualTo(String value) {
            addCriterion("vipType_name <>", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameGreaterThan(String value) {
            addCriterion("vipType_name >", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("vipType_name >=", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameLessThan(String value) {
            addCriterion("vipType_name <", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameLessThanOrEqualTo(String value) {
            addCriterion("vipType_name <=", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameLike(String value) {
            addCriterion("vipType_name like", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameNotLike(String value) {
            addCriterion("vipType_name not like", value, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameIn(List<String> values) {
            addCriterion("vipType_name in", values, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameNotIn(List<String> values) {
            addCriterion("vipType_name not in", values, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameBetween(String value1, String value2) {
            addCriterion("vipType_name between", value1, value2, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeNameNotBetween(String value1, String value2) {
            addCriterion("vipType_name not between", value1, value2, "viptypeName");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountIsNull() {
            addCriterion("vipType_discount is null");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountIsNotNull() {
            addCriterion("vipType_discount is not null");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountEqualTo(Double value) {
            addCriterion("vipType_discount =", value, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountNotEqualTo(Double value) {
            addCriterion("vipType_discount <>", value, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountGreaterThan(Double value) {
            addCriterion("vipType_discount >", value, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("vipType_discount >=", value, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountLessThan(Double value) {
            addCriterion("vipType_discount <", value, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountLessThanOrEqualTo(Double value) {
            addCriterion("vipType_discount <=", value, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountIn(List<Double> values) {
            addCriterion("vipType_discount in", values, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountNotIn(List<Double> values) {
            addCriterion("vipType_discount not in", values, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountBetween(Double value1, Double value2) {
            addCriterion("vipType_discount between", value1, value2, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andViptypeDiscountNotBetween(Double value1, Double value2) {
            addCriterion("vipType_discount not between", value1, value2, "viptypeDiscount");
            return (Criteria) this;
        }

        public Criteria andMoneylvIsNull() {
            addCriterion("moneyLv is null");
            return (Criteria) this;
        }

        public Criteria andMoneylvIsNotNull() {
            addCriterion("moneyLv is not null");
            return (Criteria) this;
        }

        public Criteria andMoneylvEqualTo(Double value) {
            addCriterion("moneyLv =", value, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvNotEqualTo(Double value) {
            addCriterion("moneyLv <>", value, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvGreaterThan(Double value) {
            addCriterion("moneyLv >", value, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvGreaterThanOrEqualTo(Double value) {
            addCriterion("moneyLv >=", value, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvLessThan(Double value) {
            addCriterion("moneyLv <", value, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvLessThanOrEqualTo(Double value) {
            addCriterion("moneyLv <=", value, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvIn(List<Double> values) {
            addCriterion("moneyLv in", values, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvNotIn(List<Double> values) {
            addCriterion("moneyLv not in", values, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvBetween(Double value1, Double value2) {
            addCriterion("moneyLv between", value1, value2, "moneylv");
            return (Criteria) this;
        }

        public Criteria andMoneylvNotBetween(Double value1, Double value2) {
            addCriterion("moneyLv not between", value1, value2, "moneylv");
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