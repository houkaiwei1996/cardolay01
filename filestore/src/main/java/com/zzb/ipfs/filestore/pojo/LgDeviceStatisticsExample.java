package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.List;

public class LgDeviceStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgDeviceStatisticsExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andMemoryCapacityIsNull() {
            addCriterion("memory_capacity is null");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityIsNotNull() {
            addCriterion("memory_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityEqualTo(String value) {
            addCriterion("memory_capacity =", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotEqualTo(String value) {
            addCriterion("memory_capacity <>", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityGreaterThan(String value) {
            addCriterion("memory_capacity >", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("memory_capacity >=", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLessThan(String value) {
            addCriterion("memory_capacity <", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLessThanOrEqualTo(String value) {
            addCriterion("memory_capacity <=", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLike(String value) {
            addCriterion("memory_capacity like", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotLike(String value) {
            addCriterion("memory_capacity not like", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityIn(List<String> values) {
            addCriterion("memory_capacity in", values, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotIn(List<String> values) {
            addCriterion("memory_capacity not in", values, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityBetween(String value1, String value2) {
            addCriterion("memory_capacity between", value1, value2, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotBetween(String value1, String value2) {
            addCriterion("memory_capacity not between", value1, value2, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andFiledataIsNull() {
            addCriterion("filedata is null");
            return (Criteria) this;
        }

        public Criteria andFiledataIsNotNull() {
            addCriterion("filedata is not null");
            return (Criteria) this;
        }

        public Criteria andFiledataEqualTo(Integer value) {
            addCriterion("filedata =", value, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataNotEqualTo(Integer value) {
            addCriterion("filedata <>", value, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataGreaterThan(Integer value) {
            addCriterion("filedata >", value, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataGreaterThanOrEqualTo(Integer value) {
            addCriterion("filedata >=", value, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataLessThan(Integer value) {
            addCriterion("filedata <", value, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataLessThanOrEqualTo(Integer value) {
            addCriterion("filedata <=", value, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataIn(List<Integer> values) {
            addCriterion("filedata in", values, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataNotIn(List<Integer> values) {
            addCriterion("filedata not in", values, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataBetween(Integer value1, Integer value2) {
            addCriterion("filedata between", value1, value2, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiledataNotBetween(Integer value1, Integer value2) {
            addCriterion("filedata not between", value1, value2, "filedata");
            return (Criteria) this;
        }

        public Criteria andFiletimeIsNull() {
            addCriterion("filetime is null");
            return (Criteria) this;
        }

        public Criteria andFiletimeIsNotNull() {
            addCriterion("filetime is not null");
            return (Criteria) this;
        }

        public Criteria andFiletimeEqualTo(Integer value) {
            addCriterion("filetime =", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeNotEqualTo(Integer value) {
            addCriterion("filetime <>", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeGreaterThan(Integer value) {
            addCriterion("filetime >", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("filetime >=", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeLessThan(Integer value) {
            addCriterion("filetime <", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeLessThanOrEqualTo(Integer value) {
            addCriterion("filetime <=", value, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeIn(List<Integer> values) {
            addCriterion("filetime in", values, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeNotIn(List<Integer> values) {
            addCriterion("filetime not in", values, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeBetween(Integer value1, Integer value2) {
            addCriterion("filetime between", value1, value2, "filetime");
            return (Criteria) this;
        }

        public Criteria andFiletimeNotBetween(Integer value1, Integer value2) {
            addCriterion("filetime not between", value1, value2, "filetime");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficIsNull() {
            addCriterion("upload_traffic is null");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficIsNotNull() {
            addCriterion("upload_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficEqualTo(Integer value) {
            addCriterion("upload_traffic =", value, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficNotEqualTo(Integer value) {
            addCriterion("upload_traffic <>", value, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficGreaterThan(Integer value) {
            addCriterion("upload_traffic >", value, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_traffic >=", value, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficLessThan(Integer value) {
            addCriterion("upload_traffic <", value, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficLessThanOrEqualTo(Integer value) {
            addCriterion("upload_traffic <=", value, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficIn(List<Integer> values) {
            addCriterion("upload_traffic in", values, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficNotIn(List<Integer> values) {
            addCriterion("upload_traffic not in", values, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficBetween(Integer value1, Integer value2) {
            addCriterion("upload_traffic between", value1, value2, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadTrafficNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_traffic not between", value1, value2, "uploadTraffic");
            return (Criteria) this;
        }

        public Criteria andUploadChannelIsNull() {
            addCriterion("upload_channel is null");
            return (Criteria) this;
        }

        public Criteria andUploadChannelIsNotNull() {
            addCriterion("upload_channel is not null");
            return (Criteria) this;
        }

        public Criteria andUploadChannelEqualTo(Integer value) {
            addCriterion("upload_channel =", value, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelNotEqualTo(Integer value) {
            addCriterion("upload_channel <>", value, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelGreaterThan(Integer value) {
            addCriterion("upload_channel >", value, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_channel >=", value, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelLessThan(Integer value) {
            addCriterion("upload_channel <", value, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelLessThanOrEqualTo(Integer value) {
            addCriterion("upload_channel <=", value, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelIn(List<Integer> values) {
            addCriterion("upload_channel in", values, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelNotIn(List<Integer> values) {
            addCriterion("upload_channel not in", values, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelBetween(Integer value1, Integer value2) {
            addCriterion("upload_channel between", value1, value2, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_channel not between", value1, value2, "uploadChannel");
            return (Criteria) this;
        }

        public Criteria andUploadUserIsNull() {
            addCriterion("upload_user is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIsNotNull() {
            addCriterion("upload_user is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserEqualTo(Integer value) {
            addCriterion("upload_user =", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotEqualTo(Integer value) {
            addCriterion("upload_user <>", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserGreaterThan(Integer value) {
            addCriterion("upload_user >", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_user >=", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLessThan(Integer value) {
            addCriterion("upload_user <", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLessThanOrEqualTo(Integer value) {
            addCriterion("upload_user <=", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserIn(List<Integer> values) {
            addCriterion("upload_user in", values, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotIn(List<Integer> values) {
            addCriterion("upload_user not in", values, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserBetween(Integer value1, Integer value2) {
            addCriterion("upload_user between", value1, value2, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_user not between", value1, value2, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthIsNull() {
            addCriterion("stockpile_bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthIsNotNull() {
            addCriterion("stockpile_bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthEqualTo(Integer value) {
            addCriterion("stockpile_bandwidth =", value, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthNotEqualTo(Integer value) {
            addCriterion("stockpile_bandwidth <>", value, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthGreaterThan(Integer value) {
            addCriterion("stockpile_bandwidth >", value, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockpile_bandwidth >=", value, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthLessThan(Integer value) {
            addCriterion("stockpile_bandwidth <", value, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthLessThanOrEqualTo(Integer value) {
            addCriterion("stockpile_bandwidth <=", value, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthIn(List<Integer> values) {
            addCriterion("stockpile_bandwidth in", values, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthNotIn(List<Integer> values) {
            addCriterion("stockpile_bandwidth not in", values, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthBetween(Integer value1, Integer value2) {
            addCriterion("stockpile_bandwidth between", value1, value2, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andStockpileBandwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("stockpile_bandwidth not between", value1, value2, "stockpileBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthIsNull() {
            addCriterion("upload_bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthIsNotNull() {
            addCriterion("upload_bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthEqualTo(Integer value) {
            addCriterion("upload_bandwidth =", value, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthNotEqualTo(Integer value) {
            addCriterion("upload_bandwidth <>", value, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthGreaterThan(Integer value) {
            addCriterion("upload_bandwidth >", value, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_bandwidth >=", value, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthLessThan(Integer value) {
            addCriterion("upload_bandwidth <", value, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthLessThanOrEqualTo(Integer value) {
            addCriterion("upload_bandwidth <=", value, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthIn(List<Integer> values) {
            addCriterion("upload_bandwidth in", values, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthNotIn(List<Integer> values) {
            addCriterion("upload_bandwidth not in", values, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthBetween(Integer value1, Integer value2) {
            addCriterion("upload_bandwidth between", value1, value2, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andUploadBandwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_bandwidth not between", value1, value2, "uploadBandwidth");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
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