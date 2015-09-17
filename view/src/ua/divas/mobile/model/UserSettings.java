package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;


public class UserSettings extends Entity {

    private String id;
    private String userId;
    private String divisionId;
    private String firmaId;
    private String currencyId;
    private String kassaId;
    private String mainUsluga;
    private String activitiesId;
    private String zamerkontragId;
    private String kontragId;
    private String netId;


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

    public String getDivisionId() {
        return this.divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String getFirmaId() {
        return this.firmaId;
    }

    public void setFirmaId(String firmaId) {
        this.firmaId = firmaId;
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getKassaId() {
        return this.kassaId;
    }

    public void setKassaId(String kassaId) {
        this.kassaId = kassaId;
    }

    public String getMainUsluga() {
        return this.mainUsluga;
    }

    public void setMainUsluga(String mainUsluga) {
        this.mainUsluga = mainUsluga;
    }

    public String getActivitiesId() {
        return this.activitiesId;
    }

    public void setActivitiesId(String activitiesId) {
        this.activitiesId = activitiesId;
    }

    public String getZamerkontragId() {
        return this.zamerkontragId;
    }

    public void setZamerkontragId(String zamerkontragId) {
        this.zamerkontragId = zamerkontragId;
    }

    public String getKontragId() {
        return this.kontragId;
    }

    public void setKontragId(String kontragId) {
        this.kontragId = kontragId;
    }

    public String getNetId() {
        return this.netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }


}
