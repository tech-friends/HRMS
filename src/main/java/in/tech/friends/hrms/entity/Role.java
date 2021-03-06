package in.tech.friends.hrms.entity;

/**
 * Enumerated {@link User} roles.
 * 
 * @author Sanjeet
 *
 * Aug 16, 2016
 */
public enum Role {
    ADMIN, PREMIUM_MEMBER, MEMBER;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
