package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsizeExample() {
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

        public Criteria andGoodsizeidIsNull() {
            addCriterion("goodsizeid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidIsNotNull() {
            addCriterion("goodsizeid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidEqualTo(Integer value) {
            addCriterion("goodsizeid =", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidNotEqualTo(Integer value) {
            addCriterion("goodsizeid <>", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidGreaterThan(Integer value) {
            addCriterion("goodsizeid >", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsizeid >=", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidLessThan(Integer value) {
            addCriterion("goodsizeid <", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsizeid <=", value, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidIn(List<Integer> values) {
            addCriterion("goodsizeid in", values, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidNotIn(List<Integer> values) {
            addCriterion("goodsizeid not in", values, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidBetween(Integer value1, Integer value2) {
            addCriterion("goodsizeid between", value1, value2, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsizeid not between", value1, value2, "goodsizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsizeIsNull() {
            addCriterion("goodsize is null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeIsNotNull() {
            addCriterion("goodsize is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeEqualTo(String value) {
            addCriterion("goodsize =", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeNotEqualTo(String value) {
            addCriterion("goodsize <>", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeGreaterThan(String value) {
            addCriterion("goodsize >", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeGreaterThanOrEqualTo(String value) {
            addCriterion("goodsize >=", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeLessThan(String value) {
            addCriterion("goodsize <", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeLessThanOrEqualTo(String value) {
            addCriterion("goodsize <=", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeLike(String value) {
            addCriterion("goodsize like", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeNotLike(String value) {
            addCriterion("goodsize not like", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeIn(List<String> values) {
            addCriterion("goodsize in", values, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeNotIn(List<String> values) {
            addCriterion("goodsize not in", values, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeBetween(String value1, String value2) {
            addCriterion("goodsize between", value1, value2, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeNotBetween(String value1, String value2) {
            addCriterion("goodsize not between", value1, value2, "goodsize");
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