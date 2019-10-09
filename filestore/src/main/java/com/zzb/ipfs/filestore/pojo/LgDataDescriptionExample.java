package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LgDataDescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgDataDescriptionExample() {
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

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andTimebeginIsNull() {
            addCriterion("timebegin is null");
            return (Criteria) this;
        }

        public Criteria andTimebeginIsNotNull() {
            addCriterion("timebegin is not null");
            return (Criteria) this;
        }

        public Criteria andTimebeginEqualTo(Date value) {
            addCriterion("timebegin =", value, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginNotEqualTo(Date value) {
            addCriterion("timebegin <>", value, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginGreaterThan(Date value) {
            addCriterion("timebegin >", value, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginGreaterThanOrEqualTo(Date value) {
            addCriterion("timebegin >=", value, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginLessThan(Date value) {
            addCriterion("timebegin <", value, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginLessThanOrEqualTo(Date value) {
            addCriterion("timebegin <=", value, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginIn(List<Date> values) {
            addCriterion("timebegin in", values, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginNotIn(List<Date> values) {
            addCriterion("timebegin not in", values, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginBetween(Date value1, Date value2) {
            addCriterion("timebegin between", value1, value2, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimebeginNotBetween(Date value1, Date value2) {
            addCriterion("timebegin not between", value1, value2, "timebegin");
            return (Criteria) this;
        }

        public Criteria andTimeupdataIsNull() {
            addCriterion("timeupdata is null");
            return (Criteria) this;
        }

        public Criteria andTimeupdataIsNotNull() {
            addCriterion("timeupdata is not null");
            return (Criteria) this;
        }

        public Criteria andTimeupdataEqualTo(Date value) {
            addCriterion("timeupdata =", value, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataNotEqualTo(Date value) {
            addCriterion("timeupdata <>", value, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataGreaterThan(Date value) {
            addCriterion("timeupdata >", value, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataGreaterThanOrEqualTo(Date value) {
            addCriterion("timeupdata >=", value, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataLessThan(Date value) {
            addCriterion("timeupdata <", value, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataLessThanOrEqualTo(Date value) {
            addCriterion("timeupdata <=", value, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataIn(List<Date> values) {
            addCriterion("timeupdata in", values, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataNotIn(List<Date> values) {
            addCriterion("timeupdata not in", values, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataBetween(Date value1, Date value2) {
            addCriterion("timeupdata between", value1, value2, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andTimeupdataNotBetween(Date value1, Date value2) {
            addCriterion("timeupdata not between", value1, value2, "timeupdata");
            return (Criteria) this;
        }

        public Criteria andStorageclassIsNull() {
            addCriterion("storageclass is null");
            return (Criteria) this;
        }

        public Criteria andStorageclassIsNotNull() {
            addCriterion("storageclass is not null");
            return (Criteria) this;
        }

        public Criteria andStorageclassEqualTo(String value) {
            addCriterion("storageclass =", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassNotEqualTo(String value) {
            addCriterion("storageclass <>", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassGreaterThan(String value) {
            addCriterion("storageclass >", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassGreaterThanOrEqualTo(String value) {
            addCriterion("storageclass >=", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassLessThan(String value) {
            addCriterion("storageclass <", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassLessThanOrEqualTo(String value) {
            addCriterion("storageclass <=", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassLike(String value) {
            addCriterion("storageclass like", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassNotLike(String value) {
            addCriterion("storageclass not like", value, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassIn(List<String> values) {
            addCriterion("storageclass in", values, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassNotIn(List<String> values) {
            addCriterion("storageclass not in", values, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassBetween(String value1, String value2) {
            addCriterion("storageclass between", value1, value2, "storageclass");
            return (Criteria) this;
        }

        public Criteria andStorageclassNotBetween(String value1, String value2) {
            addCriterion("storageclass not between", value1, value2, "storageclass");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("Filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("Filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Integer value) {
            addCriterion("Filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Integer value) {
            addCriterion("Filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Integer value) {
            addCriterion("Filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Integer value) {
            addCriterion("Filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Integer value) {
            addCriterion("Filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Integer> values) {
            addCriterion("Filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Integer> values) {
            addCriterion("Filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Integer value1, Integer value2) {
            addCriterion("Filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Integer value1, Integer value2) {
            addCriterion("Filesize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Integer value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Integer value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Integer value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Integer value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Integer> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Integer> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Integer value1, Integer value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(Integer value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(Integer value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(Integer value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(Integer value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<Integer> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<Integer> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(Integer value1, Integer value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andDevsnIsNull() {
            addCriterion("devsn is null");
            return (Criteria) this;
        }

        public Criteria andDevsnIsNotNull() {
            addCriterion("devsn is not null");
            return (Criteria) this;
        }

        public Criteria andDevsnEqualTo(String value) {
            addCriterion("devsn =", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnNotEqualTo(String value) {
            addCriterion("devsn <>", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnGreaterThan(String value) {
            addCriterion("devsn >", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnGreaterThanOrEqualTo(String value) {
            addCriterion("devsn >=", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnLessThan(String value) {
            addCriterion("devsn <", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnLessThanOrEqualTo(String value) {
            addCriterion("devsn <=", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnLike(String value) {
            addCriterion("devsn like", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnNotLike(String value) {
            addCriterion("devsn not like", value, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnIn(List<String> values) {
            addCriterion("devsn in", values, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnNotIn(List<String> values) {
            addCriterion("devsn not in", values, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnBetween(String value1, String value2) {
            addCriterion("devsn between", value1, value2, "devsn");
            return (Criteria) this;
        }

        public Criteria andDevsnNotBetween(String value1, String value2) {
            addCriterion("devsn not between", value1, value2, "devsn");
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