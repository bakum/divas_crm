package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;


public class Nomgroup extends Entity {

    private String id;
    private String fullname;
    private Integer deleted;
    private Integer isGroup;
    private String parentId;
    private Integer usluga;
    private Integer predefined;
    private String artikul;


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

    public Integer getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
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

    public Integer getUsluga() {
        return this.usluga;
    }

    public void setUsluga(Integer usluga) {
        this.usluga = usluga;
    }

    public Integer getPredefined() {
        return this.predefined;
    }

    public void setPredefined(Integer predefined) {
        this.predefined = predefined;
    }

    public String getArtikul() {
        return this.artikul;
    }

    public void setArtikul(String artikul) {
        this.artikul = artikul;
    }


}
