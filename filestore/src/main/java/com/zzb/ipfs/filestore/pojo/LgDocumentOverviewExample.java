package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.List;

public class LgDocumentOverviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgDocumentOverviewExample() {
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

        public Criteria andDevNameIsNull() {
            addCriterion("dev_name is null");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNotNull() {
            addCriterion("dev_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevNameEqualTo(String value) {
            addCriterion("dev_name =", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotEqualTo(String value) {
            addCriterion("dev_name <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThan(String value) {
            addCriterion("dev_name >", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_name >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThan(String value) {
            addCriterion("dev_name <", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThanOrEqualTo(String value) {
            addCriterion("dev_name <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLike(String value) {
            addCriterion("dev_name like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotLike(String value) {
            addCriterion("dev_name not like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameIn(List<String> values) {
            addCriterion("dev_name in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotIn(List<String> values) {
            addCriterion("dev_name not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameBetween(String value1, String value2) {
            addCriterion("dev_name between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotBetween(String value1, String value2) {
            addCriterion("dev_name not between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNull() {
            addCriterion("dev_type is null");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNotNull() {
            addCriterion("dev_type is not null");
            return (Criteria) this;
        }

        public Criteria andDevTypeEqualTo(String value) {
            addCriterion("dev_type =", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotEqualTo(String value) {
            addCriterion("dev_type <>", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThan(String value) {
            addCriterion("dev_type >", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dev_type >=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThan(String value) {
            addCriterion("dev_type <", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThanOrEqualTo(String value) {
            addCriterion("dev_type <=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLike(String value) {
            addCriterion("dev_type like", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotLike(String value) {
            addCriterion("dev_type not like", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeIn(List<String> values) {
            addCriterion("dev_type in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotIn(List<String> values) {
            addCriterion("dev_type not in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeBetween(String value1, String value2) {
            addCriterion("dev_type between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotBetween(String value1, String value2) {
            addCriterion("dev_type not between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevLabelIsNull() {
            addCriterion("dev_label is null");
            return (Criteria) this;
        }

        public Criteria andDevLabelIsNotNull() {
            addCriterion("dev_label is not null");
            return (Criteria) this;
        }

        public Criteria andDevLabelEqualTo(String value) {
            addCriterion("dev_label =", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelNotEqualTo(String value) {
            addCriterion("dev_label <>", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelGreaterThan(String value) {
            addCriterion("dev_label >", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelGreaterThanOrEqualTo(String value) {
            addCriterion("dev_label >=", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelLessThan(String value) {
            addCriterion("dev_label <", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelLessThanOrEqualTo(String value) {
            addCriterion("dev_label <=", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelLike(String value) {
            addCriterion("dev_label like", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelNotLike(String value) {
            addCriterion("dev_label not like", value, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelIn(List<String> values) {
            addCriterion("dev_label in", values, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelNotIn(List<String> values) {
            addCriterion("dev_label not in", values, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelBetween(String value1, String value2) {
            addCriterion("dev_label between", value1, value2, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevLabelNotBetween(String value1, String value2) {
            addCriterion("dev_label not between", value1, value2, "devLabel");
            return (Criteria) this;
        }

        public Criteria andDevSizeIsNull() {
            addCriterion("dev_size is null");
            return (Criteria) this;
        }

        public Criteria andDevSizeIsNotNull() {
            addCriterion("dev_size is not null");
            return (Criteria) this;
        }

        public Criteria andDevSizeEqualTo(Integer value) {
            addCriterion("dev_size =", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeNotEqualTo(Integer value) {
            addCriterion("dev_size <>", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeGreaterThan(Integer value) {
            addCriterion("dev_size >", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_size >=", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeLessThan(Integer value) {
            addCriterion("dev_size <", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeLessThanOrEqualTo(Integer value) {
            addCriterion("dev_size <=", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeIn(List<Integer> values) {
            addCriterion("dev_size in", values, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeNotIn(List<Integer> values) {
            addCriterion("dev_size not in", values, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeBetween(Integer value1, Integer value2) {
            addCriterion("dev_size between", value1, value2, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_size not between", value1, value2, "devSize");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
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

        public Criteria andBackupsOccurIsNull() {
            addCriterion("backups_occur is null");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurIsNotNull() {
            addCriterion("backups_occur is not null");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurEqualTo(Integer value) {
            addCriterion("backups_occur =", value, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurNotEqualTo(Integer value) {
            addCriterion("backups_occur <>", value, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurGreaterThan(Integer value) {
            addCriterion("backups_occur >", value, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurGreaterThanOrEqualTo(Integer value) {
            addCriterion("backups_occur >=", value, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurLessThan(Integer value) {
            addCriterion("backups_occur <", value, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurLessThanOrEqualTo(Integer value) {
            addCriterion("backups_occur <=", value, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurIn(List<Integer> values) {
            addCriterion("backups_occur in", values, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurNotIn(List<Integer> values) {
            addCriterion("backups_occur not in", values, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurBetween(Integer value1, Integer value2) {
            addCriterion("backups_occur between", value1, value2, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andBackupsOccurNotBetween(Integer value1, Integer value2) {
            addCriterion("backups_occur not between", value1, value2, "backupsOccur");
            return (Criteria) this;
        }

        public Criteria andUploadsIsNull() {
            addCriterion("uploads is null");
            return (Criteria) this;
        }

        public Criteria andUploadsIsNotNull() {
            addCriterion("uploads is not null");
            return (Criteria) this;
        }

        public Criteria andUploadsEqualTo(Integer value) {
            addCriterion("uploads =", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsNotEqualTo(Integer value) {
            addCriterion("uploads <>", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsGreaterThan(Integer value) {
            addCriterion("uploads >", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploads >=", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsLessThan(Integer value) {
            addCriterion("uploads <", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsLessThanOrEqualTo(Integer value) {
            addCriterion("uploads <=", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsIn(List<Integer> values) {
            addCriterion("uploads in", values, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsNotIn(List<Integer> values) {
            addCriterion("uploads not in", values, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsBetween(Integer value1, Integer value2) {
            addCriterion("uploads between", value1, value2, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsNotBetween(Integer value1, Integer value2) {
            addCriterion("uploads not between", value1, value2, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadValidIsNull() {
            addCriterion("upload_valid is null");
            return (Criteria) this;
        }

        public Criteria andUploadValidIsNotNull() {
            addCriterion("upload_valid is not null");
            return (Criteria) this;
        }

        public Criteria andUploadValidEqualTo(Integer value) {
            addCriterion("upload_valid =", value, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidNotEqualTo(Integer value) {
            addCriterion("upload_valid <>", value, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidGreaterThan(Integer value) {
            addCriterion("upload_valid >", value, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_valid >=", value, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidLessThan(Integer value) {
            addCriterion("upload_valid <", value, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidLessThanOrEqualTo(Integer value) {
            addCriterion("upload_valid <=", value, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidIn(List<Integer> values) {
            addCriterion("upload_valid in", values, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidNotIn(List<Integer> values) {
            addCriterion("upload_valid not in", values, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidBetween(Integer value1, Integer value2) {
            addCriterion("upload_valid between", value1, value2, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadValidNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_valid not between", value1, value2, "uploadValid");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadtime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(String value) {
            addCriterion("uploadtime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(String value) {
            addCriterion("uploadtime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(String value) {
            addCriterion("uploadtime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("uploadtime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(String value) {
            addCriterion("uploadtime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("uploadtime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLike(String value) {
            addCriterion("uploadtime like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotLike(String value) {
            addCriterion("uploadtime not like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<String> values) {
            addCriterion("uploadtime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<String> values) {
            addCriterion("uploadtime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(String value1, String value2) {
            addCriterion("uploadtime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(String value1, String value2) {
            addCriterion("uploadtime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadFlowIsNull() {
            addCriterion("upload_flow is null");
            return (Criteria) this;
        }

        public Criteria andUploadFlowIsNotNull() {
            addCriterion("upload_flow is not null");
            return (Criteria) this;
        }

        public Criteria andUploadFlowEqualTo(Integer value) {
            addCriterion("upload_flow =", value, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowNotEqualTo(Integer value) {
            addCriterion("upload_flow <>", value, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowGreaterThan(Integer value) {
            addCriterion("upload_flow >", value, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_flow >=", value, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowLessThan(Integer value) {
            addCriterion("upload_flow <", value, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowLessThanOrEqualTo(Integer value) {
            addCriterion("upload_flow <=", value, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowIn(List<Integer> values) {
            addCriterion("upload_flow in", values, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowNotIn(List<Integer> values) {
            addCriterion("upload_flow not in", values, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowBetween(Integer value1, Integer value2) {
            addCriterion("upload_flow between", value1, value2, "uploadFlow");
            return (Criteria) this;
        }

        public Criteria andUploadFlowNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_flow not between", value1, value2, "uploadFlow");
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

        public Criteria andUploadSpeedIsNull() {
            addCriterion("upload_speed is null");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedIsNotNull() {
            addCriterion("upload_speed is not null");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedEqualTo(Integer value) {
            addCriterion("upload_speed =", value, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedNotEqualTo(Integer value) {
            addCriterion("upload_speed <>", value, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedGreaterThan(Integer value) {
            addCriterion("upload_speed >", value, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_speed >=", value, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedLessThan(Integer value) {
            addCriterion("upload_speed <", value, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("upload_speed <=", value, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedIn(List<Integer> values) {
            addCriterion("upload_speed in", values, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedNotIn(List<Integer> values) {
            addCriterion("upload_speed not in", values, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedBetween(Integer value1, Integer value2) {
            addCriterion("upload_speed between", value1, value2, "uploadSpeed");
            return (Criteria) this;
        }

        public Criteria andUploadSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_speed not between", value1, value2, "uploadSpeed");
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