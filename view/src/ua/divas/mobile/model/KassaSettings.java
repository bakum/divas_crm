package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;


public class KassaSettings extends Entity {

    private String id;
    private String userId;
    private String kassaId;
    private String kassaName;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKassaId() {
        return this.kassaId;
    }

    public void setKassaId(String kassaId) {
        this.kassaId = kassaId;
    }

    public String getKassaName() {
        return this.kassaName;
    }

    public void setKassaName(String kassaName) {
        this.kassaName = kassaName;
    }


}
