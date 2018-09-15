package cn.yunhe.entity;


import java.io.Serializable;

public class Reference implements Serializable {
    private Integer referenceId;
    private String referenceName;
    private String memo;

    /**
     * 1 正常 0 废弃
     */
    private Long state;

    /**
     * @return reference_id
     */
    public Integer getReferenceId() {
        return referenceId;
    }

    /**
     * @param referenceId
     */
    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * @return reference_name
     */
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * @param referenceName
     */
    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName == null ? null : referenceName.trim();
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
    public Long getState() {
        return state;
    }

    /**
     * 设置1 正常 0 废弃
     *
     * @param state 1 正常 0 废弃
     */
    public void setState(Long state) {
        this.state = state;
    }
}