package cn.yunhe.entity;


import java.io.Serializable;

public class KnowledgePoint implements Serializable {
    private Integer pointId;
    private String pointName;
    private Integer fieldId;
    private String memo;
    /**
     * 1:正常 0：废弃
     */
    private Short state;
    /**
     * @return point_id
     */
    public Integer getPointId() {
        return pointId;
    }

    /**
     * @param pointId
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    /**
     * @return point_name
     */
    public String getPointName() {
        return pointName;
    }

    /**
     * @param pointName
     */
    public void setPointName(String pointName) {
        this.pointName = pointName == null ? null : pointName.trim();
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
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 获取1:正常 0：废弃
     *
     * @return state - 1:正常 0：废弃
     */
    public Short getState() {
        return state;
    }

    /**
     * 设置1:正常 0：废弃
     *
     * @param state 1:正常 0：废弃
     */
    public void setState(Short state) {
        this.state = state;
    }
}