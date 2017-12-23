package com.my.blog.website.model.Vo;

import com.my.blog.website.Enum.IsUseEnum;
import com.my.blog.website.Enum.RecommendStatusEnum;
import com.my.blog.website.Enum.SourceEnum;
import java.util.Date;

public class RideSharingInfo {
    private Long id;

    private String tittle;

    private String phoneNumber;

    private String picUrl;

    private String logopicurl;

    private String descInfo;

    private Integer readNumber;

    private SourceEnum source;

    private IsUseEnum status;

    private RecommendStatusEnum recommendStatus;

    private IsUseEnum type;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getLogopicurl() {
        return logopicurl;
    }

    public void setLogopicurl(String logopicurl) {
        this.logopicurl = logopicurl == null ? null : logopicurl.trim();
    }

    public String getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo == null ? null : descInfo.trim();
    }

    public Integer getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(Integer readNumber) {
        this.readNumber = readNumber;
    }

    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public IsUseEnum getStatus() {
        return status;
    }

    public void setStatus(IsUseEnum status) {
        this.status = status;
    }

    public RecommendStatusEnum getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(RecommendStatusEnum recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public IsUseEnum getType() {
        return type;
    }

    public void setType(IsUseEnum type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

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
        RideSharingInfo other = (RideSharingInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTittle() == null ? other.getTittle() == null : this.getTittle().equals(other.getTittle()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getLogopicurl() == null ? other.getLogopicurl() == null : this.getLogopicurl().equals(other.getLogopicurl()))
            && (this.getDescInfo() == null ? other.getDescInfo() == null : this.getDescInfo().equals(other.getDescInfo()))
            && (this.getReadNumber() == null ? other.getReadNumber() == null : this.getReadNumber().equals(other.getReadNumber()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRecommendStatus() == null ? other.getRecommendStatus() == null : this.getRecommendStatus().equals(other.getRecommendStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTittle() == null) ? 0 : getTittle().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getLogopicurl() == null) ? 0 : getLogopicurl().hashCode());
        result = prime * result + ((getDescInfo() == null) ? 0 : getDescInfo().hashCode());
        result = prime * result + ((getReadNumber() == null) ? 0 : getReadNumber().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRecommendStatus() == null) ? 0 : getRecommendStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}