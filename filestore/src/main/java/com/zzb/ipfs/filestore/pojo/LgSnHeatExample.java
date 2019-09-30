package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.List;

public class LgSnHeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgSnHeatExample() {
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

        public Criteria andEquipmentSetsIsNull() {
            addCriterion("equipment_sets is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsIsNotNull() {
            addCriterion("equipment_sets is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsEqualTo(Integer value) {
            addCriterion("equipment_sets =", value, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsNotEqualTo(Integer value) {
            addCriterion("equipment_sets <>", value, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsGreaterThan(Integer value) {
            addCriterion("equipment_sets >", value, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_sets >=", value, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsLessThan(Integer value) {
            addCriterion("equipment_sets <", value, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_sets <=", value, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsIn(List<Integer> values) {
            addCriterion("equipment_sets in", values, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsNotIn(List<Integer> values) {
            addCriterion("equipment_sets not in", values, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsBetween(Integer value1, Integer value2) {
            addCriterion("equipment_sets between", value1, value2, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSetsNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_sets not between", value1, value2, "equipmentSets");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnIsNull() {
            addCriterion("equipment_sn is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnIsNotNull() {
            addCriterion("equipment_sn is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnEqualTo(String value) {
            addCriterion("equipment_sn =", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnNotEqualTo(String value) {
            addCriterion("equipment_sn <>", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnGreaterThan(String value) {
            addCriterion("equipment_sn >", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_sn >=", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnLessThan(String value) {
            addCriterion("equipment_sn <", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnLessThanOrEqualTo(String value) {
            addCriterion("equipment_sn <=", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnLike(String value) {
            addCriterion("equipment_sn like", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnNotLike(String value) {
            addCriterion("equipment_sn not like", value, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnIn(List<String> values) {
            addCriterion("equipment_sn in", values, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnNotIn(List<String> values) {
            addCriterion("equipment_sn not in", values, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnBetween(String value1, String value2) {
            addCriterion("equipment_sn between", value1, value2, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andEquipmentSnNotBetween(String value1, String value2) {
            addCriterion("equipment_sn not between", value1, value2, "equipmentSn");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeIsNull() {
            addCriterion("uploadingtime is null");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeIsNotNull() {
            addCriterion("uploadingtime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeEqualTo(Integer value) {
            addCriterion("uploadingtime =", value, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeNotEqualTo(Integer value) {
            addCriterion("uploadingtime <>", value, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeGreaterThan(Integer value) {
            addCriterion("uploadingtime >", value, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadingtime >=", value, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeLessThan(Integer value) {
            addCriterion("uploadingtime <", value, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeLessThanOrEqualTo(Integer value) {
            addCriterion("uploadingtime <=", value, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeIn(List<Integer> values) {
            addCriterion("uploadingtime in", values, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeNotIn(List<Integer> values) {
            addCriterion("uploadingtime not in", values, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeBetween(Integer value1, Integer value2) {
            addCriterion("uploadingtime between", value1, value2, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadingtime not between", value1, value2, "uploadingtime");
            return (Criteria) this;
        }

        public Criteria andUploadingIsNull() {
            addCriterion("uploading is null");
            return (Criteria) this;
        }

        public Criteria andUploadingIsNotNull() {
            addCriterion("uploading is not null");
            return (Criteria) this;
        }

        public Criteria andUploadingEqualTo(Integer value) {
            addCriterion("uploading =", value, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingNotEqualTo(Integer value) {
            addCriterion("uploading <>", value, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingGreaterThan(Integer value) {
            addCriterion("uploading >", value, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploading >=", value, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingLessThan(Integer value) {
            addCriterion("uploading <", value, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingLessThanOrEqualTo(Integer value) {
            addCriterion("uploading <=", value, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingIn(List<Integer> values) {
            addCriterion("uploading in", values, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingNotIn(List<Integer> values) {
            addCriterion("uploading not in", values, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingBetween(Integer value1, Integer value2) {
            addCriterion("uploading between", value1, value2, "uploading");
            return (Criteria) this;
        }

        public Criteria andUploadingNotBetween(Integer value1, Integer value2) {
            addCriterion("uploading not between", value1, value2, "uploading");
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