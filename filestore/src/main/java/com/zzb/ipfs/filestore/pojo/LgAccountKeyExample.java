package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.List;

public class LgAccountKeyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgAccountKeyExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(String value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(String value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(String value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(String value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(String value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(String value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLike(String value) {
            addCriterion("aid like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotLike(String value) {
            addCriterion("aid not like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<String> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<String> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(String value1, String value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(String value1, String value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andSecretidIsNull() {
            addCriterion("secretId is null");
            return (Criteria) this;
        }

        public Criteria andSecretidIsNotNull() {
            addCriterion("secretId is not null");
            return (Criteria) this;
        }

        public Criteria andSecretidEqualTo(String value) {
            addCriterion("secretId =", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidNotEqualTo(String value) {
            addCriterion("secretId <>", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidGreaterThan(String value) {
            addCriterion("secretId >", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidGreaterThanOrEqualTo(String value) {
            addCriterion("secretId >=", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidLessThan(String value) {
            addCriterion("secretId <", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidLessThanOrEqualTo(String value) {
            addCriterion("secretId <=", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidLike(String value) {
            addCriterion("secretId like", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidNotLike(String value) {
            addCriterion("secretId not like", value, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidIn(List<String> values) {
            addCriterion("secretId in", values, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidNotIn(List<String> values) {
            addCriterion("secretId not in", values, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidBetween(String value1, String value2) {
            addCriterion("secretId between", value1, value2, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretidNotBetween(String value1, String value2) {
            addCriterion("secretId not between", value1, value2, "secretid");
            return (Criteria) this;
        }

        public Criteria andSecretkeyIsNull() {
            addCriterion("SecretKey is null");
            return (Criteria) this;
        }

        public Criteria andSecretkeyIsNotNull() {
            addCriterion("SecretKey is not null");
            return (Criteria) this;
        }

        public Criteria andSecretkeyEqualTo(String value) {
            addCriterion("SecretKey =", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotEqualTo(String value) {
            addCriterion("SecretKey <>", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyGreaterThan(String value) {
            addCriterion("SecretKey >", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyGreaterThanOrEqualTo(String value) {
            addCriterion("SecretKey >=", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyLessThan(String value) {
            addCriterion("SecretKey <", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyLessThanOrEqualTo(String value) {
            addCriterion("SecretKey <=", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyLike(String value) {
            addCriterion("SecretKey like", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotLike(String value) {
            addCriterion("SecretKey not like", value, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyIn(List<String> values) {
            addCriterion("SecretKey in", values, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotIn(List<String> values) {
            addCriterion("SecretKey not in", values, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyBetween(String value1, String value2) {
            addCriterion("SecretKey between", value1, value2, "secretkey");
            return (Criteria) this;
        }

        public Criteria andSecretkeyNotBetween(String value1, String value2) {
            addCriterion("SecretKey not between", value1, value2, "secretkey");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeIsNull() {
            addCriterion("currenttime is null");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeIsNotNull() {
            addCriterion("currenttime is not null");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeEqualTo(Long value) {
            addCriterion("currenttime =", value, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeNotEqualTo(Long value) {
            addCriterion("currenttime <>", value, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeGreaterThan(Long value) {
            addCriterion("currenttime >", value, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeGreaterThanOrEqualTo(Long value) {
            addCriterion("currenttime >=", value, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeLessThan(Long value) {
            addCriterion("currenttime <", value, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeLessThanOrEqualTo(Long value) {
            addCriterion("currenttime <=", value, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeIn(List<Long> values) {
            addCriterion("currenttime in", values, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeNotIn(List<Long> values) {
            addCriterion("currenttime not in", values, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeBetween(Long value1, Long value2) {
            addCriterion("currenttime between", value1, value2, "currenttime");
            return (Criteria) this;
        }

        public Criteria andCurrenttimeNotBetween(Long value1, Long value2) {
            addCriterion("currenttime not between", value1, value2, "currenttime");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andDelKeyIsNull() {
            addCriterion("del_key is null");
            return (Criteria) this;
        }

        public Criteria andDelKeyIsNotNull() {
            addCriterion("del_key is not null");
            return (Criteria) this;
        }

        public Criteria andDelKeyEqualTo(Integer value) {
            addCriterion("del_key =", value, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyNotEqualTo(Integer value) {
            addCriterion("del_key <>", value, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyGreaterThan(Integer value) {
            addCriterion("del_key >", value, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_key >=", value, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyLessThan(Integer value) {
            addCriterion("del_key <", value, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyLessThanOrEqualTo(Integer value) {
            addCriterion("del_key <=", value, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyIn(List<Integer> values) {
            addCriterion("del_key in", values, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyNotIn(List<Integer> values) {
            addCriterion("del_key not in", values, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyBetween(Integer value1, Integer value2) {
            addCriterion("del_key between", value1, value2, "delKey");
            return (Criteria) this;
        }

        public Criteria andDelKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("del_key not between", value1, value2, "delKey");
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