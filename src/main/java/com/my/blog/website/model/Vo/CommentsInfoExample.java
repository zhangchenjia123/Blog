package com.my.blog.website.model.Vo;

import com.my.blog.website.Enum.CommentsTypeEnum;
import com.my.blog.website.Enum.IsDeleteEnum;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsInfoExample() {
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

        public Criteria andTittleIsNull() {
            addCriterion("tittle is null");
            return (Criteria) this;
        }

        public Criteria andTittleIsNotNull() {
            addCriterion("tittle is not null");
            return (Criteria) this;
        }

        public Criteria andTittleEqualTo(String value) {
            addCriterion("tittle =", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotEqualTo(String value) {
            addCriterion("tittle <>", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleGreaterThan(String value) {
            addCriterion("tittle >", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleGreaterThanOrEqualTo(String value) {
            addCriterion("tittle >=", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLessThan(String value) {
            addCriterion("tittle <", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLessThanOrEqualTo(String value) {
            addCriterion("tittle <=", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLike(String value) {
            addCriterion("tittle like", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotLike(String value) {
            addCriterion("tittle not like", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleIn(List<String> values) {
            addCriterion("tittle in", values, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotIn(List<String> values) {
            addCriterion("tittle not in", values, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleBetween(String value1, String value2) {
            addCriterion("tittle between", value1, value2, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotBetween(String value1, String value2) {
            addCriterion("tittle not between", value1, value2, "tittle");
            return (Criteria) this;
        }

        public Criteria andDescInfoIsNull() {
            addCriterion("desc_info is null");
            return (Criteria) this;
        }

        public Criteria andDescInfoIsNotNull() {
            addCriterion("desc_info is not null");
            return (Criteria) this;
        }

        public Criteria andDescInfoEqualTo(String value) {
            addCriterion("desc_info =", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoNotEqualTo(String value) {
            addCriterion("desc_info <>", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoGreaterThan(String value) {
            addCriterion("desc_info >", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoGreaterThanOrEqualTo(String value) {
            addCriterion("desc_info >=", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoLessThan(String value) {
            addCriterion("desc_info <", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoLessThanOrEqualTo(String value) {
            addCriterion("desc_info <=", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoLike(String value) {
            addCriterion("desc_info like", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoNotLike(String value) {
            addCriterion("desc_info not like", value, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoIn(List<String> values) {
            addCriterion("desc_info in", values, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoNotIn(List<String> values) {
            addCriterion("desc_info not in", values, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoBetween(String value1, String value2) {
            addCriterion("desc_info between", value1, value2, "descInfo");
            return (Criteria) this;
        }

        public Criteria andDescInfoNotBetween(String value1, String value2) {
            addCriterion("desc_info not between", value1, value2, "descInfo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andApproveNumberIsNull() {
            addCriterion("approve_number is null");
            return (Criteria) this;
        }

        public Criteria andApproveNumberIsNotNull() {
            addCriterion("approve_number is not null");
            return (Criteria) this;
        }

        public Criteria andApproveNumberEqualTo(Integer value) {
            addCriterion("approve_number =", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberNotEqualTo(Integer value) {
            addCriterion("approve_number <>", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberGreaterThan(Integer value) {
            addCriterion("approve_number >", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("approve_number >=", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberLessThan(Integer value) {
            addCriterion("approve_number <", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberLessThanOrEqualTo(Integer value) {
            addCriterion("approve_number <=", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberIn(List<Integer> values) {
            addCriterion("approve_number in", values, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberNotIn(List<Integer> values) {
            addCriterion("approve_number not in", values, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberBetween(Integer value1, Integer value2) {
            addCriterion("approve_number between", value1, value2, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("approve_number not between", value1, value2, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberIsNull() {
            addCriterion("not_approve_number is null");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberIsNotNull() {
            addCriterion("not_approve_number is not null");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberEqualTo(Integer value) {
            addCriterion("not_approve_number =", value, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberNotEqualTo(Integer value) {
            addCriterion("not_approve_number <>", value, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberGreaterThan(Integer value) {
            addCriterion("not_approve_number >", value, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_approve_number >=", value, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberLessThan(Integer value) {
            addCriterion("not_approve_number <", value, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberLessThanOrEqualTo(Integer value) {
            addCriterion("not_approve_number <=", value, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberIn(List<Integer> values) {
            addCriterion("not_approve_number in", values, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberNotIn(List<Integer> values) {
            addCriterion("not_approve_number not in", values, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberBetween(Integer value1, Integer value2) {
            addCriterion("not_approve_number between", value1, value2, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andNotApproveNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("not_approve_number not between", value1, value2, "notApproveNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberIsNull() {
            addCriterion("comments_number is null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberIsNotNull() {
            addCriterion("comments_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberEqualTo(Integer value) {
            addCriterion("comments_number =", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberNotEqualTo(Integer value) {
            addCriterion("comments_number <>", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberGreaterThan(Integer value) {
            addCriterion("comments_number >", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_number >=", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberLessThan(Integer value) {
            addCriterion("comments_number <", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("comments_number <=", value, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberIn(List<Integer> values) {
            addCriterion("comments_number in", values, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberNotIn(List<Integer> values) {
            addCriterion("comments_number not in", values, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberBetween(Integer value1, Integer value2) {
            addCriterion("comments_number between", value1, value2, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andCommentsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_number not between", value1, value2, "commentsNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberIsNull() {
            addCriterion("redirect_number is null");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberIsNotNull() {
            addCriterion("redirect_number is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberEqualTo(Integer value) {
            addCriterion("redirect_number =", value, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberNotEqualTo(Integer value) {
            addCriterion("redirect_number <>", value, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberGreaterThan(Integer value) {
            addCriterion("redirect_number >", value, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("redirect_number >=", value, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberLessThan(Integer value) {
            addCriterion("redirect_number <", value, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberLessThanOrEqualTo(Integer value) {
            addCriterion("redirect_number <=", value, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberIn(List<Integer> values) {
            addCriterion("redirect_number in", values, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberNotIn(List<Integer> values) {
            addCriterion("redirect_number not in", values, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberBetween(Integer value1, Integer value2) {
            addCriterion("redirect_number between", value1, value2, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andRedirectNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("redirect_number not between", value1, value2, "redirectNumber");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(CommentsTypeEnum value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(CommentsTypeEnum value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(CommentsTypeEnum value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(CommentsTypeEnum value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(CommentsTypeEnum value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(CommentsTypeEnum value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<CommentsTypeEnum> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<CommentsTypeEnum> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(CommentsTypeEnum value1, CommentsTypeEnum value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(CommentsTypeEnum value1, CommentsTypeEnum value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNull() {
            addCriterion("father_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNotNull() {
            addCriterion("father_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherIdEqualTo(Long value) {
            addCriterion("father_id =", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotEqualTo(Long value) {
            addCriterion("father_id <>", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThan(Long value) {
            addCriterion("father_id >", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("father_id >=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThan(Long value) {
            addCriterion("father_id <", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThanOrEqualTo(Long value) {
            addCriterion("father_id <=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdIn(List<Long> values) {
            addCriterion("father_id in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotIn(List<Long> values) {
            addCriterion("father_id not in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdBetween(Long value1, Long value2) {
            addCriterion("father_id between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotBetween(Long value1, Long value2) {
            addCriterion("father_id not between", value1, value2, "fatherId");
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

        public Criteria andStatusEqualTo(IsDeleteEnum value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(IsDeleteEnum value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(IsDeleteEnum value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(IsDeleteEnum value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(IsDeleteEnum value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(IsDeleteEnum value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<IsDeleteEnum> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<IsDeleteEnum> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(IsDeleteEnum value1, IsDeleteEnum value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(IsDeleteEnum value1, IsDeleteEnum value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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