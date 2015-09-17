package ua.divas.mobile.model;

import oracle.ateam.sample.mobile.v2.persistence.model.Entity;

import java.util.Date;

import java.math.BigDecimal;


public class LastPrices extends Entity {

    private String id;
    private String nomId;
    private Date period;
    private String edIzm;
    private BigDecimal priceUsl;
    private BigDecimal priceGoods;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomId() {
        return this.nomId;
    }

    public void setNomId(String nomId) {
        this.nomId = nomId;
    }

    public Date getPeriod() {
        return this.period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public String getEdIzm() {
        return this.edIzm;
    }

    public void setEdIzm(String edIzm) {
        this.edIzm = edIzm;
    }

    public BigDecimal getPriceUsl() {
        return this.priceUsl;
    }

    public void setPriceUsl(BigDecimal priceUsl) {
        this.priceUsl = priceUsl;
    }

    public BigDecimal getPriceGoods() {
        return this.priceGoods;
    }

    public void setPriceGoods(BigDecimal priceGoods) {
        this.priceGoods = priceGoods;
    }


}
