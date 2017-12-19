package com.my.blog.website.model.Vo;

import com.my.blog.website.Enum.IsUseEnum;
import com.my.blog.website.Enum.RecommendStatusEnum;
import java.util.Date;

public class SecondHandInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.id
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.tittle
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private String tittle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.pic_url
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private String picUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.logoPicUrl
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private String logopicurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.user_id
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.desc
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.read_number
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private Integer readNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.status
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private IsUseEnum status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.recommend_status
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private RecommendStatusEnum recommendStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.type
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private Long type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.create_time
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column second_hand_info.update_time
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.id
     *
     * @return the value of second_hand_info.id
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.id
     *
     * @param id the value for second_hand_info.id
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.tittle
     *
     * @return the value of second_hand_info.tittle
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.tittle
     *
     * @param tittle the value for second_hand_info.tittle
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.pic_url
     *
     * @return the value of second_hand_info.pic_url
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.pic_url
     *
     * @param picUrl the value for second_hand_info.pic_url
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.logoPicUrl
     *
     * @return the value of second_hand_info.logoPicUrl
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public String getLogopicurl() {
        return logopicurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.logoPicUrl
     *
     * @param logopicurl the value for second_hand_info.logoPicUrl
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setLogopicurl(String logopicurl) {
        this.logopicurl = logopicurl == null ? null : logopicurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.user_id
     *
     * @return the value of second_hand_info.user_id
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.user_id
     *
     * @param userId the value for second_hand_info.user_id
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.desc
     *
     * @return the value of second_hand_info.desc
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.desc
     *
     * @param desc the value for second_hand_info.desc
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.read_number
     *
     * @return the value of second_hand_info.read_number
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public Integer getReadNumber() {
        return readNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.read_number
     *
     * @param readNumber the value for second_hand_info.read_number
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setReadNumber(Integer readNumber) {
        this.readNumber = readNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.status
     *
     * @return the value of second_hand_info.status
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public IsUseEnum getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.status
     *
     * @param status the value for second_hand_info.status
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setStatus(IsUseEnum status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.recommend_status
     *
     * @return the value of second_hand_info.recommend_status
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public RecommendStatusEnum getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.recommend_status
     *
     * @param recommendStatus the value for second_hand_info.recommend_status
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setRecommendStatus(RecommendStatusEnum recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.type
     *
     * @return the value of second_hand_info.type
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public Long getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.type
     *
     * @param type the value for second_hand_info.type
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.create_time
     *
     * @return the value of second_hand_info.create_time
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.create_time
     *
     * @param createTime the value for second_hand_info.create_time
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column second_hand_info.update_time
     *
     * @return the value of second_hand_info.update_time
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column second_hand_info.update_time
     *
     * @param updateTime the value for second_hand_info.update_time
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table second_hand_info
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
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
        SecondHandInfo other = (SecondHandInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTittle() == null ? other.getTittle() == null : this.getTittle().equals(other.getTittle()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getLogopicurl() == null ? other.getLogopicurl() == null : this.getLogopicurl().equals(other.getLogopicurl()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getReadNumber() == null ? other.getReadNumber() == null : this.getReadNumber().equals(other.getReadNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRecommendStatus() == null ? other.getRecommendStatus() == null : this.getRecommendStatus().equals(other.getRecommendStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table second_hand_info
     *
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTittle() == null) ? 0 : getTittle().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getLogopicurl() == null) ? 0 : getLogopicurl().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getReadNumber() == null) ? 0 : getReadNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRecommendStatus() == null) ? 0 : getRecommendStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}