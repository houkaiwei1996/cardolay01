package com.zzb.ipfs.filestore.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LgFileUploadDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgFileUploadDetailsExample() {
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

        public Criteria andFilesizeIsNull() {
            addCriterion("filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Integer value) {
            addCriterion("filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Integer value) {
            addCriterion("filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Integer value) {
            addCriterion("filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Integer value) {
            addCriterion("filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Integer value) {
            addCriterion("filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Integer> values) {
            addCriterion("filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Integer> values) {
            addCriterion("filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Integer value1, Integer value2) {
            addCriterion("filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Integer value1, Integer value2) {
            addCriterion("filesize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficIsNull() {
            addCriterion("uploadtraffic is null");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficIsNotNull() {
            addCriterion("uploadtraffic is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficEqualTo(Integer value) {
            addCriterion("uploadtraffic =", value, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficNotEqualTo(Integer value) {
            addCriterion("uploadtraffic <>", value, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficGreaterThan(Integer value) {
            addCriterion("uploadtraffic >", value, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadtraffic >=", value, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficLessThan(Integer value) {
            addCriterion("uploadtraffic <", value, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficLessThanOrEqualTo(Integer value) {
            addCriterion("uploadtraffic <=", value, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficIn(List<Integer> values) {
            addCriterion("uploadtraffic in", values, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficNotIn(List<Integer> values) {
            addCriterion("uploadtraffic not in", values, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficBetween(Integer value1, Integer value2) {
            addCriterion("uploadtraffic between", value1, value2, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andUploadtrafficNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadtraffic not between", value1, value2, "uploadtraffic");
            return (Criteria) this;
        }

        public Criteria andTimebigenIsNull() {
            addCriterion("timebigen is null");
            return (Criteria) this;
        }

        public Criteria andTimebigenIsNotNull() {
            addCriterion("timebigen is not null");
            return (Criteria) this;
        }

        public Criteria andTimebigenEqualTo(Date value) {
            addCriterion("timebigen =", value, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenNotEqualTo(Date value) {
            addCriterion("timebigen <>", value, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenGreaterThan(Date value) {
            addCriterion("timebigen >", value, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenGreaterThanOrEqualTo(Date value) {
            addCriterion("timebigen >=", value, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenLessThan(Date value) {
            addCriterion("timebigen <", value, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenLessThanOrEqualTo(Date value) {
            addCriterion("timebigen <=", value, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenIn(List<Date> values) {
            addCriterion("timebigen in", values, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenNotIn(List<Date> values) {
            addCriterion("timebigen not in", values, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenBetween(Date value1, Date value2) {
            addCriterion("timebigen between", value1, value2, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimebigenNotBetween(Date value1, Date value2) {
            addCriterion("timebigen not between", value1, value2, "timebigen");
            return (Criteria) this;
        }

        public Criteria andTimaupdateIsNull() {
            addCriterion("timaupdate is null");
            return (Criteria) this;
        }

        public Criteria andTimaupdateIsNotNull() {
            addCriterion("timaupdate is not null");
            return (Criteria) this;
        }

        public Criteria andTimaupdateEqualTo(Date value) {
            addCriterion("timaupdate =", value, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateNotEqualTo(Date value) {
            addCriterion("timaupdate <>", value, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateGreaterThan(Date value) {
            addCriterion("timaupdate >", value, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("timaupdate >=", value, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateLessThan(Date value) {
            addCriterion("timaupdate <", value, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateLessThanOrEqualTo(Date value) {
            addCriterion("timaupdate <=", value, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateIn(List<Date> values) {
            addCriterion("timaupdate in", values, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateNotIn(List<Date> values) {
            addCriterion("timaupdate not in", values, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateBetween(Date value1, Date value2) {
            addCriterion("timaupdate between", value1, value2, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andTimaupdateNotBetween(Date value1, Date value2) {
            addCriterion("timaupdate not between", value1, value2, "timaupdate");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("download is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("download is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(String value) {
            addCriterion("download =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(String value) {
            addCriterion("download <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(String value) {
            addCriterion("download >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("download >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(String value) {
            addCriterion("download <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(String value) {
            addCriterion("download <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLike(String value) {
            addCriterion("download like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotLike(String value) {
            addCriterion("download not like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<String> values) {
            addCriterion("download in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<String> values) {
            addCriterion("download not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(String value1, String value2) {
            addCriterion("download between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(String value1, String value2) {
            addCriterion("download not between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloaduserIsNull() {
            addCriterion("downloaduser is null");
            return (Criteria) this;
        }

        public Criteria andDownloaduserIsNotNull() {
            addCriterion("downloaduser is not null");
            return (Criteria) this;
        }

        public Criteria andDownloaduserEqualTo(String value) {
            addCriterion("downloaduser =", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserNotEqualTo(String value) {
            addCriterion("downloaduser <>", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserGreaterThan(String value) {
            addCriterion("downloaduser >", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserGreaterThanOrEqualTo(String value) {
            addCriterion("downloaduser >=", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserLessThan(String value) {
            addCriterion("downloaduser <", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserLessThanOrEqualTo(String value) {
            addCriterion("downloaduser <=", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserLike(String value) {
            addCriterion("downloaduser like", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserNotLike(String value) {
            addCriterion("downloaduser not like", value, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserIn(List<String> values) {
            addCriterion("downloaduser in", values, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserNotIn(List<String> values) {
            addCriterion("downloaduser not in", values, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserBetween(String value1, String value2) {
            addCriterion("downloaduser between", value1, value2, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloaduserNotBetween(String value1, String value2) {
            addCriterion("downloaduser not between", value1, value2, "downloaduser");
            return (Criteria) this;
        }

        public Criteria andDownloadregionIsNull() {
            addCriterion("downloadregion is null");
            return (Criteria) this;
        }

        public Criteria andDownloadregionIsNotNull() {
            addCriterion("downloadregion is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadregionEqualTo(String value) {
            addCriterion("downloadregion =", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionNotEqualTo(String value) {
            addCriterion("downloadregion <>", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionGreaterThan(String value) {
            addCriterion("downloadregion >", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionGreaterThanOrEqualTo(String value) {
            addCriterion("downloadregion >=", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionLessThan(String value) {
            addCriterion("downloadregion <", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionLessThanOrEqualTo(String value) {
            addCriterion("downloadregion <=", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionLike(String value) {
            addCriterion("downloadregion like", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionNotLike(String value) {
            addCriterion("downloadregion not like", value, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionIn(List<String> values) {
            addCriterion("downloadregion in", values, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionNotIn(List<String> values) {
            addCriterion("downloadregion not in", values, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionBetween(String value1, String value2) {
            addCriterion("downloadregion between", value1, value2, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andDownloadregionNotBetween(String value1, String value2) {
            addCriterion("downloadregion not between", value1, value2, "downloadregion");
            return (Criteria) this;
        }

        public Criteria andUploadspeedIsNull() {
            addCriterion("uploadspeed is null");
            return (Criteria) this;
        }

        public Criteria andUploadspeedIsNotNull() {
            addCriterion("uploadspeed is not null");
            return (Criteria) this;
        }

        public Criteria andUploadspeedEqualTo(Integer value) {
            addCriterion("uploadspeed =", value, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedNotEqualTo(Integer value) {
            addCriterion("uploadspeed <>", value, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedGreaterThan(Integer value) {
            addCriterion("uploadspeed >", value, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadspeed >=", value, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedLessThan(Integer value) {
            addCriterion("uploadspeed <", value, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedLessThanOrEqualTo(Integer value) {
            addCriterion("uploadspeed <=", value, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedIn(List<Integer> values) {
            addCriterion("uploadspeed in", values, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedNotIn(List<Integer> values) {
            addCriterion("uploadspeed not in", values, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedBetween(Integer value1, Integer value2) {
            addCriterion("uploadspeed between", value1, value2, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andUploadspeedNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadspeed not between", value1, value2, "uploadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedIsNull() {
            addCriterion("downloadspeed is null");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedIsNotNull() {
            addCriterion("downloadspeed is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedEqualTo(Integer value) {
            addCriterion("downloadspeed =", value, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedNotEqualTo(Integer value) {
            addCriterion("downloadspeed <>", value, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedGreaterThan(Integer value) {
            addCriterion("downloadspeed >", value, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloadspeed >=", value, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedLessThan(Integer value) {
            addCriterion("downloadspeed <", value, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedLessThanOrEqualTo(Integer value) {
            addCriterion("downloadspeed <=", value, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedIn(List<Integer> values) {
            addCriterion("downloadspeed in", values, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedNotIn(List<Integer> values) {
            addCriterion("downloadspeed not in", values, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedBetween(Integer value1, Integer value2) {
            addCriterion("downloadspeed between", value1, value2, "downloadspeed");
            return (Criteria) this;
        }

        public Criteria andDownloadspeedNotBetween(Integer value1, Integer value2) {
            addCriterion("downloadspeed not between", value1, value2, "downloadspeed");
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