package ua.divas.mobile.model;

import java.util.Arrays;
import java.util.List;

import oracle.ateam.sample.mobile.v2.persistence.util.EntityUtils;
import oracle.ateam.sample.mobile.v2.persistence.manager.DBPersistenceManager;
import oracle.ateam.sample.mobile.v2.persistence.model.Entity;

import java.util.Date;

import java.math.BigDecimal;

import java.util.UUID;

import oracle.adfmf.framework.api.AdfmfJavaUtilities;

import ua.divas.mobile.model.service.AuthUser;
import ua.divas.mobile.model.service.UsersService;


public class Orders extends Entity {

    private String id;
    private Date dat;
    private String num;
    private String kontragId;
    private String kontragName;
    private String currId;
    private String kassaId;
    private String divisionId;
    private String divisionName;
    private String userId;
    private String userName;
    private BigDecimal kurs;
    private Long kratnost;
    private String discription;
    private Integer deleted;
    private Date version;
    private Integer posted;
    private String firmId;
    private String activitiesId;
    private String statusId;
    private String statusName;
    private String zamerId;
    private String zamerName;
    private String zamerUserName;
    private String zamerUserId;
    private Date datZam;
    private BigDecimal summPlan;
    private Date datComplete;
    private String agentId;
    private Date datCompleteFact;
    private String divisionDest;

    private List<Oplaty> oplaty = createIndirectList("oplaty");
    private List<Uslugi> uslugi = createIndirectList("uslugi");


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDat() {
        return this.dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getKontragId() {
        return this.kontragId;
    }

    public void setKontragId(String kontragId) {
        this.kontragId = kontragId;
    }

    public String getKontragName() {
        return this.kontragName;
    }

    public void setKontragName(String kontragName) {
        this.kontragName = kontragName;
    }

    public String getCurrId() {
        return this.currId;
    }

    public void setCurrId(String currId) {
        this.currId = currId;
    }

    public String getKassaId() {
        return this.kassaId;
    }

    public void setKassaId(String kassaId) {
        this.kassaId = kassaId;
    }

    public String getDivisionId() {
        return this.divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return this.divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getKurs() {
        return this.kurs;
    }

    public void setKurs(BigDecimal kurs) {
        this.kurs = kurs;
    }

    public Long getKratnost() {
        return this.kratnost;
    }

    public void setKratnost(Long kratnost) {
        this.kratnost = kratnost;
    }

    public String getDiscription() {
        return this.discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getVersion() {
        return this.version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public Integer getPosted() {
        return this.posted;
    }

    public void setPosted(Integer posted) {
        this.posted = posted;
    }

    public String getFirmId() {
        return this.firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public String getActivitiesId() {
        return this.activitiesId;
    }

    public void setActivitiesId(String activitiesId) {
        this.activitiesId = activitiesId;
    }

    public String getStatusId() {
        return this.statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getZamerId() {
        return this.zamerId;
    }

    public void setZamerId(String zamerId) {
        this.zamerId = zamerId;
    }

    public String getZamerName() {
        return this.zamerName;
    }

    public void setZamerName(String zamerName) {
        this.zamerName = zamerName;
    }

    public String getZamerUserName() {
        return this.zamerUserName;
    }

    public void setZamerUserName(String zamerUserName) {
        this.zamerUserName = zamerUserName;
    }

    public String getZamerUserId() {
        return this.zamerUserId;
    }

    public void setZamerUserId(String zamerUserId) {
        this.zamerUserId = zamerUserId;
    }

    public Date getDatZam() {
        return this.datZam;
    }

    public void setDatZam(Date datZam) {
        this.datZam = datZam;
    }

    public BigDecimal getSummPlan() {
        return this.summPlan;
    }

    public void setSummPlan(BigDecimal summPlan) {
        this.summPlan = summPlan;
    }

    public Date getDatComplete() {
        return this.datComplete;
    }

    public void setDatComplete(Date datComplete) {
        this.datComplete = datComplete;
    }

    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Date getDatCompleteFact() {
        return this.datCompleteFact;
    }

    public void setDatCompleteFact(Date datCompleteFact) {
        this.datCompleteFact = datCompleteFact;
    }

    public String getDivisionDest() {
        return this.divisionDest;
    }

    public void setDivisionDest(String divisionDest) {
        this.divisionDest = divisionDest;
    }


    public void setOplaty(List<Oplaty> oplaty) {
        this.oplaty.clear();
        this.oplaty.addAll(oplaty);
        getProviderChangeSupport().fireProviderRefresh("oplaty");
    }

    /**
     * This method is called when entity instance is recreated from persisted JSON string in DataSynchAction
     */
    public void setOplaty(Oplaty[] oplaty) {
        setOplaty(Arrays.asList(oplaty));
    }

    public List<Oplaty> getOplaty() {
        return this.oplaty;
    }


    public void addOplaty(int index, Oplaty oplaty) {
        oplaty.setIsNewEntity(true);
        EntityUtils.generatePrimaryKeyValue(oplaty, 1);
        oplaty.setId(UUID.randomUUID().toString());
        oplaty.setOrderId(getId());
        oplaty.setDat(new Date());
        
        AuthUser au = new AuthUser();
        //oplaty.setComments(us.toString());
        //UsersService uService = (UsersService) EntityUtils.getEntityCRUDService(Users.class);
        //Users u = uService.findIdByLogin(this.getZamerUserName());
        oplaty.setUserId(au.getUserId());
        //UserSettings us = u.getUserSettings().get(0);
        //KassaSettings ks = u.getKassaSettings().get(0);
        oplaty.setZamerId(au.getZamerId());
        oplaty.setKassaId(au.getKassaId());
    }

    public void removeOplaty(Oplaty oplaty) {
        DBPersistenceManager pm = new DBPersistenceManager();
        pm.removeEntity(oplaty, true);
    }


    public void setUslugi(List<Uslugi> uslugi) {
        this.uslugi.clear();
        this.uslugi.addAll(uslugi);
        getProviderChangeSupport().fireProviderRefresh("uslugi");
    }

    /**
     * This method is called when entity instance is recreated from persisted JSON string in DataSynchAction
     */
    public void setUslugi(Uslugi[] uslugi) {
        setUslugi(Arrays.asList(uslugi));
    }

    public List<Uslugi> getUslugi() {
        return this.uslugi;
    }


    public void addUslugi(int index, Uslugi uslugi) {
        uslugi.setIsNewEntity(true);
        EntityUtils.generatePrimaryKeyValue(uslugi, 1);
        uslugi.setOrderId(getId());
    }

    public void removeUslugi(Uslugi uslugi) {
        DBPersistenceManager pm = new DBPersistenceManager();
        pm.removeEntity(uslugi, true);
    }


}
