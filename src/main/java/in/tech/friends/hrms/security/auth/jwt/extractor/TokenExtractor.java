package in.tech.friends.hrms.security.auth.jwt.extractor;

/**
 * Implementations of this interface should always return raw base-64 encoded
 * representation of JWT Token.
 * 
 * @author Sanjeet
 *
 * Aug 5, 2016
 */
public interface TokenExtractor {
    public String extract(String payload);
}
