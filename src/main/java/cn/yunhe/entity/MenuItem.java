package cn.yunhe.entity;


import java.io.Serializable;

public class MenuItem implements Serializable {
    private String menuId;
    private String menuName;
    private String menuHref;
    private Integer menuSeq;
    private String authority;
    private String parentId;
    private String icon;
    private Byte visiable;

    /**
     * @return menu_id
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * @return menu_href
     */
    public String getMenuHref() {
        return menuHref;
    }

    /**
     * @param menuHref
     */
    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref == null ? null : menuHref.trim();
    }

    /**
     * @return menu_seq
     */
    public Integer getMenuSeq() {
        return menuSeq;
    }

    /**
     * @param menuSeq
     */
    public void setMenuSeq(Integer menuSeq) {
        this.menuSeq = menuSeq;
    }

    /**
     * @return authority
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * @param authority
     */
    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    /**
     * @return parent_id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return visiable
     */
    public Byte getVisiable() {
        return visiable;
    }

    /**
     * @param visiable
     */
    public void setVisiable(Byte visiable) {
        this.visiable = visiable;
    }
}