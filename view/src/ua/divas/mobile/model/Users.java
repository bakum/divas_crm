package ua.divas.mobile.model;

import java.util.Arrays;
import java.util.List;

import oracle.ateam.sample.mobile.v2.persistence.util.EntityUtils;
import oracle.ateam.sample.mobile.v2.persistence.manager.DBPersistenceManager;
import oracle.ateam.sample.mobile.v2.persistence.model.Entity;

import java.util.Date;


public class Users extends Entity {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer isAdmin;
    private String login;
    private Integer predefined;
    private String uDescription;
    private Integer isZamer;
    private Integer isActive;
    private Date dateBefore;
    private Integer dateBefireAccept;

    private List<KassaSettings> kassaSettings = createIndirectList("kassaSettings");
    private List<UserSettings> userSettings = createIndirectList("userSettings");


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getPredefined() {
        return this.predefined;
    }

    public void setPredefined(Integer predefined) {
        this.predefined = predefined;
    }

    public String getUDescription() {
        return this.uDescription;
    }

    public void setUDescription(String uDescription) {
        this.uDescription = uDescription;
    }

    public Integer getIsZamer() {
        return this.isZamer;
    }

    public void setIsZamer(Integer isZamer) {
        this.isZamer = isZamer;
    }

    public Integer getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Date getDateBefore() {
        return this.dateBefore;
    }

    public void setDateBefore(Date dateBefore) {
        this.dateBefore = dateBefore;
    }

    public Integer getDateBefireAccept() {
        return this.dateBefireAccept;
    }

    public void setDateBefireAccept(Integer dateBefireAccept) {
        this.dateBefireAccept = dateBefireAccept;
    }


    public void setKassaSettings(List<KassaSettings> kassaSettings) {
        this.kassaSettings.clear();
        this.kassaSettings.addAll(kassaSettings);
        getProviderChangeSupport().fireProviderRefresh("kassaSettings");
    }

    /**
     * This method is called when entity instance is recreated from persisted JSON string in DataSynchAction
     */
    public void setKassaSettings(KassaSettings[] kassaSettings) {
        setKassaSettings(Arrays.asList(kassaSettings));
    }

    public List<KassaSettings> getKassaSettings() {
        return this.kassaSettings;
    }


    public void addKassaSettings(int index, KassaSettings kassaSettings) {
        kassaSettings.setIsNewEntity(true);
        EntityUtils.generatePrimaryKeyValue(kassaSettings, 1);
        kassaSettings.setUserId(getId());
    }

    public void removeKassaSettings(KassaSettings kassaSettings) {
        DBPersistenceManager pm = new DBPersistenceManager();
        pm.removeEntity(kassaSettings, true);
    }


    public void setUserSettings(List<UserSettings> userSettings) {
        this.userSettings.clear();
        this.userSettings.addAll(userSettings);
        getProviderChangeSupport().fireProviderRefresh("userSettings");
    }

    /**
     * This method is called when entity instance is recreated from persisted JSON string in DataSynchAction
     */
    public void setUserSettings(UserSettings[] userSettings) {
        setUserSettings(Arrays.asList(userSettings));
    }

    public List<UserSettings> getUserSettings() {
        return this.userSettings;
    }


    public void addUserSettingsView(int index, UserSettings userSettingsView) {
        userSettingsView.setIsNewEntity(true);
        EntityUtils.generatePrimaryKeyValue(userSettingsView, 1);
        userSettingsView.setUserId(getId());
    }

    public void removeUserSettingsView(UserSettings userSettingsView) {
        DBPersistenceManager pm = new DBPersistenceManager();
        pm.removeEntity(userSettingsView, true);
    }


}
