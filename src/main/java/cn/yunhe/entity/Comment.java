package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer commentId;
    private Integer referId;
    private Boolean commentType;
    private Integer indexId;
    private Integer userId;
    private Integer quotoId;
    private Integer reId;
    private Date createTime;
    private String contentMsg;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReferId() {
        return referId;
    }

    public void setReferId(Integer referId) {
        this.referId = referId;
    }

    public Boolean getCommentType() {
        return commentType;
    }

    public void setCommentType(Boolean commentType) {
        this.commentType = commentType;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuotoId() {
        return quotoId;
    }

    public void setQuotoId(Integer quotoId) {
        this.quotoId = quotoId;
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContentMsg() {
        return contentMsg;
    }

    public void setContentMsg(String contentMsg) {
        this.contentMsg = contentMsg == null ? null : contentMsg.trim();
    }
}