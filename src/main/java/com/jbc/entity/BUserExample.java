package com.jbc.entity;

import java.util.ArrayList;
import java.util.List;

public class BUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_Password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_Password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_Password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_Password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_Password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_Password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_Password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_Password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_Password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_Password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_Password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_Password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_Password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_Password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_Level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_Level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("user_Level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("user_Level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("user_Level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("user_Level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_Level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("user_Level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("user_Level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_Level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserDesIsNull() {
            addCriterion("user_Des is null");
            return (Criteria) this;
        }

        public Criteria andUserDesIsNotNull() {
            addCriterion("user_Des is not null");
            return (Criteria) this;
        }

        public Criteria andUserDesEqualTo(String value) {
            addCriterion("user_Des =", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotEqualTo(String value) {
            addCriterion("user_Des <>", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesGreaterThan(String value) {
            addCriterion("user_Des >", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesGreaterThanOrEqualTo(String value) {
            addCriterion("user_Des >=", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesLessThan(String value) {
            addCriterion("user_Des <", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesLessThanOrEqualTo(String value) {
            addCriterion("user_Des <=", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesLike(String value) {
            addCriterion("user_Des like", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotLike(String value) {
            addCriterion("user_Des not like", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesIn(List<String> values) {
            addCriterion("user_Des in", values, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotIn(List<String> values) {
            addCriterion("user_Des not in", values, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesBetween(String value1, String value2) {
            addCriterion("user_Des between", value1, value2, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotBetween(String value1, String value2) {
            addCriterion("user_Des not between", value1, value2, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("user_Tel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("user_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("user_Tel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("user_Tel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("user_Tel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("user_Tel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("user_Tel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("user_Tel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("user_Tel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("user_Tel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("user_Tel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("user_Tel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("user_Tel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("user_Tel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_Address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_Address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_Address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_Address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_Address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_Address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_Address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_Address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_Address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_Address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_Address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_Address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_Address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_Address not between", value1, value2, "userAddress");
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