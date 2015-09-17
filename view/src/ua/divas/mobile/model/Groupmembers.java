package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;


public class Groupmembers extends Entity {

    private String id;
    private String gName;
    private String gMember;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGName() {
        return this.gName;
    }

    public void setGName(String gName) {
        this.gName = gName;
    }

    public String getGMember() {
        return this.gMember;
    }

    public void setGMember(String gMember) {
        this.gMember = gMember;
    }


}
