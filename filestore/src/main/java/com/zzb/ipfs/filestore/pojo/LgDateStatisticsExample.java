package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.List;

public class LgDateStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgDateStatisticsExample() {
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

        public Criteria andDateStatisticsIsNull() {
            addCriterion("date_statistics is null");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsIsNotNull() {
            addCriterion("date_statistics is not null");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsEqualTo(String value) {
            addCriterion("date_statistics =", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsNotEqualTo(String value) {
            addCriterion("date_statistics <>", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsGreaterThan(String value) {
            addCriterion("date_statistics >", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsGreaterThanOrEqualTo(String value) {
            addCriterion("date_statistics >=", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsLessThan(String value) {
            addCriterion("date_statistics <", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsLessThanOrEqualTo(String value) {
            addCriterion("date_statistics <=", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsLike(String value) {
            addCriterion("date_statistics like", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsNotLike(String value) {
            addCriterion("date_statistics not like", value, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsIn(List<String> values) {
            addCriterion("date_statistics in", values, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsNotIn(List<String> values) {
            addCriterion("date_statistics not in", values, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsBetween(String value1, String value2) {
            addCriterion("date_statistics between", value1, value2, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andDateStatisticsNotBetween(String value1, String value2) {
            addCriterion("date_statistics not between", value1, value2, "dateStatistics");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
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

        public Criteria andMemoryCapacityEqualTo(Integer value) {
            addCriterion("memory_capacity =", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotEqualTo(Integer value) {
            addCriterion("memory_capacity <>", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityGreaterThan(Integer value) {
            addCriterion("memory_capacity >", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory_capacity >=", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLessThan(Integer value) {
            addCriterion("memory_capacity <", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("memory_capacity <=", value, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityIn(List<Integer> values) {
            addCriterion("memory_capacity in", values, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotIn(List<Integer> values) {
            addCriterion("memory_capacity not in", values, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityBetween(Integer value1, Integer value2) {
            addCriterion("memory_capacity between", value1, value2, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andMemoryCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("memory_capacity not between", value1, value2, "memoryCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityIsNull() {
            addCriterion("backup_capacity is null");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityIsNotNull() {
            addCriterion("backup_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityEqualTo(Integer value) {
            addCriterion("backup_capacity =", value, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityNotEqualTo(Integer value) {
            addCriterion("backup_capacity <>", value, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityGreaterThan(Integer value) {
            addCriterion("backup_capacity >", value, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("backup_capacity >=", value, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityLessThan(Integer value) {
            addCriterion("backup_capacity <", value, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("backup_capacity <=", value, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityIn(List<Integer> values) {
            addCriterion("backup_capacity in", values, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityNotIn(List<Integer> values) {
            addCriterion("backup_capacity not in", values, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityBetween(Integer value1, Integer value2) {
            addCriterion("backup_capacity between", value1, value2, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andBackupCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("backup_capacity not between", value1, value2, "backupCapacity");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeIsNull() {
            addCriterion("backup_size is null");
            return (Criteria) this;
        }

        public Criteria andBackupSizeIsNotNull() {
            addCriterion("backup_size is not null");
            return (Criteria) this;
        }

        public Criteria andBackupSizeEqualTo(Integer value) {
            addCriterion("backup_size =", value, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeNotEqualTo(Integer value) {
            addCriterion("backup_size <>", value, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeGreaterThan(Integer value) {
            addCriterion("backup_size >", value, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("backup_size >=", value, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeLessThan(Integer value) {
            addCriterion("backup_size <", value, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeLessThanOrEqualTo(Integer value) {
            addCriterion("backup_size <=", value, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeIn(List<Integer> values) {
            addCriterion("backup_size in", values, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeNotIn(List<Integer> values) {
            addCriterion("backup_size not in", values, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeBetween(Integer value1, Integer value2) {
            addCriterion("backup_size between", value1, value2, "backupSize");
            return (Criteria) this;
        }

        public Criteria andBackupSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("backup_size not between", value1, value2, "backupSize");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowIsNull() {
            addCriterion("download_flow is null");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowIsNotNull() {
            addCriterion("download_flow is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowEqualTo(Integer value) {
            addCriterion("download_flow =", value, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowNotEqualTo(Integer value) {
            addCriterion("download_flow <>", value, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowGreaterThan(Integer value) {
            addCriterion("download_flow >", value, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_flow >=", value, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowLessThan(Integer value) {
            addCriterion("download_flow <", value, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowLessThanOrEqualTo(Integer value) {
            addCriterion("download_flow <=", value, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowIn(List<Integer> values) {
            addCriterion("download_flow in", values, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowNotIn(List<Integer> values) {
            addCriterion("download_flow not in", values, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowBetween(Integer value1, Integer value2) {
            addCriterion("download_flow between", value1, value2, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadFlowNotBetween(Integer value1, Integer value2) {
            addCriterion("download_flow not between", value1, value2, "downloadFlow");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeIsNull() {
            addCriterion("download_size is null");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeIsNotNull() {
            addCriterion("download_size is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeEqualTo(Integer value) {
            addCriterion("download_size =", value, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeNotEqualTo(Integer value) {
            addCriterion("download_size <>", value, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeGreaterThan(Integer value) {
            addCriterion("download_size >", value, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_size >=", value, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeLessThan(Integer value) {
            addCriterion("download_size <", value, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeLessThanOrEqualTo(Integer value) {
            addCriterion("download_size <=", value, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeIn(List<Integer> values) {
            addCriterion("download_size in", values, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeNotIn(List<Integer> values) {
            addCriterion("download_size not in", values, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeBetween(Integer value1, Integer value2) {
            addCriterion("download_size between", value1, value2, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("download_size not between", value1, value2, "downloadSize");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeIsNull() {
            addCriterion("downloadtime is null");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeIsNotNull() {
            addCriterion("downloadtime is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeEqualTo(Integer value) {
            addCriterion("downloadtime =", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeNotEqualTo(Integer value) {
            addCriterion("downloadtime <>", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeGreaterThan(Integer value) {
            addCriterion("downloadtime >", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloadtime >=", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeLessThan(Integer value) {
            addCriterion("downloadtime <", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeLessThanOrEqualTo(Integer value) {
            addCriterion("downloadtime <=", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeIn(List<Integer> values) {
            addCriterion("downloadtime in", values, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeNotIn(List<Integer> values) {
            addCriterion("downloadtime not in", values, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeBetween(Integer value1, Integer value2) {
            addCriterion("downloadtime between", value1, value2, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("downloadtime not between", value1, value2, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadUserIsNull() {
            addCriterion("download_user is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUserIsNotNull() {
            addCriterion("download_user is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUserEqualTo(Integer value) {
            addCriterion("download_user =", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserNotEqualTo(Integer value) {
            addCriterion("download_user <>", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserGreaterThan(Integer value) {
            addCriterion("download_user >", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_user >=", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserLessThan(Integer value) {
            addCriterion("download_user <", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserLessThanOrEqualTo(Integer value) {
            addCriterion("download_user <=", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserIn(List<Integer> values) {
            addCriterion("download_user in", values, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserNotIn(List<Integer> values) {
            addCriterion("download_user not in", values, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserBetween(Integer value1, Integer value2) {
            addCriterion("download_user between", value1, value2, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserNotBetween(Integer value1, Integer value2) {
            addCriterion("download_user not between", value1, value2, "downloadUser");
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