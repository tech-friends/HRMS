package in.tech.friends.hrms.security.auth.jwt.verifier;

/**
 * 
 * @author Sanjeet
 *
 * Aug 17, 2016
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
