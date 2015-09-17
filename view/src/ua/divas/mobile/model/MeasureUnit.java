package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;


public class MeasureUnit extends Entity {

    private String id;
    private String fullname;
    private String code;
    private Integer deleted;


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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }


}
