package com.ejiaren_c1.pojo;

import java.util.ArrayList;
import java.util.List;

public class TCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNull() {
            addCriterion("CUSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNotNull() {
            addCriterion("CUSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustnameEqualTo(String value) {
            addCriterion("CUSTNAME =", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotEqualTo(String value) {
            addCriterion("CUSTNAME <>", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThan(String value) {
            addCriterion("CUSTNAME >", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTNAME >=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThan(String value) {
            addCriterion("CUSTNAME <", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThanOrEqualTo(String value) {
            addCriterion("CUSTNAME <=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLike(String value) {
            addCriterion("CUSTNAME like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotLike(String value) {
            addCriterion("CUSTNAME not like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameIn(List<String> values) {
            addCriterion("CUSTNAME in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotIn(List<String> values) {
            addCriterion("CUSTNAME not in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameBetween(String value1, String value2) {
            addCriterion("CUSTNAME between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotBetween(String value1, String value2) {
            addCriterion("CUSTNAME not between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andContnameIsNull() {
            addCriterion("CONTNAME is null");
            return (Criteria) this;
        }

        public Criteria andContnameIsNotNull() {
            addCriterion("CONTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andContnameEqualTo(String value) {
            addCriterion("CONTNAME =", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotEqualTo(String value) {
            addCriterion("CONTNAME <>", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameGreaterThan(String value) {
            addCriterion("CONTNAME >", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTNAME >=", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameLessThan(String value) {
            addCriterion("CONTNAME <", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameLessThanOrEqualTo(String value) {
            addCriterion("CONTNAME <=", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameLike(String value) {
            addCriterion("CONTNAME like", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotLike(String value) {
            addCriterion("CONTNAME not like", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameIn(List<String> values) {
            addCriterion("CONTNAME in", values, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotIn(List<String> values) {
            addCriterion("CONTNAME not in", values, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameBetween(String value1, String value2) {
            addCriterion("CONTNAME between", value1, value2, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotBetween(String value1, String value2) {
            addCriterion("CONTNAME not between", value1, value2, "contname");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("PS is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("PS is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(String value) {
            addCriterion("PS =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(String value) {
            addCriterion("PS <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(String value) {
            addCriterion("PS >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(String value) {
            addCriterion("PS >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(String value) {
            addCriterion("PS <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(String value) {
            addCriterion("PS <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLike(String value) {
            addCriterion("PS like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotLike(String value) {
            addCriterion("PS not like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<String> values) {
            addCriterion("PS in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<String> values) {
            addCriterion("PS not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(String value1, String value2) {
            addCriterion("PS between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(String value1, String value2) {
            addCriterion("PS not between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andContgenderIsNull() {
            addCriterion("CONTGENDER is null");
            return (Criteria) this;
        }

        public Criteria andContgenderIsNotNull() {
            addCriterion("CONTGENDER is not null");
            return (Criteria) this;
        }

        public Criteria andContgenderEqualTo(String value) {
            addCriterion("CONTGENDER =", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderNotEqualTo(String value) {
            addCriterion("CONTGENDER <>", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderGreaterThan(String value) {
            addCriterion("CONTGENDER >", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderGreaterThanOrEqualTo(String value) {
            addCriterion("CONTGENDER >=", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderLessThan(String value) {
            addCriterion("CONTGENDER <", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderLessThanOrEqualTo(String value) {
            addCriterion("CONTGENDER <=", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderLike(String value) {
            addCriterion("CONTGENDER like", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderNotLike(String value) {
            addCriterion("CONTGENDER not like", value, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderIn(List<String> values) {
            addCriterion("CONTGENDER in", values, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderNotIn(List<String> values) {
            addCriterion("CONTGENDER not in", values, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderBetween(String value1, String value2) {
            addCriterion("CONTGENDER between", value1, value2, "contgender");
            return (Criteria) this;
        }

        public Criteria andContgenderNotBetween(String value1, String value2) {
            addCriterion("CONTGENDER not between", value1, value2, "contgender");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNull() {
            addCriterion("LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(String value) {
            addCriterion("LEVEL_ID =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(String value) {
            addCriterion("LEVEL_ID <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(String value) {
            addCriterion("LEVEL_ID >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(String value) {
            addCriterion("LEVEL_ID <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLike(String value) {
            addCriterion("LEVEL_ID like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotLike(String value) {
            addCriterion("LEVEL_ID not like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<String> values) {
            addCriterion("LEVEL_ID in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<String> values) {
            addCriterion("LEVEL_ID not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(String value1, String value2) {
            addCriterion("LEVEL_ID between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(String value1, String value2) {
            addCriterion("LEVEL_ID not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andMesTimeIsNull() {
            addCriterion("MES_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMesTimeIsNotNull() {
            addCriterion("MES_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMesTimeEqualTo(String value) {
            addCriterion("MES_TIME =", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotEqualTo(String value) {
            addCriterion("MES_TIME <>", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeGreaterThan(String value) {
            addCriterion("MES_TIME >", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MES_TIME >=", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeLessThan(String value) {
            addCriterion("MES_TIME <", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeLessThanOrEqualTo(String value) {
            addCriterion("MES_TIME <=", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeLike(String value) {
            addCriterion("MES_TIME like", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotLike(String value) {
            addCriterion("MES_TIME not like", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeIn(List<String> values) {
            addCriterion("MES_TIME in", values, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotIn(List<String> values) {
            addCriterion("MES_TIME not in", values, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeBetween(String value1, String value2) {
            addCriterion("MES_TIME between", value1, value2, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotBetween(String value1, String value2) {
            addCriterion("MES_TIME not between", value1, value2, "mesTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIsNull() {
            addCriterion("CUSTOMERADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIsNotNull() {
            addCriterion("CUSTOMERADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressEqualTo(String value) {
            addCriterion("CUSTOMERADDRESS =", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotEqualTo(String value) {
            addCriterion("CUSTOMERADDRESS <>", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressGreaterThan(String value) {
            addCriterion("CUSTOMERADDRESS >", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERADDRESS >=", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLessThan(String value) {
            addCriterion("CUSTOMERADDRESS <", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERADDRESS <=", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLike(String value) {
            addCriterion("CUSTOMERADDRESS like", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotLike(String value) {
            addCriterion("CUSTOMERADDRESS not like", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIn(List<String> values) {
            addCriterion("CUSTOMERADDRESS in", values, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotIn(List<String> values) {
            addCriterion("CUSTOMERADDRESS not in", values, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressBetween(String value1, String value2) {
            addCriterion("CUSTOMERADDRESS between", value1, value2, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERADDRESS not between", value1, value2, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorIsNull() {
            addCriterion("CUSTOMERAVERAGEINDOOR is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorIsNotNull() {
            addCriterion("CUSTOMERAVERAGEINDOOR is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorEqualTo(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR =", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorNotEqualTo(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR <>", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorGreaterThan(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR >", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR >=", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorLessThan(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR <", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR <=", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorLike(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR like", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorNotLike(String value) {
            addCriterion("CUSTOMERAVERAGEINDOOR not like", value, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorIn(List<String> values) {
            addCriterion("CUSTOMERAVERAGEINDOOR in", values, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorNotIn(List<String> values) {
            addCriterion("CUSTOMERAVERAGEINDOOR not in", values, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorBetween(String value1, String value2) {
            addCriterion("CUSTOMERAVERAGEINDOOR between", value1, value2, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeraverageindoorNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERAVERAGEINDOOR not between", value1, value2, "customeraverageindoor");
            return (Criteria) this;
        }

        public Criteria andCustomeremailIsNull() {
            addCriterion("CUSTOMEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCustomeremailIsNotNull() {
            addCriterion("CUSTOMEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeremailEqualTo(String value) {
            addCriterion("CUSTOMEREMAIL =", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotEqualTo(String value) {
            addCriterion("CUSTOMEREMAIL <>", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailGreaterThan(String value) {
            addCriterion("CUSTOMEREMAIL >", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMEREMAIL >=", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailLessThan(String value) {
            addCriterion("CUSTOMEREMAIL <", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMEREMAIL <=", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailLike(String value) {
            addCriterion("CUSTOMEREMAIL like", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotLike(String value) {
            addCriterion("CUSTOMEREMAIL not like", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailIn(List<String> values) {
            addCriterion("CUSTOMEREMAIL in", values, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotIn(List<String> values) {
            addCriterion("CUSTOMEREMAIL not in", values, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailBetween(String value1, String value2) {
            addCriterion("CUSTOMEREMAIL between", value1, value2, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotBetween(String value1, String value2) {
            addCriterion("CUSTOMEREMAIL not between", value1, value2, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryIsNull() {
            addCriterion("CUSTOMERINTENTCOUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryIsNotNull() {
            addCriterion("CUSTOMERINTENTCOUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryEqualTo(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY =", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryNotEqualTo(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY <>", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryGreaterThan(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY >", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY >=", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryLessThan(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY <", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY <=", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryLike(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY like", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryNotLike(String value) {
            addCriterion("CUSTOMERINTENTCOUNTRY not like", value, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryIn(List<String> values) {
            addCriterion("CUSTOMERINTENTCOUNTRY in", values, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryNotIn(List<String> values) {
            addCriterion("CUSTOMERINTENTCOUNTRY not in", values, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTCOUNTRY between", value1, value2, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentcountryNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTCOUNTRY not between", value1, value2, "customerintentcountry");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeIsNull() {
            addCriterion("CUSTOMERINTENTDEGREE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeIsNotNull() {
            addCriterion("CUSTOMERINTENTDEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeEqualTo(String value) {
            addCriterion("CUSTOMERINTENTDEGREE =", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeNotEqualTo(String value) {
            addCriterion("CUSTOMERINTENTDEGREE <>", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeGreaterThan(String value) {
            addCriterion("CUSTOMERINTENTDEGREE >", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTDEGREE >=", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeLessThan(String value) {
            addCriterion("CUSTOMERINTENTDEGREE <", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTDEGREE <=", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeLike(String value) {
            addCriterion("CUSTOMERINTENTDEGREE like", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeNotLike(String value) {
            addCriterion("CUSTOMERINTENTDEGREE not like", value, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeIn(List<String> values) {
            addCriterion("CUSTOMERINTENTDEGREE in", values, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeNotIn(List<String> values) {
            addCriterion("CUSTOMERINTENTDEGREE not in", values, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTDEGREE between", value1, value2, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentdegreeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTDEGREE not between", value1, value2, "customerintentdegree");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillIsNull() {
            addCriterion("CUSTOMERINTENTSKILL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillIsNotNull() {
            addCriterion("CUSTOMERINTENTSKILL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillEqualTo(String value) {
            addCriterion("CUSTOMERINTENTSKILL =", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillNotEqualTo(String value) {
            addCriterion("CUSTOMERINTENTSKILL <>", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillGreaterThan(String value) {
            addCriterion("CUSTOMERINTENTSKILL >", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTSKILL >=", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillLessThan(String value) {
            addCriterion("CUSTOMERINTENTSKILL <", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTSKILL <=", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillLike(String value) {
            addCriterion("CUSTOMERINTENTSKILL like", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillNotLike(String value) {
            addCriterion("CUSTOMERINTENTSKILL not like", value, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillIn(List<String> values) {
            addCriterion("CUSTOMERINTENTSKILL in", values, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillNotIn(List<String> values) {
            addCriterion("CUSTOMERINTENTSKILL not in", values, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTSKILL between", value1, value2, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintentskillNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTSKILL not between", value1, value2, "customerintentskill");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeIsNull() {
            addCriterion("CUSTOMERINTENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeIsNotNull() {
            addCriterion("CUSTOMERINTENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeEqualTo(String value) {
            addCriterion("CUSTOMERINTENTTIME =", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeNotEqualTo(String value) {
            addCriterion("CUSTOMERINTENTTIME <>", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeGreaterThan(String value) {
            addCriterion("CUSTOMERINTENTTIME >", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTTIME >=", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeLessThan(String value) {
            addCriterion("CUSTOMERINTENTTIME <", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERINTENTTIME <=", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeLike(String value) {
            addCriterion("CUSTOMERINTENTTIME like", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeNotLike(String value) {
            addCriterion("CUSTOMERINTENTTIME not like", value, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeIn(List<String> values) {
            addCriterion("CUSTOMERINTENTTIME in", values, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeNotIn(List<String> values) {
            addCriterion("CUSTOMERINTENTTIME not in", values, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTTIME between", value1, value2, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerintenttimeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERINTENTTIME not between", value1, value2, "customerintenttime");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelIsNull() {
            addCriterion("CUSTOMERLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelIsNotNull() {
            addCriterion("CUSTOMERLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL =", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL <>", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelGreaterThan(String value) {
            addCriterion("CUSTOMERLEVEL >", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL >=", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelLessThan(String value) {
            addCriterion("CUSTOMERLEVEL <", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL <=", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelLike(String value) {
            addCriterion("CUSTOMERLEVEL like", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotLike(String value) {
            addCriterion("CUSTOMERLEVEL not like", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelIn(List<String> values) {
            addCriterion("CUSTOMERLEVEL in", values, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotIn(List<String> values) {
            addCriterion("CUSTOMERLEVEL not in", values, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelBetween(String value1, String value2) {
            addCriterion("CUSTOMERLEVEL between", value1, value2, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERLEVEL not between", value1, value2, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNull() {
            addCriterion("CUSTOMERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNotNull() {
            addCriterion("CUSTOMERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneEqualTo(String value) {
            addCriterion("CUSTOMERPHONE =", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotEqualTo(String value) {
            addCriterion("CUSTOMERPHONE <>", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThan(String value) {
            addCriterion("CUSTOMERPHONE >", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPHONE >=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThan(String value) {
            addCriterion("CUSTOMERPHONE <", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERPHONE <=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLike(String value) {
            addCriterion("CUSTOMERPHONE like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotLike(String value) {
            addCriterion("CUSTOMERPHONE not like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIn(List<String> values) {
            addCriterion("CUSTOMERPHONE in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotIn(List<String> values) {
            addCriterion("CUSTOMERPHONE not in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneBetween(String value1, String value2) {
            addCriterion("CUSTOMERPHONE between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERPHONE not between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerqqIsNull() {
            addCriterion("CUSTOMERQQ is null");
            return (Criteria) this;
        }

        public Criteria andCustomerqqIsNotNull() {
            addCriterion("CUSTOMERQQ is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerqqEqualTo(String value) {
            addCriterion("CUSTOMERQQ =", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqNotEqualTo(String value) {
            addCriterion("CUSTOMERQQ <>", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqGreaterThan(String value) {
            addCriterion("CUSTOMERQQ >", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERQQ >=", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqLessThan(String value) {
            addCriterion("CUSTOMERQQ <", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERQQ <=", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqLike(String value) {
            addCriterion("CUSTOMERQQ like", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqNotLike(String value) {
            addCriterion("CUSTOMERQQ not like", value, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqIn(List<String> values) {
            addCriterion("CUSTOMERQQ in", values, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqNotIn(List<String> values) {
            addCriterion("CUSTOMERQQ not in", values, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqBetween(String value1, String value2) {
            addCriterion("CUSTOMERQQ between", value1, value2, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerqqNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERQQ not between", value1, value2, "customerqq");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolIsNull() {
            addCriterion("CUSTOMERSCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolIsNotNull() {
            addCriterion("CUSTOMERSCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolEqualTo(String value) {
            addCriterion("CUSTOMERSCHOOL =", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolNotEqualTo(String value) {
            addCriterion("CUSTOMERSCHOOL <>", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolGreaterThan(String value) {
            addCriterion("CUSTOMERSCHOOL >", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSCHOOL >=", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolLessThan(String value) {
            addCriterion("CUSTOMERSCHOOL <", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSCHOOL <=", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolLike(String value) {
            addCriterion("CUSTOMERSCHOOL like", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolNotLike(String value) {
            addCriterion("CUSTOMERSCHOOL not like", value, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolIn(List<String> values) {
            addCriterion("CUSTOMERSCHOOL in", values, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolNotIn(List<String> values) {
            addCriterion("CUSTOMERSCHOOL not in", values, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolBetween(String value1, String value2) {
            addCriterion("CUSTOMERSCHOOL between", value1, value2, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerschoolNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSCHOOL not between", value1, value2, "customerschool");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorIsNull() {
            addCriterion("CUSTOMERSKILLINDOOR is null");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorIsNotNull() {
            addCriterion("CUSTOMERSKILLINDOOR is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorEqualTo(String value) {
            addCriterion("CUSTOMERSKILLINDOOR =", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorNotEqualTo(String value) {
            addCriterion("CUSTOMERSKILLINDOOR <>", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorGreaterThan(String value) {
            addCriterion("CUSTOMERSKILLINDOOR >", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSKILLINDOOR >=", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorLessThan(String value) {
            addCriterion("CUSTOMERSKILLINDOOR <", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSKILLINDOOR <=", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorLike(String value) {
            addCriterion("CUSTOMERSKILLINDOOR like", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorNotLike(String value) {
            addCriterion("CUSTOMERSKILLINDOOR not like", value, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorIn(List<String> values) {
            addCriterion("CUSTOMERSKILLINDOOR in", values, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorNotIn(List<String> values) {
            addCriterion("CUSTOMERSKILLINDOOR not in", values, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorBetween(String value1, String value2) {
            addCriterion("CUSTOMERSKILLINDOOR between", value1, value2, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomerskillindoorNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSKILLINDOOR not between", value1, value2, "customerskillindoor");
            return (Criteria) this;
        }

        public Criteria andCustomertimeIsNull() {
            addCriterion("CUSTOMERTIME is null");
            return (Criteria) this;
        }

        public Criteria andCustomertimeIsNotNull() {
            addCriterion("CUSTOMERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertimeEqualTo(String value) {
            addCriterion("CUSTOMERTIME =", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeNotEqualTo(String value) {
            addCriterion("CUSTOMERTIME <>", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeGreaterThan(String value) {
            addCriterion("CUSTOMERTIME >", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTIME >=", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeLessThan(String value) {
            addCriterion("CUSTOMERTIME <", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTIME <=", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeLike(String value) {
            addCriterion("CUSTOMERTIME like", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeNotLike(String value) {
            addCriterion("CUSTOMERTIME not like", value, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeIn(List<String> values) {
            addCriterion("CUSTOMERTIME in", values, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeNotIn(List<String> values) {
            addCriterion("CUSTOMERTIME not in", values, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeBetween(String value1, String value2) {
            addCriterion("CUSTOMERTIME between", value1, value2, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomertimeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTIME not between", value1, value2, "customertime");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatIsNull() {
            addCriterion("CUSTOMERWECHAT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatIsNotNull() {
            addCriterion("CUSTOMERWECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatEqualTo(String value) {
            addCriterion("CUSTOMERWECHAT =", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatNotEqualTo(String value) {
            addCriterion("CUSTOMERWECHAT <>", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatGreaterThan(String value) {
            addCriterion("CUSTOMERWECHAT >", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERWECHAT >=", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatLessThan(String value) {
            addCriterion("CUSTOMERWECHAT <", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERWECHAT <=", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatLike(String value) {
            addCriterion("CUSTOMERWECHAT like", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatNotLike(String value) {
            addCriterion("CUSTOMERWECHAT not like", value, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatIn(List<String> values) {
            addCriterion("CUSTOMERWECHAT in", values, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatNotIn(List<String> values) {
            addCriterion("CUSTOMERWECHAT not in", values, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatBetween(String value1, String value2) {
            addCriterion("CUSTOMERWECHAT between", value1, value2, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerwechatNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERWECHAT not between", value1, value2, "customerwechat");
            return (Criteria) this;
        }

        public Criteria andCustomerstateIsNull() {
            addCriterion("CUSTOMERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerstateIsNotNull() {
            addCriterion("CUSTOMERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerstateEqualTo(String value) {
            addCriterion("CUSTOMERSTATE =", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateNotEqualTo(String value) {
            addCriterion("CUSTOMERSTATE <>", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateGreaterThan(String value) {
            addCriterion("CUSTOMERSTATE >", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSTATE >=", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateLessThan(String value) {
            addCriterion("CUSTOMERSTATE <", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSTATE <=", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateLike(String value) {
            addCriterion("CUSTOMERSTATE like", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateNotLike(String value) {
            addCriterion("CUSTOMERSTATE not like", value, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateIn(List<String> values) {
            addCriterion("CUSTOMERSTATE in", values, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateNotIn(List<String> values) {
            addCriterion("CUSTOMERSTATE not in", values, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateBetween(String value1, String value2) {
            addCriterion("CUSTOMERSTATE between", value1, value2, "customerstate");
            return (Criteria) this;
        }

        public Criteria andCustomerstateNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSTATE not between", value1, value2, "customerstate");
            return (Criteria) this;
        }

        public Criteria andMeettimeIsNull() {
            addCriterion("meettime is null");
            return (Criteria) this;
        }

        public Criteria andMeettimeIsNotNull() {
            addCriterion("meettime is not null");
            return (Criteria) this;
        }

        public Criteria andMeettimeEqualTo(String value) {
            addCriterion("meettime =", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotEqualTo(String value) {
            addCriterion("meettime <>", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeGreaterThan(String value) {
            addCriterion("meettime >", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeGreaterThanOrEqualTo(String value) {
            addCriterion("meettime >=", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeLessThan(String value) {
            addCriterion("meettime <", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeLessThanOrEqualTo(String value) {
            addCriterion("meettime <=", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeLike(String value) {
            addCriterion("meettime like", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotLike(String value) {
            addCriterion("meettime not like", value, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeIn(List<String> values) {
            addCriterion("meettime in", values, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotIn(List<String> values) {
            addCriterion("meettime not in", values, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeBetween(String value1, String value2) {
            addCriterion("meettime between", value1, value2, "meettime");
            return (Criteria) this;
        }

        public Criteria andMeettimeNotBetween(String value1, String value2) {
            addCriterion("meettime not between", value1, value2, "meettime");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateIsNull() {
            addCriterion("CUSTOMERMEETSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateIsNotNull() {
            addCriterion("CUSTOMERMEETSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateEqualTo(String value) {
            addCriterion("CUSTOMERMEETSTATE =", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateNotEqualTo(String value) {
            addCriterion("CUSTOMERMEETSTATE <>", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateGreaterThan(String value) {
            addCriterion("CUSTOMERMEETSTATE >", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERMEETSTATE >=", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateLessThan(String value) {
            addCriterion("CUSTOMERMEETSTATE <", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERMEETSTATE <=", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateLike(String value) {
            addCriterion("CUSTOMERMEETSTATE like", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateNotLike(String value) {
            addCriterion("CUSTOMERMEETSTATE not like", value, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateIn(List<String> values) {
            addCriterion("CUSTOMERMEETSTATE in", values, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateNotIn(List<String> values) {
            addCriterion("CUSTOMERMEETSTATE not in", values, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateBetween(String value1, String value2) {
            addCriterion("CUSTOMERMEETSTATE between", value1, value2, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomermeetstateNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERMEETSTATE not between", value1, value2, "customermeetstate");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusIsNull() {
            addCriterion("CUSTOMERGENIUS is null");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusIsNotNull() {
            addCriterion("CUSTOMERGENIUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusEqualTo(String value) {
            addCriterion("CUSTOMERGENIUS =", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusNotEqualTo(String value) {
            addCriterion("CUSTOMERGENIUS <>", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusGreaterThan(String value) {
            addCriterion("CUSTOMERGENIUS >", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERGENIUS >=", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusLessThan(String value) {
            addCriterion("CUSTOMERGENIUS <", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERGENIUS <=", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusLike(String value) {
            addCriterion("CUSTOMERGENIUS like", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusNotLike(String value) {
            addCriterion("CUSTOMERGENIUS not like", value, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusIn(List<String> values) {
            addCriterion("CUSTOMERGENIUS in", values, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusNotIn(List<String> values) {
            addCriterion("CUSTOMERGENIUS not in", values, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusBetween(String value1, String value2) {
            addCriterion("CUSTOMERGENIUS between", value1, value2, "customergenius");
            return (Criteria) this;
        }

        public Criteria andCustomergeniusNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERGENIUS not between", value1, value2, "customergenius");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeIsNull() {
            addCriterion("OPERTIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeIsNotNull() {
            addCriterion("OPERTIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeEqualTo(String value) {
            addCriterion("OPERTIONTIME =", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeNotEqualTo(String value) {
            addCriterion("OPERTIONTIME <>", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeGreaterThan(String value) {
            addCriterion("OPERTIONTIME >", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERTIONTIME >=", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeLessThan(String value) {
            addCriterion("OPERTIONTIME <", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeLessThanOrEqualTo(String value) {
            addCriterion("OPERTIONTIME <=", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeLike(String value) {
            addCriterion("OPERTIONTIME like", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeNotLike(String value) {
            addCriterion("OPERTIONTIME not like", value, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeIn(List<String> values) {
            addCriterion("OPERTIONTIME in", values, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeNotIn(List<String> values) {
            addCriterion("OPERTIONTIME not in", values, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeBetween(String value1, String value2) {
            addCriterion("OPERTIONTIME between", value1, value2, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andOpertiontimeNotBetween(String value1, String value2) {
            addCriterion("OPERTIONTIME not between", value1, value2, "opertiontime");
            return (Criteria) this;
        }

        public Criteria andResourcesIsNull() {
            addCriterion("resources is null");
            return (Criteria) this;
        }

        public Criteria andResourcesIsNotNull() {
            addCriterion("resources is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesEqualTo(String value) {
            addCriterion("resources =", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotEqualTo(String value) {
            addCriterion("resources <>", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesGreaterThan(String value) {
            addCriterion("resources >", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesGreaterThanOrEqualTo(String value) {
            addCriterion("resources >=", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLessThan(String value) {
            addCriterion("resources <", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLessThanOrEqualTo(String value) {
            addCriterion("resources <=", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLike(String value) {
            addCriterion("resources like", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotLike(String value) {
            addCriterion("resources not like", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesIn(List<String> values) {
            addCriterion("resources in", values, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotIn(List<String> values) {
            addCriterion("resources not in", values, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesBetween(String value1, String value2) {
            addCriterion("resources between", value1, value2, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotBetween(String value1, String value2) {
            addCriterion("resources not between", value1, value2, "resources");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageIsNull() {
            addCriterion("CUSTOMERLANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageIsNotNull() {
            addCriterion("CUSTOMERLANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE =", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageNotEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE <>", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageGreaterThan(String value) {
            addCriterion("CUSTOMERLANGUAGE >", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE >=", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageLessThan(String value) {
            addCriterion("CUSTOMERLANGUAGE <", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE <=", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageLike(String value) {
            addCriterion("CUSTOMERLANGUAGE like", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageNotLike(String value) {
            addCriterion("CUSTOMERLANGUAGE not like", value, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageIn(List<String> values) {
            addCriterion("CUSTOMERLANGUAGE in", values, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageNotIn(List<String> values) {
            addCriterion("CUSTOMERLANGUAGE not in", values, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageBetween(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGE between", value1, value2, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguageNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGE not between", value1, value2, "customerlanguage");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreIsNull() {
            addCriterion("CUSTOMERLANGUAGESCORE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreIsNotNull() {
            addCriterion("CUSTOMERLANGUAGESCORE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE =", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreNotEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE <>", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreGreaterThan(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE >", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE >=", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreLessThan(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE <", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE <=", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreLike(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE like", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreNotLike(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE not like", value, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreIn(List<String> values) {
            addCriterion("CUSTOMERLANGUAGESCORE in", values, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreNotIn(List<String> values) {
            addCriterion("CUSTOMERLANGUAGESCORE not in", values, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreBetween(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGESCORE between", value1, value2, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescoreNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGESCORE not between", value1, value2, "customerlanguagescore");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("EXT1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("EXT1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("EXT1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("EXT1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("EXT1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("EXT1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("EXT1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("EXT1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("EXT1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("EXT1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("EXT1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("EXT1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("EXT1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("EXT1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1IsNull() {
            addCriterion("CUSTOMERLANGUAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1IsNotNull() {
            addCriterion("CUSTOMERLANGUAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1EqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE1 =", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1NotEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE1 <>", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1GreaterThan(String value) {
            addCriterion("CUSTOMERLANGUAGE1 >", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE1 >=", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1LessThan(String value) {
            addCriterion("CUSTOMERLANGUAGE1 <", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGE1 <=", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1Like(String value) {
            addCriterion("CUSTOMERLANGUAGE1 like", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1NotLike(String value) {
            addCriterion("CUSTOMERLANGUAGE1 not like", value, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1In(List<String> values) {
            addCriterion("CUSTOMERLANGUAGE1 in", values, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1NotIn(List<String> values) {
            addCriterion("CUSTOMERLANGUAGE1 not in", values, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1Between(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGE1 between", value1, value2, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguage1NotBetween(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGE1 not between", value1, value2, "customerlanguage1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1IsNull() {
            addCriterion("CUSTOMERLANGUAGESCORE1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1IsNotNull() {
            addCriterion("CUSTOMERLANGUAGESCORE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1EqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 =", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1NotEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 <>", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1GreaterThan(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 >", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 >=", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1LessThan(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 <", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 <=", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1Like(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 like", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1NotLike(String value) {
            addCriterion("CUSTOMERLANGUAGESCORE1 not like", value, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1In(List<String> values) {
            addCriterion("CUSTOMERLANGUAGESCORE1 in", values, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1NotIn(List<String> values) {
            addCriterion("CUSTOMERLANGUAGESCORE1 not in", values, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1Between(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGESCORE1 between", value1, value2, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andCustomerlanguagescore1NotBetween(String value1, String value2) {
            addCriterion("CUSTOMERLANGUAGESCORE1 not between", value1, value2, "customerlanguagescore1");
            return (Criteria) this;
        }

        public Criteria andAlertIsNull() {
            addCriterion("alert is null");
            return (Criteria) this;
        }

        public Criteria andAlertIsNotNull() {
            addCriterion("alert is not null");
            return (Criteria) this;
        }

        public Criteria andAlertEqualTo(Integer value) {
            addCriterion("alert =", value, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertNotEqualTo(Integer value) {
            addCriterion("alert <>", value, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertGreaterThan(Integer value) {
            addCriterion("alert >", value, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertGreaterThanOrEqualTo(Integer value) {
            addCriterion("alert >=", value, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertLessThan(Integer value) {
            addCriterion("alert <", value, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertLessThanOrEqualTo(Integer value) {
            addCriterion("alert <=", value, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertIn(List<Integer> values) {
            addCriterion("alert in", values, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertNotIn(List<Integer> values) {
            addCriterion("alert not in", values, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertBetween(Integer value1, Integer value2) {
            addCriterion("alert between", value1, value2, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertNotBetween(Integer value1, Integer value2) {
            addCriterion("alert not between", value1, value2, "alert");
            return (Criteria) this;
        }

        public Criteria andAlertmessageIsNull() {
            addCriterion("alertMessage is null");
            return (Criteria) this;
        }

        public Criteria andAlertmessageIsNotNull() {
            addCriterion("alertMessage is not null");
            return (Criteria) this;
        }

        public Criteria andAlertmessageEqualTo(String value) {
            addCriterion("alertMessage =", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageNotEqualTo(String value) {
            addCriterion("alertMessage <>", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageGreaterThan(String value) {
            addCriterion("alertMessage >", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageGreaterThanOrEqualTo(String value) {
            addCriterion("alertMessage >=", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageLessThan(String value) {
            addCriterion("alertMessage <", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageLessThanOrEqualTo(String value) {
            addCriterion("alertMessage <=", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageLike(String value) {
            addCriterion("alertMessage like", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageNotLike(String value) {
            addCriterion("alertMessage not like", value, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageIn(List<String> values) {
            addCriterion("alertMessage in", values, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageNotIn(List<String> values) {
            addCriterion("alertMessage not in", values, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageBetween(String value1, String value2) {
            addCriterion("alertMessage between", value1, value2, "alertmessage");
            return (Criteria) this;
        }

        public Criteria andAlertmessageNotBetween(String value1, String value2) {
            addCriterion("alertMessage not between", value1, value2, "alertmessage");
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