package functions;
import java.util.Random;

public class Functions {

    public String generateEmail() {
        String PREFIX = "test_user_";
        String SALTCHARS = "abcdefghijklmnñopqrstuvwxyz1234567890";
        String DOMAIN = "@gmail.com";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(PREFIX + SALTCHARS.charAt(index) + DOMAIN);
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
