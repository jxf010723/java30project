package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVipIdIsNull() {
            addCriterion("vip_id is null");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNotNull() {
            addCriterion("vip_id is not null");
            return (Criteria) this;
        }

        public Criteria andVipIdEqualTo(Integer value) {
            addCriterion("vip_id =", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotEqualTo(Integer value) {
            addCriterion("vip_id <>", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThan(Integer value) {
            addCriterion("vip_id >", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_id >=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThan(Integer value) {
            addCriterion("vip_id <", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThanOrEqualTo(Integer value) {
            addCriterion("vip_id <=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdIn(List<Integer> values) {
            addCriterion("vip_id in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotIn(List<Integer> values) {
            addCriterion("vip_id not in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdBetween(Integer value1, Integer value2) {
            addCriterion("vip_id between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_id not between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdIsNull() {
            addCriterion("vipType_id is null");
            return (Criteria) this;
        }

        public Criteria andViptypeIdIsNotNull() {
            addCriterion("vipType_id is not null");
            return (Criteria) this;
        }

        public Criteria andViptypeIdEqualTo(Integer value) {
            addCriterion("vipType_id =", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotEqualTo(Integer value) {
            addCriterion("vipType_id <>", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdGreaterThan(Integer value) {
            addCriterion("vipType_id >", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipType_id >=", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdLessThan(Integer value) {
            addCriterion("vipType_id <", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("vipType_id <=", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdIn(List<Integer> values) {
            addCriterion("vipType_id in", values, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotIn(List<Integer> values) {
            addCriterion("vipType_id not in", values, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdBetween(Integer value1, Integer value2) {
            addCriterion("vipType_id between", value1, value2, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vipType_id not between", value1, value2, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andVipPhoneIsNull() {
            addCriterion("vip_phone is null");
            return (Criteria) this;
        }

        public Criteria andVipPhoneIsNotNull() {
            addCriterion("vip_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVipPhoneEqualTo(String value) {
            addCriterion("vip_phone =", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotEqualTo(String value) {
            addCriterion("vip_phone <>", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneGreaterThan(String value) {
            addCriterion("vip_phone >", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("vip_phone >=", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneLessThan(String value) {
            addCriterion("vip_phone <", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneLessThanOrEqualTo(String value) {
            addCriterion("vip_phone <=", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneLike(String value) {
            addCriterion("vip_phone like", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotLike(String value) {
            addCriterion("vip_phone not like", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneIn(List<String> values) {
            addCriterion("vip_phone in", values, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotIn(List<String> values) {
            addCriterion("vip_phone not in", values, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneBetween(String value1, String value2) {
            addCriterion("vip_phone between", value1, value2, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotBetween(String value1, String value2) {
            addCriterion("vip_phone not between", value1, value2, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipNameIsNull() {
            addCriterion("vip_name is null");
            return (Criteria) this;
        }

        public Criteria andVipNameIsNotNull() {
            addCriterion("vip_name is not null");
            return (Criteria) this;
        }

        public Criteria andVipNameEqualTo(String value) {
            addCriterion("vip_name =", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotEqualTo(String value) {
            addCriterion("vip_name <>", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameGreaterThan(String value) {
            addCriterion("vip_name >", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameGreaterThanOrEqualTo(String value) {
            addCriterion("vip_name >=", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameLessThan(String value) {
            addCriterion("vip_name <", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameLessThanOrEqualTo(String value) {
            addCriterion("vip_name <=", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameLike(String value) {
            addCriterion("vip_name like", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotLike(String value) {
            addCriterion("vip_name not like", value, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameIn(List<String> values) {
            addCriterion("vip_name in", values, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotIn(List<String> values) {
            addCriterion("vip_name not in", values, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameBetween(String value1, String value2) {
            addCriterion("vip_name between", value1, value2, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipNameNotBetween(String value1, String value2) {
            addCriterion("vip_name not between", value1, value2, "vipName");
            return (Criteria) this;
        }

        public Criteria andVipPwdIsNull() {
            addCriterion("vip_pwd is null");
            return (Criteria) this;
        }

        public Criteria andVipPwdIsNotNull() {
            addCriterion("vip_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andVipPwdEqualTo(String value) {
            addCriterion("vip_pwd =", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdNotEqualTo(String value) {
            addCriterion("vip_pwd <>", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdGreaterThan(String value) {
            addCriterion("vip_pwd >", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdGreaterThanOrEqualTo(String value) {
            addCriterion("vip_pwd >=", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdLessThan(String value) {
            addCriterion("vip_pwd <", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdLessThanOrEqualTo(String value) {
            addCriterion("vip_pwd <=", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdLike(String value) {
            addCriterion("vip_pwd like", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdNotLike(String value) {
            addCriterion("vip_pwd not like", value, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdIn(List<String> values) {
            addCriterion("vip_pwd in", values, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdNotIn(List<String> values) {
            addCriterion("vip_pwd not in", values, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdBetween(String value1, String value2) {
            addCriterion("vip_pwd between", value1, value2, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipPwdNotBetween(String value1, String value2) {
            addCriterion("vip_pwd not between", value1, value2, "vipPwd");
            return (Criteria) this;
        }

        public Criteria andVipProvinceIsNull() {
            addCriterion("vip_province is null");
            return (Criteria) this;
        }

        public Criteria andVipProvinceIsNotNull() {
            addCriterion("vip_province is not null");
            return (Criteria) this;
        }

        public Criteria andVipProvinceEqualTo(String value) {
            addCriterion("vip_province =", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceNotEqualTo(String value) {
            addCriterion("vip_province <>", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceGreaterThan(String value) {
            addCriterion("vip_province >", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("vip_province >=", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceLessThan(String value) {
            addCriterion("vip_province <", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceLessThanOrEqualTo(String value) {
            addCriterion("vip_province <=", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceLike(String value) {
            addCriterion("vip_province like", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceNotLike(String value) {
            addCriterion("vip_province not like", value, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceIn(List<String> values) {
            addCriterion("vip_province in", values, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceNotIn(List<String> values) {
            addCriterion("vip_province not in", values, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceBetween(String value1, String value2) {
            addCriterion("vip_province between", value1, value2, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipProvinceNotBetween(String value1, String value2) {
            addCriterion("vip_province not between", value1, value2, "vipProvince");
            return (Criteria) this;
        }

        public Criteria andVipCityIsNull() {
            addCriterion("vip_city is null");
            return (Criteria) this;
        }

        public Criteria andVipCityIsNotNull() {
            addCriterion("vip_city is not null");
            return (Criteria) this;
        }

        public Criteria andVipCityEqualTo(String value) {
            addCriterion("vip_city =", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityNotEqualTo(String value) {
            addCriterion("vip_city <>", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityGreaterThan(String value) {
            addCriterion("vip_city >", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityGreaterThanOrEqualTo(String value) {
            addCriterion("vip_city >=", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityLessThan(String value) {
            addCriterion("vip_city <", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityLessThanOrEqualTo(String value) {
            addCriterion("vip_city <=", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityLike(String value) {
            addCriterion("vip_city like", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityNotLike(String value) {
            addCriterion("vip_city not like", value, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityIn(List<String> values) {
            addCriterion("vip_city in", values, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityNotIn(List<String> values) {
            addCriterion("vip_city not in", values, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityBetween(String value1, String value2) {
            addCriterion("vip_city between", value1, value2, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipCityNotBetween(String value1, String value2) {
            addCriterion("vip_city not between", value1, value2, "vipCity");
            return (Criteria) this;
        }

        public Criteria andVipRegionIsNull() {
            addCriterion("vip_region is null");
            return (Criteria) this;
        }

        public Criteria andVipRegionIsNotNull() {
            addCriterion("vip_region is not null");
            return (Criteria) this;
        }

        public Criteria andVipRegionEqualTo(String value) {
            addCriterion("vip_region =", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionNotEqualTo(String value) {
            addCriterion("vip_region <>", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionGreaterThan(String value) {
            addCriterion("vip_region >", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionGreaterThanOrEqualTo(String value) {
            addCriterion("vip_region >=", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionLessThan(String value) {
            addCriterion("vip_region <", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionLessThanOrEqualTo(String value) {
            addCriterion("vip_region <=", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionLike(String value) {
            addCriterion("vip_region like", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionNotLike(String value) {
            addCriterion("vip_region not like", value, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionIn(List<String> values) {
            addCriterion("vip_region in", values, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionNotIn(List<String> values) {
            addCriterion("vip_region not in", values, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionBetween(String value1, String value2) {
            addCriterion("vip_region between", value1, value2, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipRegionNotBetween(String value1, String value2) {
            addCriterion("vip_region not between", value1, value2, "vipRegion");
            return (Criteria) this;
        }

        public Criteria andVipStreetIsNull() {
            addCriterion("vip_street is null");
            return (Criteria) this;
        }

        public Criteria andVipStreetIsNotNull() {
            addCriterion("vip_street is not null");
            return (Criteria) this;
        }

        public Criteria andVipStreetEqualTo(String value) {
            addCriterion("vip_street =", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetNotEqualTo(String value) {
            addCriterion("vip_street <>", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetGreaterThan(String value) {
            addCriterion("vip_street >", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetGreaterThanOrEqualTo(String value) {
            addCriterion("vip_street >=", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetLessThan(String value) {
            addCriterion("vip_street <", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetLessThanOrEqualTo(String value) {
            addCriterion("vip_street <=", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetLike(String value) {
            addCriterion("vip_street like", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetNotLike(String value) {
            addCriterion("vip_street not like", value, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetIn(List<String> values) {
            addCriterion("vip_street in", values, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetNotIn(List<String> values) {
            addCriterion("vip_street not in", values, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetBetween(String value1, String value2) {
            addCriterion("vip_street between", value1, value2, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipStreetNotBetween(String value1, String value2) {
            addCriterion("vip_street not between", value1, value2, "vipStreet");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverIsNull() {
            addCriterion("vip_turnover is null");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverIsNotNull() {
            addCriterion("vip_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverEqualTo(Integer value) {
            addCriterion("vip_turnover =", value, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverNotEqualTo(Integer value) {
            addCriterion("vip_turnover <>", value, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverGreaterThan(Integer value) {
            addCriterion("vip_turnover >", value, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_turnover >=", value, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverLessThan(Integer value) {
            addCriterion("vip_turnover <", value, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverLessThanOrEqualTo(Integer value) {
            addCriterion("vip_turnover <=", value, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverIn(List<Integer> values) {
            addCriterion("vip_turnover in", values, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverNotIn(List<Integer> values) {
            addCriterion("vip_turnover not in", values, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverBetween(Integer value1, Integer value2) {
            addCriterion("vip_turnover between", value1, value2, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andVipTurnoverNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_turnover not between", value1, value2, "vipTurnover");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIsNull() {
            addCriterion("transaction_price is null");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIsNotNull() {
            addCriterion("transaction_price is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceEqualTo(Double value) {
            addCriterion("transaction_price =", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotEqualTo(Double value) {
            addCriterion("transaction_price <>", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceGreaterThan(Double value) {
            addCriterion("transaction_price >", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("transaction_price >=", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceLessThan(Double value) {
            addCriterion("transaction_price <", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceLessThanOrEqualTo(Double value) {
            addCriterion("transaction_price <=", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIn(List<Double> values) {
            addCriterion("transaction_price in", values, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotIn(List<Double> values) {
            addCriterion("transaction_price not in", values, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceBetween(Double value1, Double value2) {
            addCriterion("transaction_price between", value1, value2, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotBetween(Double value1, Double value2) {
            addCriterion("transaction_price not between", value1, value2, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
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