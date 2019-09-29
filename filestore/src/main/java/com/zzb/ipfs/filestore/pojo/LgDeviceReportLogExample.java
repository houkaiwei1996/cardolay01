package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.List;

public class LgDeviceReportLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgDeviceReportLogExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDevSnIsNull() {
            addCriterion("dev_sn is null");
            return (Criteria) this;
        }

        public Criteria andDevSnIsNotNull() {
            addCriterion("dev_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDevSnEqualTo(String value) {
            addCriterion("dev_sn =", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotEqualTo(String value) {
            addCriterion("dev_sn <>", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnGreaterThan(String value) {
            addCriterion("dev_sn >", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnGreaterThanOrEqualTo(String value) {
            addCriterion("dev_sn >=", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnLessThan(String value) {
            addCriterion("dev_sn <", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnLessThanOrEqualTo(String value) {
            addCriterion("dev_sn <=", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnLike(String value) {
            addCriterion("dev_sn like", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotLike(String value) {
            addCriterion("dev_sn not like", value, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnIn(List<String> values) {
            addCriterion("dev_sn in", values, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotIn(List<String> values) {
            addCriterion("dev_sn not in", values, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnBetween(String value1, String value2) {
            addCriterion("dev_sn between", value1, value2, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotBetween(String value1, String value2) {
            addCriterion("dev_sn not between", value1, value2, "devSn");
            return (Criteria) this;
        }

        public Criteria andDevIpIsNull() {
            addCriterion("dev_ip is null");
            return (Criteria) this;
        }

        public Criteria andDevIpIsNotNull() {
            addCriterion("dev_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDevIpEqualTo(String value) {
            addCriterion("dev_ip =", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpNotEqualTo(String value) {
            addCriterion("dev_ip <>", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpGreaterThan(String value) {
            addCriterion("dev_ip >", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpGreaterThanOrEqualTo(String value) {
            addCriterion("dev_ip >=", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpLessThan(String value) {
            addCriterion("dev_ip <", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpLessThanOrEqualTo(String value) {
            addCriterion("dev_ip <=", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpLike(String value) {
            addCriterion("dev_ip like", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpNotLike(String value) {
            addCriterion("dev_ip not like", value, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpIn(List<String> values) {
            addCriterion("dev_ip in", values, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpNotIn(List<String> values) {
            addCriterion("dev_ip not in", values, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpBetween(String value1, String value2) {
            addCriterion("dev_ip between", value1, value2, "devIp");
            return (Criteria) this;
        }

        public Criteria andDevIpNotBetween(String value1, String value2) {
            addCriterion("dev_ip not between", value1, value2, "devIp");
            return (Criteria) this;
        }

        public Criteria andIpfsHashIsNull() {
            addCriterion("ipfs_hash is null");
            return (Criteria) this;
        }

        public Criteria andIpfsHashIsNotNull() {
            addCriterion("ipfs_hash is not null");
            return (Criteria) this;
        }

        public Criteria andIpfsHashEqualTo(String value) {
            addCriterion("ipfs_hash =", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashNotEqualTo(String value) {
            addCriterion("ipfs_hash <>", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashGreaterThan(String value) {
            addCriterion("ipfs_hash >", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashGreaterThanOrEqualTo(String value) {
            addCriterion("ipfs_hash >=", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashLessThan(String value) {
            addCriterion("ipfs_hash <", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashLessThanOrEqualTo(String value) {
            addCriterion("ipfs_hash <=", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashLike(String value) {
            addCriterion("ipfs_hash like", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashNotLike(String value) {
            addCriterion("ipfs_hash not like", value, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashIn(List<String> values) {
            addCriterion("ipfs_hash in", values, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashNotIn(List<String> values) {
            addCriterion("ipfs_hash not in", values, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashBetween(String value1, String value2) {
            addCriterion("ipfs_hash between", value1, value2, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andIpfsHashNotBetween(String value1, String value2) {
            addCriterion("ipfs_hash not between", value1, value2, "ipfsHash");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(Integer value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(Integer value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(Integer value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(Integer value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<Integer> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<Integer> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(Integer value1, Integer value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoIsNull() {
            addCriterion("log_seqno is null");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoIsNotNull() {
            addCriterion("log_seqno is not null");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoEqualTo(Integer value) {
            addCriterion("log_seqno =", value, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoNotEqualTo(Integer value) {
            addCriterion("log_seqno <>", value, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoGreaterThan(Integer value) {
            addCriterion("log_seqno >", value, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_seqno >=", value, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoLessThan(Integer value) {
            addCriterion("log_seqno <", value, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoLessThanOrEqualTo(Integer value) {
            addCriterion("log_seqno <=", value, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoIn(List<Integer> values) {
            addCriterion("log_seqno in", values, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoNotIn(List<Integer> values) {
            addCriterion("log_seqno not in", values, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoBetween(Integer value1, Integer value2) {
            addCriterion("log_seqno between", value1, value2, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andLogSeqnoNotBetween(Integer value1, Integer value2) {
            addCriterion("log_seqno not between", value1, value2, "logSeqno");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("record_id like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("record_id not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntIsNull() {
            addCriterion("sub_pkg_cnt is null");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntIsNotNull() {
            addCriterion("sub_pkg_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntEqualTo(Integer value) {
            addCriterion("sub_pkg_cnt =", value, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntNotEqualTo(Integer value) {
            addCriterion("sub_pkg_cnt <>", value, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntGreaterThan(Integer value) {
            addCriterion("sub_pkg_cnt >", value, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_pkg_cnt >=", value, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntLessThan(Integer value) {
            addCriterion("sub_pkg_cnt <", value, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntLessThanOrEqualTo(Integer value) {
            addCriterion("sub_pkg_cnt <=", value, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntIn(List<Integer> values) {
            addCriterion("sub_pkg_cnt in", values, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntNotIn(List<Integer> values) {
            addCriterion("sub_pkg_cnt not in", values, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntBetween(Integer value1, Integer value2) {
            addCriterion("sub_pkg_cnt between", value1, value2, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andSubPkgCntNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_pkg_cnt not between", value1, value2, "subPkgCnt");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIsNull() {
            addCriterion("time_create is null");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIsNotNull() {
            addCriterion("time_create is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCreateEqualTo(Long value) {
            addCriterion("time_create =", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotEqualTo(Long value) {
            addCriterion("time_create <>", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateGreaterThan(Long value) {
            addCriterion("time_create >", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("time_create >=", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateLessThan(Long value) {
            addCriterion("time_create <", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateLessThanOrEqualTo(Long value) {
            addCriterion("time_create <=", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIn(List<Long> values) {
            addCriterion("time_create in", values, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotIn(List<Long> values) {
            addCriterion("time_create not in", values, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateBetween(Long value1, Long value2) {
            addCriterion("time_create between", value1, value2, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotBetween(Long value1, Long value2) {
            addCriterion("time_create not between", value1, value2, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateIsNull() {
            addCriterion("time_update is null");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateIsNotNull() {
            addCriterion("time_update is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateEqualTo(Long value) {
            addCriterion("time_update =", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateNotEqualTo(Long value) {
            addCriterion("time_update <>", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateGreaterThan(Long value) {
            addCriterion("time_update >", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("time_update >=", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateLessThan(Long value) {
            addCriterion("time_update <", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateLessThanOrEqualTo(Long value) {
            addCriterion("time_update <=", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateIn(List<Long> values) {
            addCriterion("time_update in", values, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateNotIn(List<Long> values) {
            addCriterion("time_update not in", values, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateBetween(Long value1, Long value2) {
            addCriterion("time_update between", value1, value2, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateNotBetween(Long value1, Long value2) {
            addCriterion("time_update not between", value1, value2, "timeUpdate");
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