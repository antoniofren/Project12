/**
 * Interface that provides the capability of returning a generic key
 * 
 * @author Antonio
 */
public interface KeyInterface <K> {
    
    /**
     * Return a generic class member to be utilized by a 
     * calling program as a Key
     */
    public K getKey();
}