package ua.divas.mobile.model;

import java.util.Arrays;
import java.util.List;

import oracle.ateam.sample.mobile.v2.persistence.util.EntityUtils;
import oracle.ateam.sample.mobile.v2.persistence.manager.DBPersistenceManager;
import oracle.ateam.sample.mobile.v2.persistence.model.Entity;


public class Kontragents extends Entity {

    private String id;
    private Integer isGroup;
    private String parentId;
    private String fullname;
    private Integer deleted;
    private String inn;
    private String okpo;
    private String kpp;
    private String namefull;
    private Integer urFiz;
    private Integer predefined;
    private Integer isSupplier;
    private Integer isBuyer;
    private Integer isMeasurer;
    private String userId;

    private List<Contact> contact = createIndirectList("contact");


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getInn() {
        return this.inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOkpo() {
        return this.okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public String getKpp() {
        return this.kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getNamefull() {
        return this.namefull;
    }

    public void setNamefull(String namefull) {
        this.namefull = namefull;
    }

    public Integer getUrFiz() {
        return this.urFiz;
    }

    public void setUrFiz(Integer urFiz) {
        this.urFiz = urFiz;
    }

    public Integer getPredefined() {
        return this.predefined;
    }

    public void setPredefined(Integer predefined) {
        this.predefined = predefined;
    }

    public Integer getIsSupplier() {
        return this.isSupplier;
    }

    public void setIsSupplier(Integer isSupplier) {
        this.isSupplier = isSupplier;
    }

    public Integer getIsBuyer() {
        return this.isBuyer;
    }

    public void setIsBuyer(Integer isBuyer) {
        this.isBuyer = isBuyer;
    }

    public Integer getIsMeasurer() {
        return this.isMeasurer;
    }

    public void setIsMeasurer(Integer isMeasurer) {
        this.isMeasurer = isMeasurer;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public void setContact(List<Contact> contact) {
        this.contact.clear();
        this.contact.addAll(contact);
        getProviderChangeSupport().fireProviderRefresh("contact");
    }

    /**
     * This method is called when entity instance is recreated from persisted JSON string in DataSynchAction
     */
    public void setContact(Contact[] contact) {
        setContact(Arrays.asList(contact));
    }

    public List<Contact> getContact() {
        return this.contact;
    }


    public void addContact(int index, Contact contact) {
        contact.setIsNewEntity(true);
        EntityUtils.generatePrimaryKeyValue(contact, 1);
        contact.setKontragId(getId());
    }

    public void removeContact(Contact contact) {
        DBPersistenceManager pm = new DBPersistenceManager();
        pm.removeEntity(contact, true);
    }


}
