package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class UserTrainingHistory implements Serializable {
    private Integer sectionId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 培训ID
     */
    private Integer trainingId;
    private Float duration;
    private Float process;
    private Date startTime;
    private Date lastStateTime;
    private String userTrainingDetail;

    /**
     * @return section_id
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * @param sectionId
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取培训ID
     *
     * @return training_id - 培训ID
     */
    public Integer getTrainingId() {
        return trainingId;
    }

    /**
     * 设置培训ID
     *
     * @param trainingId 培训ID
     */
    public void setTrainingId(Integer trainingId) {
        this.trainingId = trainingId;
    }

    /**
     * @return duration
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * @param duration
     */
    public void setDuration(Float duration) {
        this.duration = duration;
    }

    /**
     * @return process
     */
    public Float getProcess() {
        return process;
    }

    /**
     * @param process
     */
    public void setProcess(Float process) {
        this.process = process;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return last_state_time
     */
    public Date getLastStateTime() {
        return lastStateTime;
    }

    /**
     * @param lastStateTime
     */
    public void setLastStateTime(Date lastStateTime) {
        this.lastStateTime = lastStateTime;
    }

    /**
     * @return user_training_detail
     */
    public String getUserTrainingDetail() {
        return userTrainingDetail;
    }

    /**
     * @param userTrainingDetail
     */
    public void setUserTrainingDetail(String userTrainingDetail) {
        this.userTrainingDetail = userTrainingDetail == null ? null : userTrainingDetail.trim();
    }
}