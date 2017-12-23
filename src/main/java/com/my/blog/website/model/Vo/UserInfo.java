package com.my.blog.website.model.Vo;

import com.my.blog.website.Enum.BelongTypeEnum;
import com.my.blog.website.Enum.DeviceTypeEnum;
import com.my.blog.website.Enum.SourceEnum;
import java.math.BigDecimal;
import java.util.Date;

public class UserInfo {
    private Long id;

    private String realName;

    private String userName;

    private String phoneNumber;

    private String wechatId;

    private String wechatId2;

    private String qq;

    private String weibo;

    private String passwd;

    private Byte sexy;

    private SourceEnum registerSource;

    private BelongTypeEnum belongType;

    private String registerIp;

    private DeviceTypeEnum deviceType;

    private BigDecimal score;

    private String headLogoMd5;

    private Date updateTime;

    private Date createTime;

    private Byte ageGroupType;

    private BelongTypeEnum userStatus;

    private Integer provinceId;

    private Integer cityId;

    private String userIdcardNumber;

    private Date authenTime;

    private Integer grade;

    private BigDecimal integralScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getWechatId2() {
        return wechatId2;
    }

    public void setWechatId2(String wechatId2) {
        this.wechatId2 = wechatId2 == null ? null : wechatId2.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Byte getSexy() {
        return sexy;
    }

    public void setSexy(Byte sexy) {
        this.sexy = sexy;
    }

    public SourceEnum getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(SourceEnum registerSource) {
        this.registerSource = registerSource;
    }

    public BelongTypeEnum getBelongType() {
        return belongType;
    }

    public void setBelongType(BelongTypeEnum belongType) {
        this.belongType = belongType;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public DeviceTypeEnum getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceTypeEnum deviceType) {
        this.deviceType = deviceType;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getHeadLogoMd5() {
        return headLogoMd5;
    }

    public void setHeadLogoMd5(String headLogoMd5) {
        this.headLogoMd5 = headLogoMd5 == null ? null : headLogoMd5.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getAgeGroupType() {
        return ageGroupType;
    }

    public void setAgeGroupType(Byte ageGroupType) {
        this.ageGroupType = ageGroupType;
    }

    public BelongTypeEnum getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(BelongTypeEnum userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getUserIdcardNumber() {
        return userIdcardNumber;
    }

    public void setUserIdcardNumber(String userIdcardNumber) {
        this.userIdcardNumber = userIdcardNumber == null ? null : userIdcardNumber.trim();
    }

    public Date getAuthenTime() {
        return authenTime;
    }

    public void setAuthenTime(Date authenTime) {
        this.authenTime = authenTime;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public BigDecimal getIntegralScore() {
        return integralScore;
    }

    public void setIntegralScore(BigDecimal integralScore) {
        this.integralScore = integralScore;
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
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getWechatId() == null ? other.getWechatId() == null : this.getWechatId().equals(other.getWechatId()))
            && (this.getWechatId2() == null ? other.getWechatId2() == null : this.getWechatId2().equals(other.getWechatId2()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWeibo() == null ? other.getWeibo() == null : this.getWeibo().equals(other.getWeibo()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getSexy() == null ? other.getSexy() == null : this.getSexy().equals(other.getSexy()))
            && (this.getRegisterSource() == null ? other.getRegisterSource() == null : this.getRegisterSource().equals(other.getRegisterSource()))
            && (this.getBelongType() == null ? other.getBelongType() == null : this.getBelongType().equals(other.getBelongType()))
            && (this.getRegisterIp() == null ? other.getRegisterIp() == null : this.getRegisterIp().equals(other.getRegisterIp()))
            && (this.getDeviceType() == null ? other.getDeviceType() == null : this.getDeviceType().equals(other.getDeviceType()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getHeadLogoMd5() == null ? other.getHeadLogoMd5() == null : this.getHeadLogoMd5().equals(other.getHeadLogoMd5()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAgeGroupType() == null ? other.getAgeGroupType() == null : this.getAgeGroupType().equals(other.getAgeGroupType()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getUserIdcardNumber() == null ? other.getUserIdcardNumber() == null : this.getUserIdcardNumber().equals(other.getUserIdcardNumber()))
            && (this.getAuthenTime() == null ? other.getAuthenTime() == null : this.getAuthenTime().equals(other.getAuthenTime()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getIntegralScore() == null ? other.getIntegralScore() == null : this.getIntegralScore().equals(other.getIntegralScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getWechatId() == null) ? 0 : getWechatId().hashCode());
        result = prime * result + ((getWechatId2() == null) ? 0 : getWechatId2().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWeibo() == null) ? 0 : getWeibo().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getSexy() == null) ? 0 : getSexy().hashCode());
        result = prime * result + ((getRegisterSource() == null) ? 0 : getRegisterSource().hashCode());
        result = prime * result + ((getBelongType() == null) ? 0 : getBelongType().hashCode());
        result = prime * result + ((getRegisterIp() == null) ? 0 : getRegisterIp().hashCode());
        result = prime * result + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getHeadLogoMd5() == null) ? 0 : getHeadLogoMd5().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAgeGroupType() == null) ? 0 : getAgeGroupType().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getUserIdcardNumber() == null) ? 0 : getUserIdcardNumber().hashCode());
        result = prime * result + ((getAuthenTime() == null) ? 0 : getAuthenTime().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getIntegralScore() == null) ? 0 : getIntegralScore().hashCode());
        return result;
    }
}