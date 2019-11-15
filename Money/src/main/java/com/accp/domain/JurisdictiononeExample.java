package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class JurisdictiononeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JurisdictiononeExample() {
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

        public Criteria andJonenameIsNull() {
            addCriterion("Jonename is null");
            return (Criteria) this;
        }

        public Criteria andJonenameIsNotNull() {
            addCriterion("Jonename is not null");
            return (Criteria) this;
        }

        public Criteria andJonenameEqualTo(String value) {
            addCriterion("Jonename =", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameNotEqualTo(String value) {
            addCriterion("Jonename <>", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameGreaterThan(String value) {
            addCriterion("Jonename >", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameGreaterThanOrEqualTo(String value) {
            addCriterion("Jonename >=", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameLessThan(String value) {
            addCriterion("Jonename <", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameLessThanOrEqualTo(String value) {
            addCriterion("Jonename <=", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameLike(String value) {
            addCriterion("Jonename like", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameNotLike(String value) {
            addCriterion("Jonename not like", value, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameIn(List<String> values) {
            addCriterion("Jonename in", values, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameNotIn(List<String> values) {
            addCriterion("Jonename not in", values, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameBetween(String value1, String value2) {
            addCriterion("Jonename between", value1, value2, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonenameNotBetween(String value1, String value2) {
            addCriterion("Jonename not between", value1, value2, "jonename");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionIsNull() {
            addCriterion("Jonejurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionIsNotNull() {
            addCriterion("Jonejurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionEqualTo(Integer value) {
            addCriterion("Jonejurisdiction =", value, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionNotEqualTo(Integer value) {
            addCriterion("Jonejurisdiction <>", value, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionGreaterThan(Integer value) {
            addCriterion("Jonejurisdiction >", value, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Jonejurisdiction >=", value, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionLessThan(Integer value) {
            addCriterion("Jonejurisdiction <", value, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionLessThanOrEqualTo(Integer value) {
            addCriterion("Jonejurisdiction <=", value, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionIn(List<Integer> values) {
            addCriterion("Jonejurisdiction in", values, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionNotIn(List<Integer> values) {
            addCriterion("Jonejurisdiction not in", values, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionBetween(Integer value1, Integer value2) {
            addCriterion("Jonejurisdiction between", value1, value2, "jonejurisdiction");
            return (Criteria) this;
        }

        public Criteria andJonejurisdictionNotBetween(Integer value1, Integer value2) {
            addCriterion("Jonejurisdiction not between", value1, value2, "jonejurisdiction");
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