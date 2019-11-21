package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andgdidIsNull() {
            addCriterion("gdid is null");
            return (Criteria) this;
        }

        public Criteria andgdidIsNotNull() {
            addCriterion("gdid is not null");
            return (Criteria) this;
        }

        public Criteria andgdidEqualTo(Integer value) {
            addCriterion("gdid =", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidNotEqualTo(Integer value) {
            addCriterion("gdid <>", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidGreaterThan(Integer value) {
            addCriterion("gdid >", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdid >=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidLessThan(Integer value) {
            addCriterion("gdid <", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidLessThanOrEqualTo(Integer value) {
            addCriterion("gdid <=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidIn(List<Integer> values) {
            addCriterion("gdid in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidNotIn(List<Integer> values) {
            addCriterion("gdid not in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidBetween(Integer value1, Integer value2) {
            addCriterion("gdid between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidNotBetween(Integer value1, Integer value2) {
            addCriterion("gdid not between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyIsNull() {
            addCriterion("order_totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyIsNotNull() {
            addCriterion("order_totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyEqualTo(Double value) {
            addCriterion("order_totalMoney =", value, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyNotEqualTo(Double value) {
            addCriterion("order_totalMoney <>", value, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyGreaterThan(Double value) {
            addCriterion("order_totalMoney >", value, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("order_totalMoney >=", value, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyLessThan(Double value) {
            addCriterion("order_totalMoney <", value, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("order_totalMoney <=", value, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyIn(List<Double> values) {
            addCriterion("order_totalMoney in", values, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyNotIn(List<Double> values) {
            addCriterion("order_totalMoney not in", values, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("order_totalMoney between", value1, value2, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("order_totalMoney not between", value1, value2, "orderTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyIsNull() {
            addCriterion("order_sfMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyIsNotNull() {
            addCriterion("order_sfMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyEqualTo(Double value) {
            addCriterion("order_sfMoney =", value, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyNotEqualTo(Double value) {
            addCriterion("order_sfMoney <>", value, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyGreaterThan(Double value) {
            addCriterion("order_sfMoney >", value, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("order_sfMoney >=", value, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyLessThan(Double value) {
            addCriterion("order_sfMoney <", value, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyLessThanOrEqualTo(Double value) {
            addCriterion("order_sfMoney <=", value, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyIn(List<Double> values) {
            addCriterion("order_sfMoney in", values, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyNotIn(List<Double> values) {
            addCriterion("order_sfMoney not in", values, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyBetween(Double value1, Double value2) {
            addCriterion("order_sfMoney between", value1, value2, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSfmoneyNotBetween(Double value1, Double value2) {
            addCriterion("order_sfMoney not between", value1, value2, "orderSfmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyIsNull() {
            addCriterion("Integral_deductionMoney is null");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyIsNotNull() {
            addCriterion("Integral_deductionMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyEqualTo(Double value) {
            addCriterion("Integral_deductionMoney =", value, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyNotEqualTo(Double value) {
            addCriterion("Integral_deductionMoney <>", value, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyGreaterThan(Double value) {
            addCriterion("Integral_deductionMoney >", value, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Integral_deductionMoney >=", value, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyLessThan(Double value) {
            addCriterion("Integral_deductionMoney <", value, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyLessThanOrEqualTo(Double value) {
            addCriterion("Integral_deductionMoney <=", value, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyIn(List<Double> values) {
            addCriterion("Integral_deductionMoney in", values, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyNotIn(List<Double> values) {
            addCriterion("Integral_deductionMoney not in", values, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyBetween(Double value1, Double value2) {
            addCriterion("Integral_deductionMoney between", value1, value2, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andIntegralDeductionmoneyNotBetween(Double value1, Double value2) {
            addCriterion("Integral_deductionMoney not between", value1, value2, "integralDeductionmoney");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterionForJDBCDate("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterionForJDBCDate("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterionForJDBCDate("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterionForJDBCDate("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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