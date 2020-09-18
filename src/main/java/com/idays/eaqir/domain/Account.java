package com.idays.eaqir.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wordnik.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;

@Getter
@Setter
@ToString
@ApiModel(value="用户实体类",description = "用户信息描述类")
public class Account {
    @TableId(type= IdType.AUTO)
    @ApiModelProperty(value = "用户ID")
    private Integer id;
    private String accountCode;
    private String districtAt;
    private String userAccount;
    private String securityCode;
    private String organizationName;
    private String shortName;
    private String representative;
    private String address;
    private String postalCode;
    private String areaCode;
    private String officePhone;
    private String extCode;
    private String contactName;
    private String mobilePhone;
    private String workQQ;
    private String mailBox;
    private String certificatePhotoFiles;
    private Integer regTime;
    private String registrar;
    private Integer updateTime;
    private String editor;
    private Integer confirmTime;
    private String auditor;
    private Integer lastLoginTime;
    private String ipV4;
    private String ipV6;
    private Integer validSigninCount;
    private Integer invalidSigninCount;
    private String comments;
    private Integer accountStatus;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getDistrictAt() {
        return districtAt;
    }

    public void setDistrictAt(String districtAt) {
        this.districtAt = districtAt;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getExtCode() {
        return extCode;
    }

    public void setExtCode(String extCode) {
        this.extCode = extCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkQQ() {
        return workQQ;
    }

    public void setWorkQQ(String workQQ) {
        this.workQQ = workQQ;
    }

    public String getMailBox() {
        return mailBox;
    }

    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

    public String getCertificatePhotoFiles() {
        return certificatePhotoFiles;
    }

    public void setCertificatePhotoFiles(String certificatePhotoFiles) {
        this.certificatePhotoFiles = certificatePhotoFiles;
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getIpV4() {
        return ipV4;
    }

    public void setIpV4(String ipV4) {
        this.ipV4 = ipV4;
    }

    public String getIpV6() {
        return ipV6;
    }

    public void setIpV6(String ipV6) {
        this.ipV6 = ipV6;
    }

    public Integer getValidSigninCount() {
        return validSigninCount;
    }

    public void setValidSigninCount(Integer validSigninCount) {
        this.validSigninCount = validSigninCount;
    }

    public Integer getInvalidSigninCount() {
        return invalidSigninCount;
    }

    public void setInvalidSigninCount(Integer invalidSigninCount) {
        this.invalidSigninCount = invalidSigninCount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
