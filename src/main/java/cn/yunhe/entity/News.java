package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    private Integer newsId;
    private String title;
    private String content;
    /**
     * 创建人
     */
    private Integer userId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * @return news_id
     */
    public Integer getNewsId() {
        return newsId;
    }
    /**
     * @param newsId
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }
    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
     * 获取创建人
     *
     * @return user_id - 创建人
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置创建人
     *
     * @param userId 创建人
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
}