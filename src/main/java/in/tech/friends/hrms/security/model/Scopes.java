package in.tech.friends.hrms.security.model;

/**
 * Scopes
 * 
 * @author Sanjeet
 *
 * Aug 18, 2016
 */
public enum Scopes {
    REFRESH_TOKEN;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
