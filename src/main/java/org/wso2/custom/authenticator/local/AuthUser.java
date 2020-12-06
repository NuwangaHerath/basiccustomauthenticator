package org.wso2.custom.authenticator.local;

import org.wso2.carbon.identity.application.authentication.framework.model.AuthenticatedUser;

public class AuthUser {

    private String authenticatedSubjectIdentifier = "test1";
    private String federatedIdPName = "test_fIdP";
    private boolean isFederatedUser = false;
    private String tenantDomain;
    private String userStoreDomain;
    private String userName;

    public AuthUser(AuthenticatedUser user) {
        if(user.getAuthenticatedSubjectIdentifier()==null){
            authenticatedSubjectIdentifier = "test_AuthSubId";
        }
        if(user.getFederatedIdPName()==null){
            federatedIdPName = "test_fIdP";
        }

        this.tenantDomain = user.getTenantDomain();
        this.userStoreDomain = user.getUserStoreDomain();
        this.userName = user.getUserName();
    }

    public String getAuthenticatedSubjectIdentifier() {

        return authenticatedSubjectIdentifier;
    }

    public String getFederatedIdPName() {

        return federatedIdPName;
    }

    public boolean isFederatedUser() {

        return isFederatedUser;
    }

    public String getTenantDomain() {

        return tenantDomain;
    }

    public String getUserStoreDomain() {

        return userStoreDomain;
    }

    public String getUserName() {

        return userName;
    }
}
