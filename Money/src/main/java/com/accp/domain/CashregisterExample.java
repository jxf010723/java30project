package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CashregisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashregisterExample() {
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

        public Criteria andCashregisteridIsNull() {
            addCriterion("cashRegisterID is null");
            return (Criteria) this;
        }

        public Criteria andCashregisteridIsNotNull() {
            addCriterion("cashRegisterID is not null");
            return (Criteria) this;
        }

        public Criteria andCashregisteridEqualTo(Integer value) {
            addCriterion("cashRegisterID =", value, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridNotEqualTo(Integer value) {
            addCriterion("cashRegisterID <>", value, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridGreaterThan(Integer value) {
            addCriterion("cashRegisterID >", value, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashRegisterID >=", value, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridLessThan(Integer value) {
            addCriterion("cashRegisterID <", value, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridLessThanOrEqualTo(Integer value) {
            addCriterion("cashRegisterID <=", value, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridIn(List<Integer> values) {
            addCriterion("cashRegisterID in", values, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridNotIn(List<Integer> values) {
            addCriterion("cashRegisterID not in", values, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridBetween(Integer value1, Integer value2) {
            addCriterion("cashRegisterID between", value1, value2, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCashregisteridNotBetween(Integer value1, Integer value2) {
            addCriterion("cashRegisterID not between", value1, value2, "cashregisterid");
            return (Criteria) this;
        }

        public Criteria andCommodityimgIsNull() {
            addCriterion("commodityIMG is null");
            return (Criteria) this;
        }

        public Criteria andCommodityimgIsNotNull() {
            addCriterion("commodityIMG is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityimgEqualTo(String value) {
            addCriterion("commodityIMG =", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgNotEqualTo(String value) {
            addCriterion("commodityIMG <>", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgGreaterThan(String value) {
            addCriterion("commodityIMG >", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgGreaterThanOrEqualTo(String value) {
            addCriterion("commodityIMG >=", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgLessThan(String value) {
            addCriterion("commodityIMG <", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgLessThanOrEqualTo(String value) {
            addCriterion("commodityIMG <=", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgLike(String value) {
            addCriterion("commodityIMG like", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgNotLike(String value) {
            addCriterion("commodityIMG not like", value, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgIn(List<String> values) {
            addCriterion("commodityIMG in", values, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgNotIn(List<String> values) {
            addCriterion("commodityIMG not in", values, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgBetween(String value1, String value2) {
            addCriterion("commodityIMG between", value1, value2, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommodityimgNotBetween(String value1, String value2) {
            addCriterion("commodityIMG not between", value1, value2, "commodityimg");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNull() {
            addCriterion("commodityName is null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNotNull() {
            addCriterion("commodityName is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameEqualTo(String value) {
            addCriterion("commodityName =", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotEqualTo(String value) {
            addCriterion("commodityName <>", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThan(String value) {
            addCriterion("commodityName >", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThanOrEqualTo(String value) {
            addCriterion("commodityName >=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThan(String value) {
            addCriterion("commodityName <", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThanOrEqualTo(String value) {
            addCriterion("commodityName <=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLike(String value) {
            addCriterion("commodityName like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotLike(String value) {
            addCriterion("commodityName not like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIn(List<String> values) {
            addCriterion("commodityName in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotIn(List<String> values) {
            addCriterion("commodityName not in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameBetween(String value1, String value2) {
            addCriterion("commodityName between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotBetween(String value1, String value2) {
            addCriterion("commodityName not between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andMoneyamtIsNull() {
            addCriterion("moneyamt is null");
            return (Criteria) this;
        }

        public Criteria andMoneyamtIsNotNull() {
            addCriterion("moneyamt is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyamtEqualTo(Double value) {
            addCriterion("moneyamt =", value, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtNotEqualTo(Double value) {
            addCriterion("moneyamt <>", value, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtGreaterThan(Double value) {
            addCriterion("moneyamt >", value, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtGreaterThanOrEqualTo(Double value) {
            addCriterion("moneyamt >=", value, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtLessThan(Double value) {
            addCriterion("moneyamt <", value, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtLessThanOrEqualTo(Double value) {
            addCriterion("moneyamt <=", value, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtIn(List<Double> values) {
            addCriterion("moneyamt in", values, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtNotIn(List<Double> values) {
            addCriterion("moneyamt not in", values, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtBetween(Double value1, Double value2) {
            addCriterion("moneyamt between", value1, value2, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andMoneyamtNotBetween(Double value1, Double value2) {
            addCriterion("moneyamt not between", value1, value2, "moneyamt");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopID is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopID is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopID =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopID <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopID >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopID >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopID <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopID <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopID in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopID not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopID between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopID not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPaycountIsNull() {
            addCriterion("payCount is null");
            return (Criteria) this;
        }

        public Criteria andPaycountIsNotNull() {
            addCriterion("payCount is not null");
            return (Criteria) this;
        }

        public Criteria andPaycountEqualTo(Integer value) {
            addCriterion("payCount =", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotEqualTo(Integer value) {
            addCriterion("payCount <>", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountGreaterThan(Integer value) {
            addCriterion("payCount >", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("payCount >=", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountLessThan(Integer value) {
            addCriterion("payCount <", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountLessThanOrEqualTo(Integer value) {
            addCriterion("payCount <=", value, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountIn(List<Integer> values) {
            addCriterion("payCount in", values, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotIn(List<Integer> values) {
            addCriterion("payCount not in", values, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountBetween(Integer value1, Integer value2) {
            addCriterion("payCount between", value1, value2, "paycount");
            return (Criteria) this;
        }

        public Criteria andPaycountNotBetween(Integer value1, Integer value2) {
            addCriterion("payCount not between", value1, value2, "paycount");
            return (Criteria) this;
        }

        public Criteria andCashregisternameIsNull() {
            addCriterion("cashRegisterName is null");
            return (Criteria) this;
        }

        public Criteria andCashregisternameIsNotNull() {
            addCriterion("cashRegisterName is not null");
            return (Criteria) this;
        }

        public Criteria andCashregisternameEqualTo(String value) {
            addCriterion("cashRegisterName =", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameNotEqualTo(String value) {
            addCriterion("cashRegisterName <>", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameGreaterThan(String value) {
            addCriterion("cashRegisterName >", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameGreaterThanOrEqualTo(String value) {
            addCriterion("cashRegisterName >=", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameLessThan(String value) {
            addCriterion("cashRegisterName <", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameLessThanOrEqualTo(String value) {
            addCriterion("cashRegisterName <=", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameLike(String value) {
            addCriterion("cashRegisterName like", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameNotLike(String value) {
            addCriterion("cashRegisterName not like", value, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameIn(List<String> values) {
            addCriterion("cashRegisterName in", values, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameNotIn(List<String> values) {
            addCriterion("cashRegisterName not in", values, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameBetween(String value1, String value2) {
            addCriterion("cashRegisterName between", value1, value2, "cashregistername");
            return (Criteria) this;
        }

        public Criteria andCashregisternameNotBetween(String value1, String value2) {
            addCriterion("cashRegisterName not between", value1, value2, "cashregistername");
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