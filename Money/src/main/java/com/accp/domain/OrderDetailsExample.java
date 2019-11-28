package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailsExample() {
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

        public Criteria andOrderDetailsIdIsNull() {
            addCriterion("order_details_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdIsNotNull() {
            addCriterion("order_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdEqualTo(Integer value) {
            addCriterion("order_details_id =", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotEqualTo(Integer value) {
            addCriterion("order_details_id <>", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdGreaterThan(Integer value) {
            addCriterion("order_details_id >", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_details_id >=", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdLessThan(Integer value) {
            addCriterion("order_details_id <", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_details_id <=", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdIn(List<Integer> values) {
            addCriterion("order_details_id in", values, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotIn(List<Integer> values) {
            addCriterion("order_details_id not in", values, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("order_details_id between", value1, value2, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_details_id not between", value1, value2, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andgdidIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andgdidIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andgdidEqualTo(Integer value) {
            addCriterion("goods_id =", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidLessThan(Integer value) {
            addCriterion("goods_id <", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidIn(List<Integer> values) {
            addCriterion("goods_id in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andgdidNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Double value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Double value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Double value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Double value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Double> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Double> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Double value1, Double value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountIsNull() {
            addCriterion("order_details_discount is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountIsNotNull() {
            addCriterion("order_details_discount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountEqualTo(Double value) {
            addCriterion("order_details_discount =", value, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountNotEqualTo(Double value) {
            addCriterion("order_details_discount <>", value, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountGreaterThan(Double value) {
            addCriterion("order_details_discount >", value, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("order_details_discount >=", value, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountLessThan(Double value) {
            addCriterion("order_details_discount <", value, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountLessThanOrEqualTo(Double value) {
            addCriterion("order_details_discount <=", value, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountIn(List<Double> values) {
            addCriterion("order_details_discount in", values, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountNotIn(List<Double> values) {
            addCriterion("order_details_discount not in", values, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountBetween(Double value1, Double value2) {
            addCriterion("order_details_discount between", value1, value2, "orderDetailsDiscount");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsDiscountNotBetween(Double value1, Double value2) {
            addCriterion("order_details_discount not between", value1, value2, "orderDetailsDiscount");
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