package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;

import java.util.Date;


public class Contact extends Entity {

    private String id;
    private Date version;
    private String kontragId;
    private String adress;
    private String phone;
    private String email;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getVersion() {
        return this.version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public String getKontragId() {
        return this.kontragId;
    }

    public void setKontragId(String kontragId) {
        this.kontragId = kontragId;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
