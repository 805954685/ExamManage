package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class Training implements Serializable {
    private Integer trainingId;
    private String trainingName;
    private Boolean isPrivate;
    private Integer fieldId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private Integer creator;

    /**
     * 0:未发布；1：发布；2：失效
     */
    private Boolean status;
    private Date stateTime;
    private Date expTime;
    private String trainingDesc;

    /**
     * @return training_id
     */
    public Integer getTrainingId() {
        return trainingId;
    }

    /**
     * @param trainingId
     */
    public void setTrainingId(Integer trainingId) {
        this.trainingId = trainingId;
    }

    /**
     * @return training_name
     */
    public String getTrainingName() {
        return trainingName;
    }

    /**
     * @param trainingName
     */
    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName == null ? null : trainingName.trim();
    }

    /**
     * @return is_private
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * @param isPrivate
     */
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 获取0:未发布；1：发布；2：失效
     *
     * @return status - 0:未发布；1：发布；2：失效
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置0:未发布；1：发布；2：失效
     *
     * @param status 0:未发布；1：发布；2：失效
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return state_time
     */
    public Date getStateTime() {
        return stateTime;
    }

    /**
     * @param stateTime
     */
    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }

    /**
     * @return exp_time
     */
    public Date getExpTime() {
        return expTime;
    }

    /**
     * @param expTime
     */
    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    /**
     * @return training_desc
     */
    public String getTrainingDesc() {
        return trainingDesc;
    }

    /**
     * @param trainingDesc
     */
    public void setTrainingDesc(String trainingDesc) {
        this.trainingDesc = trainingDesc == null ? null : trainingDesc.trim();
    }
}