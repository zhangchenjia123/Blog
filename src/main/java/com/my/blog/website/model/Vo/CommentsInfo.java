package com.my.blog.website.model.Vo;

import com.my.blog.website.Enum.CommentsTypeEnum;
import com.my.blog.website.Enum.IsDeleteEnum;
import java.util.Date;

public class CommentsInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.tittle
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private String tittle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.user_id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.pic_url
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private String picUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.approve_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Integer approveNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.not_approve_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Integer notApproveNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.comments_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Integer commentsNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.redirect_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Integer redirectNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.type
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private CommentsTypeEnum type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.father_id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Long fatherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.status
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private IsDeleteEnum status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.create_time
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.update_time
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments_info.desc
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.id
     *
     * @return the value of comments_info.id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.id
     *
     * @param id the value for comments_info.id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.tittle
     *
     * @return the value of comments_info.tittle
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.tittle
     *
     * @param tittle the value for comments_info.tittle
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.user_id
     *
     * @return the value of comments_info.user_id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.user_id
     *
     * @param userId the value for comments_info.user_id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.pic_url
     *
     * @return the value of comments_info.pic_url
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.pic_url
     *
     * @param picUrl the value for comments_info.pic_url
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.approve_number
     *
     * @return the value of comments_info.approve_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Integer getApproveNumber() {
        return approveNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.approve_number
     *
     * @param approveNumber the value for comments_info.approve_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setApproveNumber(Integer approveNumber) {
        this.approveNumber = approveNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.not_approve_number
     *
     * @return the value of comments_info.not_approve_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Integer getNotApproveNumber() {
        return notApproveNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.not_approve_number
     *
     * @param notApproveNumber the value for comments_info.not_approve_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setNotApproveNumber(Integer notApproveNumber) {
        this.notApproveNumber = notApproveNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.comments_number
     *
     * @return the value of comments_info.comments_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Integer getCommentsNumber() {
        return commentsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.comments_number
     *
     * @param commentsNumber the value for comments_info.comments_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setCommentsNumber(Integer commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.redirect_number
     *
     * @return the value of comments_info.redirect_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Integer getRedirectNumber() {
        return redirectNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.redirect_number
     *
     * @param redirectNumber the value for comments_info.redirect_number
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setRedirectNumber(Integer redirectNumber) {
        this.redirectNumber = redirectNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.type
     *
     * @return the value of comments_info.type
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public CommentsTypeEnum getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.type
     *
     * @param type the value for comments_info.type
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setType(CommentsTypeEnum type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.father_id
     *
     * @return the value of comments_info.father_id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Long getFatherId() {
        return fatherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.father_id
     *
     * @param fatherId the value for comments_info.father_id
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.status
     *
     * @return the value of comments_info.status
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public IsDeleteEnum getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.status
     *
     * @param status the value for comments_info.status
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setStatus(IsDeleteEnum status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.create_time
     *
     * @return the value of comments_info.create_time
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.create_time
     *
     * @param createTime the value for comments_info.create_time
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.update_time
     *
     * @return the value of comments_info.update_time
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.update_time
     *
     * @param updateTime the value for comments_info.update_time
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments_info.desc
     *
     * @return the value of comments_info.desc
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments_info.desc
     *
     * @param desc the value for comments_info.desc
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommentsInfo other = (CommentsInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTittle() == null ? other.getTittle() == null : this.getTittle().equals(other.getTittle()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getApproveNumber() == null ? other.getApproveNumber() == null : this.getApproveNumber().equals(other.getApproveNumber()))
            && (this.getNotApproveNumber() == null ? other.getNotApproveNumber() == null : this.getNotApproveNumber().equals(other.getNotApproveNumber()))
            && (this.getCommentsNumber() == null ? other.getCommentsNumber() == null : this.getCommentsNumber().equals(other.getCommentsNumber()))
            && (this.getRedirectNumber() == null ? other.getRedirectNumber() == null : this.getRedirectNumber().equals(other.getRedirectNumber()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFatherId() == null ? other.getFatherId() == null : this.getFatherId().equals(other.getFatherId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments_info
     *
     * @mbggenerated Fri Dec 22 22:25:31 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTittle() == null) ? 0 : getTittle().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getApproveNumber() == null) ? 0 : getApproveNumber().hashCode());
        result = prime * result + ((getNotApproveNumber() == null) ? 0 : getNotApproveNumber().hashCode());
        result = prime * result + ((getCommentsNumber() == null) ? 0 : getCommentsNumber().hashCode());
        result = prime * result + ((getRedirectNumber() == null) ? 0 : getRedirectNumber().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFatherId() == null) ? 0 : getFatherId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        return result;
    }
}