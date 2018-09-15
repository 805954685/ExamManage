package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * PK
     */
    private Integer userId;
    /**
     * 账号
     */
    private String userName;
    /**
     * 真实姓名
     */
    private String trueName;
    private String nationalId;
    private String password;
    private String email;
    private String phoneNum;
    private Date createTime;
    /**
     * 创建人
     */
    private Integer createBy;
    /**
     * 激活状态：0-未激活 1-激活
     */
    private Boolean enabled;
    private Integer fieldId;
    private Date lastLoginTime;
    private Date loginTime;
    private String department;
    /**
     * 1
     */
    private String company;
    /**
     * 获取PK
     *
     * @return user_id - PK
     */
    public Integer getUserId() {
        return userId;
    }
    /**
     * 设置PK
     *
     * @param userId PK
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    /**
     * 获取账号
     *
     * @return user_name - 账号
     */
    public String getUserName() {
        return userName;
    }
    /**
     * 设置账号
     *
     * @param userName 账号
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取真实姓名
     *
     * @return true_name - 真实姓名
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * 设置真实姓名
     *
     * @param trueName 真实姓名
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    /**
     * @return national_id
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * @param nationalId
     */
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId == null ? null : nationalId.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return phone_num
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取激活状态：0-未激活 1-激活
     *
     * @return enabled - 激活状态：0-未激活 1-激活
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置激活状态：0-未激活 1-激活
     *
     * @param enabled 激活状态：0-未激活 1-激活
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return field_id
     */
    public Integer getFieldId() {
        return fieldId;
    }

    /**
     * @param fieldId
     */
    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * @return last_login_time
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 获取1
     *
     * @return company - 1
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置1
     *
     * @param company 1
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}