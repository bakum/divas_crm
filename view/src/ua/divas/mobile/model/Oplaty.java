package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;

import java.util.Date;

import java.math.BigDecimal;


public class Oplaty extends Entity {

    private String id;
    private String orderId;
    private Date dat;
    private BigDecimal sum1;
    private String userId;
    private String comments;
    private String zamerId;
    private String kassaId;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getDat() {
        return this.dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public BigDecimal getSum1() {
        return this.sum1;
    }

    public void setSum1(BigDecimal sum1) {
        this.sum1 = sum1;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getZamerId() {
        return this.zamerId;
    }

    public void setZamerId(String zamerId) {
        this.zamerId = zamerId;
    }

    public String getKassaId() {
        return this.kassaId;
    }

    public void setKassaId(String kassaId) {
        this.kassaId = kassaId;
    }


}
