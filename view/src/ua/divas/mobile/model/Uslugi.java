package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;

import java.math.BigDecimal;

import java.util.Date;


public class Uslugi extends Entity {

    private String id;
    private String orderId;
    private String nomId;
    private BigDecimal price;
    private BigDecimal summ;
    private Date datComplete;
    private String sotrId;
    private Date datToPay;
    private String groupId;
    private String measureId;
    private BigDecimal quantity;
    private String addWork;
    private BigDecimal priceAdd;


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

    public String getNomId() {
        return this.nomId;
    }

    public void setNomId(String nomId) {
        this.nomId = nomId;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSumm() {
        return this.summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public Date getDatComplete() {
        return this.datComplete;
    }

    public void setDatComplete(Date datComplete) {
        this.datComplete = datComplete;
    }

    public String getSotrId() {
        return this.sotrId;
    }

    public void setSotrId(String sotrId) {
        this.sotrId = sotrId;
    }

    public Date getDatToPay() {
        return this.datToPay;
    }

    public void setDatToPay(Date datToPay) {
        this.datToPay = datToPay;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMeasureId() {
        return this.measureId;
    }

    public void setMeasureId(String measureId) {
        this.measureId = measureId;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getAddWork() {
        return this.addWork;
    }

    public void setAddWork(String addWork) {
        this.addWork = addWork;
    }

    public BigDecimal getPriceAdd() {
        return this.priceAdd;
    }

    public void setPriceAdd(BigDecimal priceAdd) {
        this.priceAdd = priceAdd;
    }


}
