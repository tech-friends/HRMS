package in.tech.friends.hrms.security;

import java.util.Optional;

import in.tech.friends.hrms.entity.User;


/**
 * 
 * @author Sanjeet
 *
 * Aug 17, 2016
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}
