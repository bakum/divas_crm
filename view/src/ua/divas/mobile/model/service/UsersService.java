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

import ua.divas.mobile.model.Users;


/**
 *  Service class that provides CRUD and custom operations against the users data object.
 *  The behavior of this class is driven by the users classMappingDescriptor in persistence-mapping.xml.
 *
 *  You can customize and extend this behavior by overriding methods of the EntityCRUDService superclass, and/or
 *  creating a subclass of the local and remote persistence managers as configured in persistence-mapping.xml.
 */
public class UsersService extends EntityCRUDService<Users> {

    /**
     * Default constructor. If autoQuery is set to true in the classMappingDescriptor in persistence-mapping.xml, then
     * the findAll method will be executed and the users list will be populated when this constructor is invoked.
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
     * UsersService crudService = (UsersService) EntityUtils.getEntityCRUDService(Users.class);
     *
     * Note that calling this method might fire a remote method call when autoQuery is set to true in the
     * classMappingDescriptor and the data control has not been instantiated yet for the feature context in which you
     * execute the above call. Remember: each feature has its own class loader, bean data controls are NOT shared
     * accross features!
     */
    public UsersService() {
    }

    /**
     * Use this constructor with autoQuery=false in Java code when you want to execute a method in this service class
     * without autoQuery as configured in persistence-mapping.xml taking place.
     */
    public UsersService(boolean autoQuery) {
        super(autoQuery);
    }

    protected Class getEntityClass() {
        return Users.class;
    }

    protected String getEntityListName() {
        return "users";
    }

    public List<Users> getUsers() {
        return getEntityList();
    }

    /**
     * This method is automatically called when using the Create operation on the users collection
     * in the data control palette. It gets a new users instance as argument and adds this instance to the
     * users list.
     * Do NOT drag and drop this method from the data control palette, use the Create operation instead to ensure
     * that iterator binding and users list stay in sync.
     * @param index
     * @param users
     */
    public void addUsers(int index, Users users) {
        addEntity(index, users);
    }

    /**
     * This method is automatically called when using the Delete operation on the users collection
     * in the data control palette. It removes the users instance passed in from the users list, deletes the
     * corresponding row from the database (if persisted) and calls the configured remove method on the remote
     * persistence manager.
     * Do NOT drag and drop this method from the data control palette, use the Delete operation instead to ensure
     * that iterator binding and users list stay in sync.
     * @param users
     */
    public void removeUsers(Users users) {
        removeEntity(users);
    }

    /**
     * Inserts or updates a users using the configured persistence managers.
     * The insert or update is determined by calling isNewEntity on the users instance.
     * @param users
     */
    public void saveUsers(Users users) {
        super.mergeEntity(users);
    }
    
    public Users findIdByLogin(String login) {
            if (getLocalPersistenceManager() != null) {
                ObjectPersistenceMapping persMapping = ObjectPersistenceMapping.getInstance();
                DBPersistenceManager pm = getLocalPersistenceManager();
                List<BindParamInfo> parentBindParamInfos = new ArrayList<BindParamInfo>();
                ClassMappingDescriptor descriptor = persMapping.findClassMappingDescriptor(getEntityClass().getName());
                AttributeMapping parentMapping = descriptor.findAttributeMappingByColumnName("LOGIN");
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
                List<Users> entities = pm.createEntitiesFromResultSet(set, descriptor.getAttributeMappings());
                //setEntityList(entities);
                return entities.get(0);
            }
            return null;
        }
        
        private void findAllLogin(String login) {
            //if (getLocalPersistenceManager() != null) {
                ObjectPersistenceMapping persMapping = ObjectPersistenceMapping.getInstance();
                DBPersistenceManager pm = getLocalPersistenceManager();
                List<BindParamInfo> parentBindParamInfos = new ArrayList<BindParamInfo>();
                ClassMappingDescriptor descriptor = persMapping.findClassMappingDescriptor(getEntityClass().getName());
                AttributeMapping parentMapping = descriptor.findAttributeMappingByColumnName("LOGIN");
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
                List<Users> entities = pm.createEntitiesFromResultSet(set, descriptor.getAttributeMappings());
                //return entities.get(0).getId();
                setEntityList(entities);
            //}
        }

    /**
     * Retrieves all users instances using the configured persistence managers and populates the users list
     * with the result.
     * When this method is called for the first time, and a remote persistence manager is configured,
     * the data is fetched remotely and the local DB is populated with the results.
     */
    public void findAllUsers() {
        super.findAll();
    }

    /**
     * Retrieves all users instances using the findAll method on the remote persistence manager
     * and populates the users list
     */
    public void findAllUsersRemote() {
        super.doRemoteFindAll();
    }

    /**
     * Retrieves the users instances that match the searchValue filter using the configured persistence
     * managers and populates the users list with the result.
     * By default, the search value is applied to all string attributes using a "startsWith" operator.
     * To customize the attributes on which the searchValue is applied, you can override method getQuickSearchAttributeNames.
     * If a find method is configured against the remote persistence manager, then this method will also
     * call this method.
     * @param searchValue
     */
    public void findUsers(String searchValue) {
        super.find(searchValue);
    }


    /**
     * Synchronizes all pending data sync actions using the remote persistence manager
     * @param inBackground
     */
    public void synchronizeUsers(Boolean inBackground) {
        super.synchronize(inBackground);
    }

    /**
     * Resets the values of the users instance to the values as stored in the SQLite database. This method
     * will do nothing when the users is not persisted to the database.
     * @param users
     */
    public void resetUsers(Users users) {
        super.resetEntity(users);
    }

    /**
     * Returns true when there are pending users data sync actions. Returns false if there are no such actions.
     */
    public boolean getHasUsersDataSynchActions() {
        return getDataSynchManager().getHasDataSynchActions();
    }


}


