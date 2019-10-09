package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.List;

public class LgChannelStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgChannelStatisticsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddupIsNull() {
            addCriterion("addup is null");
            return (Criteria) this;
        }

        public Criteria andAddupIsNotNull() {
            addCriterion("addup is not null");
            return (Criteria) this;
        }

        public Criteria andAddupEqualTo(Integer value) {
            addCriterion("addup =", value, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupNotEqualTo(Integer value) {
            addCriterion("addup <>", value, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupGreaterThan(Integer value) {
            addCriterion("addup >", value, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupGreaterThanOrEqualTo(Integer value) {
            addCriterion("addup >=", value, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupLessThan(Integer value) {
            addCriterion("addup <", value, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupLessThanOrEqualTo(Integer value) {
            addCriterion("addup <=", value, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupIn(List<Integer> values) {
            addCriterion("addup in", values, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupNotIn(List<Integer> values) {
            addCriterion("addup not in", values, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupBetween(Integer value1, Integer value2) {
            addCriterion("addup between", value1, value2, "addup");
            return (Criteria) this;
        }

        public Criteria andAddupNotBetween(Integer value1, Integer value2) {
            addCriterion("addup not between", value1, value2, "addup");
            return (Criteria) this;
        }

        public Criteria andBackupsIsNull() {
            addCriterion("backups is null");
            return (Criteria) this;
        }

        public Criteria andBackupsIsNotNull() {
            addCriterion("backups is not null");
            return (Criteria) this;
        }

        public Criteria andBackupsEqualTo(Integer value) {
            addCriterion("backups =", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsNotEqualTo(Integer value) {
            addCriterion("backups <>", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsGreaterThan(Integer value) {
            addCriterion("backups >", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsGreaterThanOrEqualTo(Integer value) {
            addCriterion("backups >=", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsLessThan(Integer value) {
            addCriterion("backups <", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsLessThanOrEqualTo(Integer value) {
            addCriterion("backups <=", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsIn(List<Integer> values) {
            addCriterion("backups in", values, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsNotIn(List<Integer> values) {
            addCriterion("backups not in", values, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsBetween(Integer value1, Integer value2) {
            addCriterion("backups between", value1, value2, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsNotBetween(Integer value1, Integer value2) {
            addCriterion("backups not between", value1, value2, "backups");
            return (Criteria) this;
        }

        public Criteria andAddQuantityIsNull() {
            addCriterion("add_quantity is null");
            return (Criteria) this;
        }

        public Criteria andAddQuantityIsNotNull() {
            addCriterion("add_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andAddQuantityEqualTo(Integer value) {
            addCriterion("add_quantity =", value, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityNotEqualTo(Integer value) {
            addCriterion("add_quantity <>", value, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityGreaterThan(Integer value) {
            addCriterion("add_quantity >", value, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_quantity >=", value, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityLessThan(Integer value) {
            addCriterion("add_quantity <", value, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("add_quantity <=", value, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityIn(List<Integer> values) {
            addCriterion("add_quantity in", values, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityNotIn(List<Integer> values) {
            addCriterion("add_quantity not in", values, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityBetween(Integer value1, Integer value2) {
            addCriterion("add_quantity between", value1, value2, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andAddQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("add_quantity not between", value1, value2, "addQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityIsNull() {
            addCriterion("backups_quantity is null");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityIsNotNull() {
            addCriterion("backups_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityEqualTo(Integer value) {
            addCriterion("backups_quantity =", value, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityNotEqualTo(Integer value) {
            addCriterion("backups_quantity <>", value, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityGreaterThan(Integer value) {
            addCriterion("backups_quantity >", value, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("backups_quantity >=", value, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityLessThan(Integer value) {
            addCriterion("backups_quantity <", value, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("backups_quantity <=", value, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityIn(List<Integer> values) {
            addCriterion("backups_quantity in", values, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityNotIn(List<Integer> values) {
            addCriterion("backups_quantity not in", values, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityBetween(Integer value1, Integer value2) {
            addCriterion("backups_quantity between", value1, value2, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andBackupsQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("backups_quantity not between", value1, value2, "backupsQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadIsNull() {
            addCriterion("add_download is null");
            return (Criteria) this;
        }

        public Criteria andAddDownloadIsNotNull() {
            addCriterion("add_download is not null");
            return (Criteria) this;
        }

        public Criteria andAddDownloadEqualTo(Integer value) {
            addCriterion("add_download =", value, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadNotEqualTo(Integer value) {
            addCriterion("add_download <>", value, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadGreaterThan(Integer value) {
            addCriterion("add_download >", value, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_download >=", value, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadLessThan(Integer value) {
            addCriterion("add_download <", value, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("add_download <=", value, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadIn(List<Integer> values) {
            addCriterion("add_download in", values, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadNotIn(List<Integer> values) {
            addCriterion("add_download not in", values, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadBetween(Integer value1, Integer value2) {
            addCriterion("add_download between", value1, value2, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("add_download not between", value1, value2, "addDownload");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityIsNull() {
            addCriterion("add_download_quantity is null");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityIsNotNull() {
            addCriterion("add_download_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityEqualTo(Integer value) {
            addCriterion("add_download_quantity =", value, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityNotEqualTo(Integer value) {
            addCriterion("add_download_quantity <>", value, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityGreaterThan(Integer value) {
            addCriterion("add_download_quantity >", value, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_download_quantity >=", value, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityLessThan(Integer value) {
            addCriterion("add_download_quantity <", value, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("add_download_quantity <=", value, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityIn(List<Integer> values) {
            addCriterion("add_download_quantity in", values, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityNotIn(List<Integer> values) {
            addCriterion("add_download_quantity not in", values, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityBetween(Integer value1, Integer value2) {
            addCriterion("add_download_quantity between", value1, value2, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddDownloadQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("add_download_quantity not between", value1, value2, "addDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddUserIsNull() {
            addCriterion("add_user is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIsNotNull() {
            addCriterion("add_user is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserEqualTo(Integer value) {
            addCriterion("add_user =", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotEqualTo(Integer value) {
            addCriterion("add_user <>", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThan(Integer value) {
            addCriterion("add_user >", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_user >=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThan(Integer value) {
            addCriterion("add_user <", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThanOrEqualTo(Integer value) {
            addCriterion("add_user <=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserIn(List<Integer> values) {
            addCriterion("add_user in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotIn(List<Integer> values) {
            addCriterion("add_user not in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserBetween(Integer value1, Integer value2) {
            addCriterion("add_user between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotBetween(Integer value1, Integer value2) {
            addCriterion("add_user not between", value1, value2, "addUser");
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