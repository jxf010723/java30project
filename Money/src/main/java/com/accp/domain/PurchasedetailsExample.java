package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PurchasedetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchasedetailsExample() {
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

        public Criteria andPurchasedetailsidIsNull() {
            addCriterion("purchasedetailsid is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidIsNotNull() {
            addCriterion("purchasedetailsid is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidEqualTo(Integer value) {
            addCriterion("purchasedetailsid =", value, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidNotEqualTo(Integer value) {
            addCriterion("purchasedetailsid <>", value, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidGreaterThan(Integer value) {
            addCriterion("purchasedetailsid >", value, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchasedetailsid >=", value, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidLessThan(Integer value) {
            addCriterion("purchasedetailsid <", value, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("purchasedetailsid <=", value, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidIn(List<Integer> values) {
            addCriterion("purchasedetailsid in", values, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidNotIn(List<Integer> values) {
            addCriterion("purchasedetailsid not in", values, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidBetween(Integer value1, Integer value2) {
            addCriterion("purchasedetailsid between", value1, value2, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andPurchasedetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchasedetailsid not between", value1, value2, "purchasedetailsid");
            return (Criteria) this;
        }

        public Criteria andLtemnoIsNull() {
            addCriterion("ltemno is null");
            return (Criteria) this;
        }

        public Criteria andLtemnoIsNotNull() {
            addCriterion("ltemno is not null");
            return (Criteria) this;
        }

        public Criteria andLtemnoEqualTo(String value) {
            addCriterion("ltemno =", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoNotEqualTo(String value) {
            addCriterion("ltemno <>", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoGreaterThan(String value) {
            addCriterion("ltemno >", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoGreaterThanOrEqualTo(String value) {
            addCriterion("ltemno >=", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoLessThan(String value) {
            addCriterion("ltemno <", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoLessThanOrEqualTo(String value) {
            addCriterion("ltemno <=", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoLike(String value) {
            addCriterion("ltemno like", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoNotLike(String value) {
            addCriterion("ltemno not like", value, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoIn(List<String> values) {
            addCriterion("ltemno in", values, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoNotIn(List<String> values) {
            addCriterion("ltemno not in", values, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoBetween(String value1, String value2) {
            addCriterion("ltemno between", value1, value2, "ltemno");
            return (Criteria) this;
        }

        public Criteria andLtemnoNotBetween(String value1, String value2) {
            addCriterion("ltemno not between", value1, value2, "ltemno");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNull() {
            addCriterion("purchaseid is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("purchaseid is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Integer value) {
            addCriterion("purchaseid =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Integer value) {
            addCriterion("purchaseid <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Integer value) {
            addCriterion("purchaseid >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseid >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Integer value) {
            addCriterion("purchaseid <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseid <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Integer> values) {
            addCriterion("purchaseid in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Integer> values) {
            addCriterion("purchaseid not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseid between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseid not between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andShapecodeIsNull() {
            addCriterion("shapecode is null");
            return (Criteria) this;
        }

        public Criteria andShapecodeIsNotNull() {
            addCriterion("shapecode is not null");
            return (Criteria) this;
        }

        public Criteria andShapecodeEqualTo(String value) {
            addCriterion("shapecode =", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotEqualTo(String value) {
            addCriterion("shapecode <>", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeGreaterThan(String value) {
            addCriterion("shapecode >", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeGreaterThanOrEqualTo(String value) {
            addCriterion("shapecode >=", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeLessThan(String value) {
            addCriterion("shapecode <", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeLessThanOrEqualTo(String value) {
            addCriterion("shapecode <=", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeLike(String value) {
            addCriterion("shapecode like", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotLike(String value) {
            addCriterion("shapecode not like", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeIn(List<String> values) {
            addCriterion("shapecode in", values, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotIn(List<String> values) {
            addCriterion("shapecode not in", values, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeBetween(String value1, String value2) {
            addCriterion("shapecode between", value1, value2, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotBetween(String value1, String value2) {
            addCriterion("shapecode not between", value1, value2, "shapecode");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoIsNull() {
            addCriterion("goodsphoto is null");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoIsNotNull() {
            addCriterion("goodsphoto is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoEqualTo(String value) {
            addCriterion("goodsphoto =", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoNotEqualTo(String value) {
            addCriterion("goodsphoto <>", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoGreaterThan(String value) {
            addCriterion("goodsphoto >", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoGreaterThanOrEqualTo(String value) {
            addCriterion("goodsphoto >=", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoLessThan(String value) {
            addCriterion("goodsphoto <", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoLessThanOrEqualTo(String value) {
            addCriterion("goodsphoto <=", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoLike(String value) {
            addCriterion("goodsphoto like", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoNotLike(String value) {
            addCriterion("goodsphoto not like", value, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoIn(List<String> values) {
            addCriterion("goodsphoto in", values, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoNotIn(List<String> values) {
            addCriterion("goodsphoto not in", values, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoBetween(String value1, String value2) {
            addCriterion("goodsphoto between", value1, value2, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andGoodsphotoNotBetween(String value1, String value2) {
            addCriterion("goodsphoto not between", value1, value2, "goodsphoto");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNull() {
            addCriterion("costprice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("costprice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(Float value) {
            addCriterion("costprice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(Float value) {
            addCriterion("costprice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(Float value) {
            addCriterion("costprice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("costprice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(Float value) {
            addCriterion("costprice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(Float value) {
            addCriterion("costprice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<Float> values) {
            addCriterion("costprice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<Float> values) {
            addCriterion("costprice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(Float value1, Float value2) {
            addCriterion("costprice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(Float value1, Float value2) {
            addCriterion("costprice not between", value1, value2, "costprice");
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

        public Criteria andCountEqualTo(Float value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Float value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Float value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Float value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Float value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Float value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Float> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Float> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Float value1, Float value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Float value1, Float value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
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