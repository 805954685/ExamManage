package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class ExamPaper implements Serializable {
    private Integer id;
    private String name;
    /**
     * 试卷考试时间
     */
    private Integer duration;
    private Integer totalPoint;
    private Integer passPoint;
    /**
     * 班组ID
     */
    private Integer groupId;

    /**
     * 是否所有用户可见，默认为0
     */
    private Boolean isVisible;
    /**
     * 试卷状态， 0未完成 -> 1已完成 -> 2已发布 -> 3通过审核 （已发布和通过审核的无法再修改）
     */
    private Boolean status;
    private Date createTime;
    /**
     * 试卷介绍
     */
    private String summary;
    /**
     * 为1表示为包含主观题的试卷，需阅卷
     */
    private Boolean isSubjective;
    /**
     * 创建人的账号
     */
    private String creator;
    /**
     * 0 真题 1 模拟 2 专家
     */
    private String paperType;
    private Integer fieldId;
    private String content;
    /**
     * 试卷答案，用答题卡的结构保存
     */
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
     * 获取试卷考试时间
     *
     * @return duration - 试卷考试时间
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置试卷考试时间
     *
     * @param duration 试卷考试时间
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return total_point
     */
    public Integer getTotalPoint() {
        return totalPoint;
    }

    /**
     * @param totalPoint
     */
    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    /**
     * @return pass_point
     */
    public Integer getPassPoint() {
        return passPoint;
    }

    /**
     * @param passPoint
     */
    public void setPassPoint(Integer passPoint) {
        this.passPoint = passPoint;
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
     * 获取是否所有用户可见，默认为0
     *
     * @return is_visible - 是否所有用户可见，默认为0
     */
    public Boolean getIsVisible() {
        return isVisible;
    }

    /**
     * 设置是否所有用户可见，默认为0
     *
     * @param isVisible 是否所有用户可见，默认为0
     */
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * 获取试卷状态， 0未完成 -> 1已完成 -> 2已发布 -> 3通过审核 （已发布和通过审核的无法再修改）
     *
     * @return status - 试卷状态， 0未完成 -> 1已完成 -> 2已发布 -> 3通过审核 （已发布和通过审核的无法再修改）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置试卷状态， 0未完成 -> 1已完成 -> 2已发布 -> 3通过审核 （已发布和通过审核的无法再修改）
     *
     * @param status 试卷状态， 0未完成 -> 1已完成 -> 2已发布 -> 3通过审核 （已发布和通过审核的无法再修改）
     */
    public void setStatus(Boolean status) {
        this.status = status;
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
     * 获取试卷介绍
     *
     * @return summary - 试卷介绍
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置试卷介绍
     *
     * @param summary 试卷介绍
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * 获取为1表示为包含主观题的试卷，需阅卷
     *
     * @return is_subjective - 为1表示为包含主观题的试卷，需阅卷
     */
    public Boolean getIsSubjective() {
        return isSubjective;
    }

    /**
     * 设置为1表示为包含主观题的试卷，需阅卷
     *
     * @param isSubjective 为1表示为包含主观题的试卷，需阅卷
     */
    public void setIsSubjective(Boolean isSubjective) {
        this.isSubjective = isSubjective;
    }

    /**
     * 获取创建人的账号
     *
     * @return creator - 创建人的账号
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人的账号
     *
     * @param creator 创建人的账号
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取0 真题 1 模拟 2 专家
     *
     * @return paper_type - 0 真题 1 模拟 2 专家
     */
    public String getPaperType() {
        return paperType;
    }

    /**
     * 设置0 真题 1 模拟 2 专家
     *
     * @param paperType 0 真题 1 模拟 2 专家
     */
    public void setPaperType(String paperType) {
        this.paperType = paperType == null ? null : paperType.trim();
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
     * 获取试卷答案，用答题卡的结构保存
     *
     * @return answer_sheet - 试卷答案，用答题卡的结构保存
     */
    public String getAnswerSheet() {
        return answerSheet;
    }

    /**
     * 设置试卷答案，用答题卡的结构保存
     *
     * @param answerSheet 试卷答案，用答题卡的结构保存
     */
    public void setAnswerSheet(String answerSheet) {
        this.answerSheet = answerSheet == null ? null : answerSheet.trim();
    }
}