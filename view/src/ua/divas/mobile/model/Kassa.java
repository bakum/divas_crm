package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;


public class Kassa extends Entity {

    private String id;
    private String fullname;
    private Integer isGroup;
    private String parentId;
    private String currId;
    private String divisionId;
    private Integer deleted;
    private Integer predefined;
    private String firmaId;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getIsGroup() {
        return this.isGroup;
    }

    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCurrId() {
        return this.currId;
    }

    public void setCurrId(String currId) {
        this.currId = currId;
    }

    public String getDivisionId() {
        return this.divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getPredefined() {
        return this.predefined;
    }

    public void setPredefined(Integer predefined) {
        this.predefined = predefined;
    }

    public String getFirmaId() {
        return this.firmaId;
    }

    public void setFirmaId(String firmaId) {
        this.firmaId = firmaId;
    }


}
