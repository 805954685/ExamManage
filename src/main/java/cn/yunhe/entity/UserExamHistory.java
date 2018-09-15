package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class UserExamHistory implements Serializable {
    private Integer id;
    private Integer userId;
    private Date startTime;
    private Integer examId;
    private Integer examPaperId;
    private Byte enabled;
    private Integer point;
    private String seriNo;
    private Date createTime;
    private Integer duration;
    private Float pointGet;
    private Date submitTime;
    private Byte approved;
    private Date verifyTime;
    private String content;
    private String answerSheet;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return exam_id
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * @param examId
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
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
     * @return enabled
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * @return point
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * @param point
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * @return seri_no
     */
    public String getSeriNo() {
        return seriNo;
    }

    /**
     * @param seriNo
     */
    public void setSeriNo(String seriNo) {
        this.seriNo = seriNo == null ? null : seriNo.trim();
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
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return point_get
     */
    public Float getPointGet() {
        return pointGet;
    }

    /**
     * @param pointGet
     */
    public void setPointGet(Float pointGet) {
        this.pointGet = pointGet;
    }

    /**
     * @return submit_time
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * @param submitTime
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
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

    /**
     * @return verify_time
     */
    public Date getVerifyTime() {
        return verifyTime;
    }

    /**
     * @param verifyTime
     */
    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * @return answer_sheet
     */
    public String getAnswerSheet() {
        return answerSheet;
    }

    /**
     * @param answerSheet
     */
    public void setAnswerSheet(String answerSheet) {
        this.answerSheet = answerSheet == null ? null : answerSheet.trim();
    }
}