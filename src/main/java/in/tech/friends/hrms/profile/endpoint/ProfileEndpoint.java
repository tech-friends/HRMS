package in.tech.friends.hrms.profile.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.tech.friends.hrms.security.auth.JwtAuthenticationToken;
import in.tech.friends.hrms.security.model.UserContext;

/**
 * End-point for retrieving logged-in user details.
 * 
 * @author Sanjeet
 *
 * Aug 4, 2016
 */
@RestController
public class ProfileEndpoint {
    @RequestMapping(value="/api/me", method=RequestMethod.GET)
    public @ResponseBody UserContext get(JwtAuthenticationToken token) {
        return (UserContext) token.getPrincipal();
    }
}
