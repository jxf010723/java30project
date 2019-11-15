package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RechargeDeductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeDeductionExample() {
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

        public Criteria andRdidIsNull() {
            addCriterion("rdid is null");
            return (Criteria) this;
        }

        public Criteria andRdidIsNotNull() {
            addCriterion("rdid is not null");
            return (Criteria) this;
        }

        public Criteria andRdidEqualTo(Integer value) {
            addCriterion("rdid =", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidNotEqualTo(Integer value) {
            addCriterion("rdid <>", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidGreaterThan(Integer value) {
            addCriterion("rdid >", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rdid >=", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidLessThan(Integer value) {
            addCriterion("rdid <", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidLessThanOrEqualTo(Integer value) {
            addCriterion("rdid <=", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidIn(List<Integer> values) {
            addCriterion("rdid in", values, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidNotIn(List<Integer> values) {
            addCriterion("rdid not in", values, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidBetween(Integer value1, Integer value2) {
            addCriterion("rdid between", value1, value2, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidNotBetween(Integer value1, Integer value2) {
            addCriterion("rdid not between", value1, value2, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdDateIsNull() {
            addCriterion("rd_date is null");
            return (Criteria) this;
        }

        public Criteria andRdDateIsNotNull() {
            addCriterion("rd_date is not null");
            return (Criteria) this;
        }

        public Criteria andRdDateEqualTo(Date value) {
            addCriterionForJDBCDate("rd_date =", value, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rd_date <>", value, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rd_date >", value, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rd_date >=", value, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateLessThan(Date value) {
            addCriterionForJDBCDate("rd_date <", value, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rd_date <=", value, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateIn(List<Date> values) {
            addCriterionForJDBCDate("rd_date in", values, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rd_date not in", values, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rd_date between", value1, value2, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rd_date not between", value1, value2, "rdDate");
            return (Criteria) this;
        }

        public Criteria andRdVxidIsNull() {
            addCriterion("rd_vxid is null");
            return (Criteria) this;
        }

        public Criteria andRdVxidIsNotNull() {
            addCriterion("rd_vxid is not null");
            return (Criteria) this;
        }

        public Criteria andRdVxidEqualTo(String value) {
            addCriterion("rd_vxid =", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidNotEqualTo(String value) {
            addCriterion("rd_vxid <>", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidGreaterThan(String value) {
            addCriterion("rd_vxid >", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidGreaterThanOrEqualTo(String value) {
            addCriterion("rd_vxid >=", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidLessThan(String value) {
            addCriterion("rd_vxid <", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidLessThanOrEqualTo(String value) {
            addCriterion("rd_vxid <=", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidLike(String value) {
            addCriterion("rd_vxid like", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidNotLike(String value) {
            addCriterion("rd_vxid not like", value, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidIn(List<String> values) {
            addCriterion("rd_vxid in", values, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidNotIn(List<String> values) {
            addCriterion("rd_vxid not in", values, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidBetween(String value1, String value2) {
            addCriterion("rd_vxid between", value1, value2, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdVxidNotBetween(String value1, String value2) {
            addCriterion("rd_vxid not between", value1, value2, "rdVxid");
            return (Criteria) this;
        }

        public Criteria andRdNameIsNull() {
            addCriterion("rd_name is null");
            return (Criteria) this;
        }

        public Criteria andRdNameIsNotNull() {
            addCriterion("rd_name is not null");
            return (Criteria) this;
        }

        public Criteria andRdNameEqualTo(String value) {
            addCriterion("rd_name =", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameNotEqualTo(String value) {
            addCriterion("rd_name <>", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameGreaterThan(String value) {
            addCriterion("rd_name >", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameGreaterThanOrEqualTo(String value) {
            addCriterion("rd_name >=", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameLessThan(String value) {
            addCriterion("rd_name <", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameLessThanOrEqualTo(String value) {
            addCriterion("rd_name <=", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameLike(String value) {
            addCriterion("rd_name like", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameNotLike(String value) {
            addCriterion("rd_name not like", value, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameIn(List<String> values) {
            addCriterion("rd_name in", values, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameNotIn(List<String> values) {
            addCriterion("rd_name not in", values, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameBetween(String value1, String value2) {
            addCriterion("rd_name between", value1, value2, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdNameNotBetween(String value1, String value2) {
            addCriterion("rd_name not between", value1, value2, "rdName");
            return (Criteria) this;
        }

        public Criteria andRdPhoneIsNull() {
            addCriterion("rd_phone is null");
            return (Criteria) this;
        }

        public Criteria andRdPhoneIsNotNull() {
            addCriterion("rd_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRdPhoneEqualTo(Integer value) {
            addCriterion("rd_phone =", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneNotEqualTo(Integer value) {
            addCriterion("rd_phone <>", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneGreaterThan(Integer value) {
            addCriterion("rd_phone >", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("rd_phone >=", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneLessThan(Integer value) {
            addCriterion("rd_phone <", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("rd_phone <=", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneIn(List<Integer> values) {
            addCriterion("rd_phone in", values, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneNotIn(List<Integer> values) {
            addCriterion("rd_phone not in", values, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneBetween(Integer value1, Integer value2) {
            addCriterion("rd_phone between", value1, value2, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("rd_phone not between", value1, value2, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdRechargeIsNull() {
            addCriterion("rd_recharge is null");
            return (Criteria) this;
        }

        public Criteria andRdRechargeIsNotNull() {
            addCriterion("rd_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andRdRechargeEqualTo(Integer value) {
            addCriterion("rd_recharge =", value, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeNotEqualTo(Integer value) {
            addCriterion("rd_recharge <>", value, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeGreaterThan(Integer value) {
            addCriterion("rd_recharge >", value, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rd_recharge >=", value, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeLessThan(Integer value) {
            addCriterion("rd_recharge <", value, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeLessThanOrEqualTo(Integer value) {
            addCriterion("rd_recharge <=", value, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeIn(List<Integer> values) {
            addCriterion("rd_recharge in", values, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeNotIn(List<Integer> values) {
            addCriterion("rd_recharge not in", values, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeBetween(Integer value1, Integer value2) {
            addCriterion("rd_recharge between", value1, value2, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdRechargeNotBetween(Integer value1, Integer value2) {
            addCriterion("rd_recharge not between", value1, value2, "rdRecharge");
            return (Criteria) this;
        }

        public Criteria andRdPresentationIsNull() {
            addCriterion("rd_presentation is null");
            return (Criteria) this;
        }

        public Criteria andRdPresentationIsNotNull() {
            addCriterion("rd_presentation is not null");
            return (Criteria) this;
        }

        public Criteria andRdPresentationEqualTo(Integer value) {
            addCriterion("rd_presentation =", value, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationNotEqualTo(Integer value) {
            addCriterion("rd_presentation <>", value, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationGreaterThan(Integer value) {
            addCriterion("rd_presentation >", value, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationGreaterThanOrEqualTo(Integer value) {
            addCriterion("rd_presentation >=", value, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationLessThan(Integer value) {
            addCriterion("rd_presentation <", value, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationLessThanOrEqualTo(Integer value) {
            addCriterion("rd_presentation <=", value, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationIn(List<Integer> values) {
            addCriterion("rd_presentation in", values, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationNotIn(List<Integer> values) {
            addCriterion("rd_presentation not in", values, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationBetween(Integer value1, Integer value2) {
            addCriterion("rd_presentation between", value1, value2, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdPresentationNotBetween(Integer value1, Integer value2) {
            addCriterion("rd_presentation not between", value1, value2, "rdPresentation");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureIsNull() {
            addCriterion("rd_expenditure is null");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureIsNotNull() {
            addCriterion("rd_expenditure is not null");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureEqualTo(Double value) {
            addCriterion("rd_expenditure =", value, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureNotEqualTo(Double value) {
            addCriterion("rd_expenditure <>", value, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureGreaterThan(Double value) {
            addCriterion("rd_expenditure >", value, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureGreaterThanOrEqualTo(Double value) {
            addCriterion("rd_expenditure >=", value, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureLessThan(Double value) {
            addCriterion("rd_expenditure <", value, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureLessThanOrEqualTo(Double value) {
            addCriterion("rd_expenditure <=", value, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureIn(List<Double> values) {
            addCriterion("rd_expenditure in", values, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureNotIn(List<Double> values) {
            addCriterion("rd_expenditure not in", values, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureBetween(Double value1, Double value2) {
            addCriterion("rd_expenditure between", value1, value2, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdExpenditureNotBetween(Double value1, Double value2) {
            addCriterion("rd_expenditure not between", value1, value2, "rdExpenditure");
            return (Criteria) this;
        }

        public Criteria andRdBalanceIsNull() {
            addCriterion("rd_balance is null");
            return (Criteria) this;
        }

        public Criteria andRdBalanceIsNotNull() {
            addCriterion("rd_balance is not null");
            return (Criteria) this;
        }

        public Criteria andRdBalanceEqualTo(Double value) {
            addCriterion("rd_balance =", value, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceNotEqualTo(Double value) {
            addCriterion("rd_balance <>", value, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceGreaterThan(Double value) {
            addCriterion("rd_balance >", value, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("rd_balance >=", value, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceLessThan(Double value) {
            addCriterion("rd_balance <", value, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceLessThanOrEqualTo(Double value) {
            addCriterion("rd_balance <=", value, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceIn(List<Double> values) {
            addCriterion("rd_balance in", values, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceNotIn(List<Double> values) {
            addCriterion("rd_balance not in", values, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceBetween(Double value1, Double value2) {
            addCriterion("rd_balance between", value1, value2, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdBalanceNotBetween(Double value1, Double value2) {
            addCriterion("rd_balance not between", value1, value2, "rdBalance");
            return (Criteria) this;
        }

        public Criteria andRdRemarkIsNull() {
            addCriterion("rd_remark is null");
            return (Criteria) this;
        }

        public Criteria andRdRemarkIsNotNull() {
            addCriterion("rd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRdRemarkEqualTo(String value) {
            addCriterion("rd_remark =", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotEqualTo(String value) {
            addCriterion("rd_remark <>", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkGreaterThan(String value) {
            addCriterion("rd_remark >", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("rd_remark >=", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkLessThan(String value) {
            addCriterion("rd_remark <", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkLessThanOrEqualTo(String value) {
            addCriterion("rd_remark <=", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkLike(String value) {
            addCriterion("rd_remark like", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotLike(String value) {
            addCriterion("rd_remark not like", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkIn(List<String> values) {
            addCriterion("rd_remark in", values, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotIn(List<String> values) {
            addCriterion("rd_remark not in", values, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkBetween(String value1, String value2) {
            addCriterion("rd_remark between", value1, value2, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotBetween(String value1, String value2) {
            addCriterion("rd_remark not between", value1, value2, "rdRemark");
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