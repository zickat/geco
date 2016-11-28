package geco;

import java.security.SecureRandom;

/**
 * Created by valen on 28/11/2016.
 */
public class PasswordGenerator {

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    static final int len = 8;

    public String getRandomPassword(){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

}
