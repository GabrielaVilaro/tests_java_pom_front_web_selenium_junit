package functions;

import java.util.Random;

public class Functions {

    public String generateEmail() {
        String SALTCHARS = "abcdefghijklmnñopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index) + "@" + "gmail.com");
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
