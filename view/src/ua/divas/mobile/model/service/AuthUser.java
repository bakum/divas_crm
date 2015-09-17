package ua.divas.mobile.model.service;

import oracle.adfmf.framework.api.AdfmfJavaUtilities;

import oracle.ateam.sample.mobile.v2.persistence.util.EntityUtils;

import ua.divas.mobile.model.Groupmembers;
import ua.divas.mobile.model.UserSettings;
import ua.divas.mobile.model.Users;

public class AuthUser {

    private final String userName;
    private final String userId;
    private final String kontragId;
    private final String zamerId;
    private final String kassaId;
    private final String role;


    public AuthUser() {
        this.userName = (String) AdfmfJavaUtilities.evaluateELExpression("#{securityContext.userName}");
        UsersService uService = (UsersService) EntityUtils.getEntityCRUDService(Users.class);
        Users u = uService.findIdByLogin(this.userName);
        UserSettings us = u.getUserSettings().get(0);
        this.kontragId = us.getKontragId();
        this.zamerId = us.getZamerkontragId();
        this.userId = u.getId();
        this.kassaId = us.getKassaId();
        GroupmembersService gm = (GroupmembersService) EntityUtils.getEntityCRUDService(Groupmembers.class);
        this.role = gm.findRoleByLogin(this.userName).getGName();
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getKontragId() {
        return kontragId;
    }

    public String getZamerId() {
        return zamerId;
    }

    public String getKassaId() {
        return kassaId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        // TODO Implement this method
        return getUserName() + " " + getRole();
    }
}
