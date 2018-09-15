package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private Integer id;
    private String name;
    private String content;
    /**
     * 题型
     */
    private Integer questionTypeId;
    /**
     * 试题考试时间
     */
    private Integer duration;
    private Integer points;
    /**
     * 班组ID
     */
    private Integer groupId;
    /**
     * 试题可见性
     */
    private Boolean isVisible;
    private Date createTime;
    /**
     * 创建者
     */
    private String creator;
    private Date lastModify;
    private Integer exposeTimes;
    private Integer rightTimes;
    private Integer wrongTimes;
    private Integer difficulty;
    private String reference;
    private String examingPoint;
    private String keyword;
    private String answer;
    private String analysis;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取题型
     *
     * @return question_type_id - 题型
     */
    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    /**
     * 设置题型
     *
     * @param questionTypeId 题型
     */
    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    /**
     * 获取试题考试时间
     *
     * @return duration - 试题考试时间
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置试题考试时间
     *
     * @param duration 试题考试时间
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * @param points
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 获取班组ID
     *
     * @return group_id - 班组ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置班组ID
     *
     * @param groupId 班组ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取试题可见性
     *
     * @return is_visible - 试题可见性
     */
    public Boolean getIsVisible() {
        return isVisible;
    }

    /**
     * 设置试题可见性
     *
     * @param isVisible 试题可见性
     */
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
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
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return last_modify
     */
    public Date getLastModify() {
        return lastModify;
    }

    /**
     * @param lastModify
     */
    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    /**
     * @return expose_times
     */
    public Integer getExposeTimes() {
        return exposeTimes;
    }

    /**
     * @param exposeTimes
     */
    public void setExposeTimes(Integer exposeTimes) {
        this.exposeTimes = exposeTimes;
    }

    /**
     * @return right_times
     */
    public Integer getRightTimes() {
        return rightTimes;
    }

    /**
     * @param rightTimes
     */
    public void setRightTimes(Integer rightTimes) {
        this.rightTimes = rightTimes;
    }

    /**
     * @return wrong_times
     */
    public Integer getWrongTimes() {
        return wrongTimes;
    }

    /**
     * @param wrongTimes
     */
    public void setWrongTimes(Integer wrongTimes) {
        this.wrongTimes = wrongTimes;
    }

    /**
     * @return difficulty
     */
    public Integer getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty
     */
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    /**
     * @return examing_point
     */
    public String getExamingPoint() {
        return examingPoint;
    }

    /**
     * @param examingPoint
     */
    public void setExamingPoint(String examingPoint) {
        this.examingPoint = examingPoint == null ? null : examingPoint.trim();
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * @return analysis
     */
    public String getAnalysis() {
        return analysis;
    }

    /**
     * @param analysis
     */
    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }
}