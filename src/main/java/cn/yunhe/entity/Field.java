package cn.yunhe.entity;


import java.io.Serializable;

public class Field implements Serializable {
    private Integer fieldId;
    private String fieldName;
    private String memo;
    /**
     * 1 正常 0 废弃
     */
    private Short state;
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
     * @return field_name
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
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
     * 获取1 正常 0 废弃
     *
     * @return state - 1 正常 0 废弃
     */
    public Short getState() {
        return state;
    }

    /**
     * 设置1 正常 0 废弃
     *
     * @param state 1 正常 0 废弃
     */
    public void setState(Short state) {
        this.state = state;
    }
}