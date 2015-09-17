package ua.divas.mobile.model.service;


import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.List;

import oracle.ateam.sample.mobile.v2.persistence.db.BindParamInfo;
import oracle.ateam.sample.mobile.v2.persistence.manager.DBPersistenceManager;
import oracle.ateam.sample.mobile.v2.persistence.metadata.AttributeMapping;
import oracle.ateam.sample.mobile.v2.persistence.metadata.ClassMappingDescriptor;
import oracle.ateam.sample.mobile.v2.persistence.metadata.ObjectPersistenceMapping;
import oracle.ateam.sample.mobile.v2.persistence.util.EntityUtils;
import oracle.ateam.sample.mobile.v2.persistence.service.EntityCRUDService;

import ua.divas.mobile.model.Groupmembers;


/**
 *  Service class that provides CRUD and custom operations against the groupmembers data object.
 *  The behavior of this class is driven by the groupmembers classMappingDescriptor in persistence-mapping.xml.
 *
 *  You can customize and extend this behavior by overriding methods of the EntityCRUDService superclass, and/or
 *  creating a subclass of the local and remote persistence managers as configured in persistence-mapping.xml.
 */
public class GroupmembersService extends EntityCRUDService<Groupmembers> {

    /**
     * Default constructor. If autoQuery is set to true in the classMappingDescriptor in persistence-mapping.xml, then
     * the findAll method will be executed and the groupmembers list will be populated when this constructor is invoked.
     * If you created a data control for this service class, the data control will use this constructor, allowing you to
     * immediately show data in your user interface when accessing the data control for the first time.
     * By default, the findAll method will first query the local SQLite database for any rows and show these immediately in
     * the UI. Then the remote findAll method as configured in persistence-mapping.xml will be executed in the background,
     * and the UI will be automatically refreshed when the remote data have been processed and stored in the local SQLite
     * database.
     * If you want the user to wait until the remote data have been processed and not show local data first, you can set
     * the remoteReadInBackground attribute in the classMappingDescriptor to false.
     *
     * If you need programmatic access to the same instance of this class as used by the bean data control typically
     * created for this class, then you can use the following convenience method:
     *
     * GroupmembersService crudService = (GroupmembersService) EntityUtils.getEntityCRUDService(Groupmembers.class);
     *
     * Note that calling this method might fire a remote method call when autoQuery is set to true in the
     * classMappingDescriptor and the data control has not been instantiated yet for the feature context in which you
     * execute the above call. Remember: each feature has its own class loader, bean data controls are NOT shared
     * accross features!
     */
    public GroupmembersService() {
    }

    /**
     * Use this constructor with autoQuery=false in Java code when you want to execute a method in this service class
     * without autoQuery as configured in persistence-mapping.xml taking place.
     */
    public GroupmembersService(boolean autoQuery) {
        super(autoQuery);
    }

    protected Class getEntityClass() {
        return Groupmembers.class;
    }

    protected String getEntityListName() {
        return "groupmembers";
    }

    public List<Groupmembers> getGroupmembers() {
        return getEntityList();
    }

    /**
     * This method is automatically called when using the Create operation on the groupmembers collection
     * in the data control palette. It gets a new groupmembers instance as argument and adds this instance to the
     * groupmembers list.
     * Do NOT drag and drop this method from the data control palette, use the Create operation instead to ensure
     * that iterator binding and groupmembers list stay in sync.
     * @param index
     * @param groupmembers
     */
    public void addGroupmembers(int index, Groupmembers groupmembers) {
        addEntity(index, groupmembers);
    }

    /**
     * This method is automatically called when using the Delete operation on the groupmembers collection
     * in the data control palette. It removes the groupmembers instance passed in from the groupmembers list, deletes the
     * corresponding row from the database (if persisted) and calls the configured remove method on the remote
     * persistence manager.
     * Do NOT drag and drop this method from the data control palette, use the Delete operation instead to ensure
     * that iterator binding and groupmembers list stay in sync.
     * @param groupmembers
     */
    public void removeGroupmembers(Groupmembers groupmembers) {
        removeEntity(groupmembers);
    }

    /**
     * Inserts or updates a groupmembers using the configured persistence managers.
     * The insert or update is determined by calling isNewEntity on the groupmembers instance.
     * @param groupmembers
     */
    public void saveGroupmembers(Groupmembers groupmembers) {
        super.mergeEntity(groupmembers);
    }
    
    public Groupmembers findRoleByLogin(String login) {
            if (getLocalPersistenceManager() != null) {
                ObjectPersistenceMapping persMapping = ObjectPersistenceMapping.getInstance();
                DBPersistenceManager pm = getLocalPersistenceManager();
                List<BindParamInfo> parentBindParamInfos = new ArrayList<BindParamInfo>();
                ClassMappingDescriptor descriptor = persMapping.findClassMappingDescriptor(getEntityClass().getName());
                AttributeMapping parentMapping = descriptor.findAttributeMappingByColumnName("G_MEMBER");
                BindParamInfo pKeyValue = pm.constructBindParamInfo(getEntityClass(), parentMapping);
                pKeyValue.setValue(login);
                parentBindParamInfos.add(pKeyValue);
                /* for (AttributeMapping keyMapping : parentMappings) {
                        BindParamInfo pKeyValue = pm.constructBindParamInfo(getEntityClass(), keyMapping);
                        pKeyValue.setValue(parent_id);
                        parentBindParamInfos.add(pKeyValue);
                    } */
                StringBuffer sql = pm.getSqlSelectFromPart(descriptor);
                pm.constructWhereClause(sql, parentBindParamInfos);
                ResultSet set = pm.executeSqlSelect(sql.toString(), parentBindParamInfos);
                List<Groupmembers> entities = pm.createEntitiesFromResultSet(set, descriptor.getAttributeMappings());
                //setEntityList(entities);
                return entities.get(0);
            }
            return null;
        }

    /**
     * Retrieves all groupmembers instances using the configured persistence managers and populates the groupmembers list
     * with the result.
     * When this method is called for the first time, and a remote persistence manager is configured,
     * the data is fetched remotely and the local DB is populated with the results.
     */
    public void findAllGroupmembers() {
        super.findAll();
    }

    /**
     * Retrieves all groupmembers instances using the findAll method on the remote persistence manager
     * and populates the groupmembers list
     */
    public void findAllGroupmembersRemote() {
        super.doRemoteFindAll();
    }

    /**
     * Retrieves the groupmembers instances that match the searchValue filter using the configured persistence
     * managers and populates the groupmembers list with the result.
     * By default, the search value is applied to all string attributes using a "startsWith" operator.
     * To customize the attributes on which the searchValue is applied, you can override method getQuickSearchAttributeNames.
     * If a find method is configured against the remote persistence manager, then this method will also
     * call this method.
     * @param searchValue
     */
    public void findGroupmembers(String searchValue) {
        super.find(searchValue);
    }


    /**
     * Synchronizes all pending data sync actions using the remote persistence manager
     * @param inBackground
     */
    public void synchronizeGroupmembers(Boolean inBackground) {
        super.synchronize(inBackground);
    }

    /**
     * Resets the values of the groupmembers instance to the values as stored in the SQLite database. This method
     * will do nothing when the groupmembers is not persisted to the database.
     * @param groupmembers
     */
    public void resetGroupmembers(Groupmembers groupmembers) {
        super.resetEntity(groupmembers);
    }

    /**
     * Returns true when there are pending groupmembers data sync actions. Returns false if there are no such actions.
     */
    public boolean getHasGroupmembersDataSynchActions() {
        return getDataSynchManager().getHasDataSynchActions();
    }


}


