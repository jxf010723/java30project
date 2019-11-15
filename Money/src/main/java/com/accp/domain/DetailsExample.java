package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailsExample() {
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

        public Criteria andDetailsidIsNull() {
            addCriterion("detailsid is null");
            return (Criteria) this;
        }

        public Criteria andDetailsidIsNotNull() {
            addCriterion("detailsid is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsidEqualTo(Integer value) {
            addCriterion("detailsid =", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotEqualTo(Integer value) {
            addCriterion("detailsid <>", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidGreaterThan(Integer value) {
            addCriterion("detailsid >", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detailsid >=", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidLessThan(Integer value) {
            addCriterion("detailsid <", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("detailsid <=", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidIn(List<Integer> values) {
            addCriterion("detailsid in", values, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotIn(List<Integer> values) {
            addCriterion("detailsid not in", values, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidBetween(Integer value1, Integer value2) {
            addCriterion("detailsid between", value1, value2, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("detailsid not between", value1, value2, "detailsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
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

        public Criteria andGoodssizeIsNull() {
            addCriterion("goodssize is null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeIsNotNull() {
            addCriterion("goodssize is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeEqualTo(String value) {
            addCriterion("goodssize =", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotEqualTo(String value) {
            addCriterion("goodssize <>", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeGreaterThan(String value) {
            addCriterion("goodssize >", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeGreaterThanOrEqualTo(String value) {
            addCriterion("goodssize >=", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLessThan(String value) {
            addCriterion("goodssize <", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLessThanOrEqualTo(String value) {
            addCriterion("goodssize <=", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLike(String value) {
            addCriterion("goodssize like", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotLike(String value) {
            addCriterion("goodssize not like", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeIn(List<String> values) {
            addCriterion("goodssize in", values, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotIn(List<String> values) {
            addCriterion("goodssize not in", values, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeBetween(String value1, String value2) {
            addCriterion("goodssize between", value1, value2, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotBetween(String value1, String value2) {
            addCriterion("goodssize not between", value1, value2, "goodssize");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIsNull() {
            addCriterion("goodsstock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIsNotNull() {
            addCriterion("goodsstock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstockEqualTo(Integer value) {
            addCriterion("goodsstock =", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotEqualTo(Integer value) {
            addCriterion("goodsstock <>", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockGreaterThan(Integer value) {
            addCriterion("goodsstock >", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsstock >=", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockLessThan(Integer value) {
            addCriterion("goodsstock <", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockLessThanOrEqualTo(Integer value) {
            addCriterion("goodsstock <=", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIn(List<Integer> values) {
            addCriterion("goodsstock in", values, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotIn(List<Integer> values) {
            addCriterion("goodsstock not in", values, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockBetween(Integer value1, Integer value2) {
            addCriterion("goodsstock between", value1, value2, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsstock not between", value1, value2, "goodsstock");
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