package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorExample() {
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

        public Criteria andColoridIsNull() {
            addCriterion("colorid is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("colorid is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Integer value) {
            addCriterion("colorid =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Integer value) {
            addCriterion("colorid <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Integer value) {
            addCriterion("colorid >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("colorid >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Integer value) {
            addCriterion("colorid <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Integer value) {
            addCriterion("colorid <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Integer> values) {
            addCriterion("colorid in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Integer> values) {
            addCriterion("colorid not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Integer value1, Integer value2) {
            addCriterion("colorid between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Integer value1, Integer value2) {
            addCriterion("colorid not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andSeriesidIsNull() {
            addCriterion("seriesid is null");
            return (Criteria) this;
        }

        public Criteria andSeriesidIsNotNull() {
            addCriterion("seriesid is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesidEqualTo(Integer value) {
            addCriterion("seriesid =", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotEqualTo(Integer value) {
            addCriterion("seriesid <>", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThan(Integer value) {
            addCriterion("seriesid >", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seriesid >=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThan(Integer value) {
            addCriterion("seriesid <", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThanOrEqualTo(Integer value) {
            addCriterion("seriesid <=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidIn(List<Integer> values) {
            addCriterion("seriesid in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotIn(List<Integer> values) {
            addCriterion("seriesid not in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidBetween(Integer value1, Integer value2) {
            addCriterion("seriesid between", value1, value2, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotBetween(Integer value1, Integer value2) {
            addCriterion("seriesid not between", value1, value2, "seriesid");
            return (Criteria) this;
        }

        public Criteria andColornameIsNull() {
            addCriterion("colorname is null");
            return (Criteria) this;
        }

        public Criteria andColornameIsNotNull() {
            addCriterion("colorname is not null");
            return (Criteria) this;
        }

        public Criteria andColornameEqualTo(String value) {
            addCriterion("colorname =", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotEqualTo(String value) {
            addCriterion("colorname <>", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThan(String value) {
            addCriterion("colorname >", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThanOrEqualTo(String value) {
            addCriterion("colorname >=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThan(String value) {
            addCriterion("colorname <", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThanOrEqualTo(String value) {
            addCriterion("colorname <=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLike(String value) {
            addCriterion("colorname like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotLike(String value) {
            addCriterion("colorname not like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameIn(List<String> values) {
            addCriterion("colorname in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotIn(List<String> values) {
            addCriterion("colorname not in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameBetween(String value1, String value2) {
            addCriterion("colorname between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotBetween(String value1, String value2) {
            addCriterion("colorname not between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColorphotoIsNull() {
            addCriterion("colorphoto is null");
            return (Criteria) this;
        }

        public Criteria andColorphotoIsNotNull() {
            addCriterion("colorphoto is not null");
            return (Criteria) this;
        }

        public Criteria andColorphotoEqualTo(String value) {
            addCriterion("colorphoto =", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoNotEqualTo(String value) {
            addCriterion("colorphoto <>", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoGreaterThan(String value) {
            addCriterion("colorphoto >", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoGreaterThanOrEqualTo(String value) {
            addCriterion("colorphoto >=", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoLessThan(String value) {
            addCriterion("colorphoto <", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoLessThanOrEqualTo(String value) {
            addCriterion("colorphoto <=", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoLike(String value) {
            addCriterion("colorphoto like", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoNotLike(String value) {
            addCriterion("colorphoto not like", value, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoIn(List<String> values) {
            addCriterion("colorphoto in", values, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoNotIn(List<String> values) {
            addCriterion("colorphoto not in", values, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoBetween(String value1, String value2) {
            addCriterion("colorphoto between", value1, value2, "colorphoto");
            return (Criteria) this;
        }

        public Criteria andColorphotoNotBetween(String value1, String value2) {
            addCriterion("colorphoto not between", value1, value2, "colorphoto");
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