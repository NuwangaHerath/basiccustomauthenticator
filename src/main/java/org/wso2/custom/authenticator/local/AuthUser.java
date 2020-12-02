package org.wso2.custom.authenticator.local;

import org.wso2.carbon.identity.application.authentication.framework.model.AuthenticatedUser;

public class AuthUser {

    protected String authenticatedSubjectIdentifier = "";
    protected String federatedIdPName;
    protected boolean isFederatedUser;
    protected String tenantDomain;
    protected String userStoreDomain;
    protected String userName;

    public AuthUser(AuthenticatedUser user) {
        this.authenticatedSubjectIdentifier = user.getAuthenticatedSubjectIdentifier();
        this.federatedIdPName = user.getFederatedIdPName();
        this.isFederatedUser = user.isFederatedUser();
        this.tenantDomain = user.getTenantDomain();
        this.userStoreDomain = user.getUserStoreDomain();
        this.userName = user.getUserName();
    }

    public String getAuthenticatedSubjectIdentifier(){ return authenticatedSubjectIdentifier; }

    public String getFederatedIdPName(){ return federatedIdPName; }

    public boolean isFederatedUser(){ return isFederatedUser; }

    public String getTenantDomain(){ return tenantDomain; }

    public String getUserStoreDomain(){ return userStoreDomain; }

    public String getUserName(){ return authenticatedSubjectIdentifier; }
}
