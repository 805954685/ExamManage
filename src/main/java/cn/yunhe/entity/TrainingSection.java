package cn.yunhe.entity;

import java.io.Serializable;
import java.util.Date;

public class TrainingSection implements Serializable {
    /**
     * 1
     */
    private Integer sectionId;
    private String sectionName;
    private Integer trainingId;
    private Date createTime;
    private Integer userId;
    private String fileName;
    private String filePath;
    private String fileMd5;
    private String fileType;
    private String sectionDesc;

    /**
     * 获取1
     *
     * @return section_id - 1
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * 设置1
     *
     * @param sectionId 1
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * @return section_name
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * @param sectionName
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

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
     * @return file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * @return file_path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * @return file_md5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    /**
     * @param fileMd5
     */
    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5 == null ? null : fileMd5.trim();
    }

    /**
     * @return file_type
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * @return section_desc
     */
    public String getSectionDesc() {
        return sectionDesc;
    }

    /**
     * @param sectionDesc
     */
    public void setSectionDesc(String sectionDesc) {
        this.sectionDesc = sectionDesc == null ? null : sectionDesc.trim();
    }
}