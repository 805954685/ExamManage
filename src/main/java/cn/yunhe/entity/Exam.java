package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class Exam implements Serializable {
    private Integer id;
    private String examName;
    private String examSubscribe;
    /**
     * 公有、私有、模拟考试
     */
    private Byte examType;
    private Date createTime;
    private Date startTime;
    private Date endTime;
    private Integer examPaperId;
    private Integer creator;
    private String creatorId;
    private Byte approved;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return exam_name
     */
    public String getExamName() {
        return examName;
    }

    /**
     * @param examName
     */
    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    /**
     * @return exam_subscribe
     */
    public String getExamSubscribe() {
        return examSubscribe;
    }

    /**
     * @param examSubscribe
     */
    public void setExamSubscribe(String examSubscribe) {
        this.examSubscribe = examSubscribe == null ? null : examSubscribe.trim();
    }

    /**
     * 获取公有、私有、模拟考试
     *
     * @return exam_type - 公有、私有、模拟考试
     */
    public Byte getExamType() {
        return examType;
    }

    /**
     * 设置公有、私有、模拟考试
     *
     * @param examType 公有、私有、模拟考试
     */
    public void setExamType(Byte examType) {
        this.examType = examType;
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
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return exam_paper_id
     */
    public Integer getExamPaperId() {
        return examPaperId;
    }

    /**
     * @param examPaperId
     */
    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    /**
     * @return creator
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * @return creator_id
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * @return approved
     */
    public Byte getApproved() {
        return approved;
    }

    /**
     * @param approved
     */
    public void setApproved(Byte approved) {
        this.approved = approved;
    }
}