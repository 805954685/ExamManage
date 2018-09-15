package cn.yunhe.entity;


import java.io.Serializable;

public class QuestionType implements Serializable {
    private Integer id;
    private String name;
    private Boolean subjective;
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
     * @return subjective
     */
    public Boolean getSubjective() {
        return subjective;
    }

    /**
     * @param subjective
     */
    public void setSubjective(Boolean subjective) {
        this.subjective = subjective;
    }
}