package com.my.blog.website.model.Vo;

import com.my.blog.website.Enum.CommentsTypeEnum;
import com.my.blog.website.Enum.IsDeleteEnum;
import java.util.Date;

public class CommentsInfo {
    private Long id;

    private String tittle;

    private String descInfo;

    private Long userId;

    private String picUrl;

    private Integer approveNumber;

    private Integer notApproveNumber;

    private Integer commentsNumber;

    private Integer redirectNumber;

    private CommentsTypeEnum type;

    private Long fatherId;

    private IsDeleteEnum status;

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

    public String getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo == null ? null : descInfo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getApproveNumber() {
        return approveNumber;
    }

    public void setApproveNumber(Integer approveNumber) {
        this.approveNumber = approveNumber;
    }

    public Integer getNotApproveNumber() {
        return notApproveNumber;
    }

    public void setNotApproveNumber(Integer notApproveNumber) {
        this.notApproveNumber = notApproveNumber;
    }

    public Integer getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(Integer commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public Integer getRedirectNumber() {
        return redirectNumber;
    }

    public void setRedirectNumber(Integer redirectNumber) {
        this.redirectNumber = redirectNumber;
    }

    public CommentsTypeEnum getType() {
        return type;
    }

    public void setType(CommentsTypeEnum type) {
        this.type = type;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public IsDeleteEnum getStatus() {
        return status;
    }

    public void setStatus(IsDeleteEnum status) {
        this.status = status;
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
        CommentsInfo other = (CommentsInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTittle() == null ? other.getTittle() == null : this.getTittle().equals(other.getTittle()))
            && (this.getDescInfo() == null ? other.getDescInfo() == null : this.getDescInfo().equals(other.getDescInfo()))
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
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTittle() == null) ? 0 : getTittle().hashCode());
        result = prime * result + ((getDescInfo() == null) ? 0 : getDescInfo().hashCode());
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
        return result;
    }
}