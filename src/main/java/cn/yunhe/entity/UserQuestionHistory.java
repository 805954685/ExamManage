package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class UserQuestionHistory implements Serializable {
    private Integer questionId;
    private Integer userId;
    private Integer questionTypeId;
    private Byte isRight;
    private Date createTime;

    /**
     * @return question_id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
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
     * @return question_type_id
     */
    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    /**
     * @param questionTypeId
     */
    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    /**
     * @return is_right
     */
    public Byte getIsRight() {
        return isRight;
    }

    /**
     * @param isRight
     */
    public void setIsRight(Byte isRight) {
        this.isRight = isRight;
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
}