package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class JurisdictiontwoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JurisdictiontwoExample() {
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

        public Criteria andJtwoidIsNull() {
            addCriterion("Jtwoid is null");
            return (Criteria) this;
        }

        public Criteria andJtwoidIsNotNull() {
            addCriterion("Jtwoid is not null");
            return (Criteria) this;
        }

        public Criteria andJtwoidEqualTo(Integer value) {
            addCriterion("Jtwoid =", value, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidNotEqualTo(Integer value) {
            addCriterion("Jtwoid <>", value, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidGreaterThan(Integer value) {
            addCriterion("Jtwoid >", value, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Jtwoid >=", value, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidLessThan(Integer value) {
            addCriterion("Jtwoid <", value, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidLessThanOrEqualTo(Integer value) {
            addCriterion("Jtwoid <=", value, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidIn(List<Integer> values) {
            addCriterion("Jtwoid in", values, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidNotIn(List<Integer> values) {
            addCriterion("Jtwoid not in", values, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidBetween(Integer value1, Integer value2) {
            addCriterion("Jtwoid between", value1, value2, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwoidNotBetween(Integer value1, Integer value2) {
            addCriterion("Jtwoid not between", value1, value2, "jtwoid");
            return (Criteria) this;
        }

        public Criteria andJtwonameIsNull() {
            addCriterion("Jtwoname is null");
            return (Criteria) this;
        }

        public Criteria andJtwonameIsNotNull() {
            addCriterion("Jtwoname is not null");
            return (Criteria) this;
        }

        public Criteria andJtwonameEqualTo(String value) {
            addCriterion("Jtwoname =", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameNotEqualTo(String value) {
            addCriterion("Jtwoname <>", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameGreaterThan(String value) {
            addCriterion("Jtwoname >", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameGreaterThanOrEqualTo(String value) {
            addCriterion("Jtwoname >=", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameLessThan(String value) {
            addCriterion("Jtwoname <", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameLessThanOrEqualTo(String value) {
            addCriterion("Jtwoname <=", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameLike(String value) {
            addCriterion("Jtwoname like", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameNotLike(String value) {
            addCriterion("Jtwoname not like", value, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameIn(List<String> values) {
            addCriterion("Jtwoname in", values, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameNotIn(List<String> values) {
            addCriterion("Jtwoname not in", values, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameBetween(String value1, String value2) {
            addCriterion("Jtwoname between", value1, value2, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJtwonameNotBetween(String value1, String value2) {
            addCriterion("Jtwoname not between", value1, value2, "jtwoname");
            return (Criteria) this;
        }

        public Criteria andJoneidIsNull() {
            addCriterion("Joneid is null");
            return (Criteria) this;
        }

        public Criteria andJoneidIsNotNull() {
            addCriterion("Joneid is not null");
            return (Criteria) this;
        }

        public Criteria andJoneidEqualTo(Integer value) {
            addCriterion("Joneid =", value, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidNotEqualTo(Integer value) {
            addCriterion("Joneid <>", value, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidGreaterThan(Integer value) {
            addCriterion("Joneid >", value, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Joneid >=", value, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidLessThan(Integer value) {
            addCriterion("Joneid <", value, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidLessThanOrEqualTo(Integer value) {
            addCriterion("Joneid <=", value, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidIn(List<Integer> values) {
            addCriterion("Joneid in", values, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidNotIn(List<Integer> values) {
            addCriterion("Joneid not in", values, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidBetween(Integer value1, Integer value2) {
            addCriterion("Joneid between", value1, value2, "joneid");
            return (Criteria) this;
        }

        public Criteria andJoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("Joneid not between", value1, value2, "joneid");
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