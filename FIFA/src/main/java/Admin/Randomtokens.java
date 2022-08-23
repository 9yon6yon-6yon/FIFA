package Admin;

import java.util.HashMap;
import java.util.Locale;

public class Randomtokens {
    public int hashValue = 8;
    public long countTocken = 1;
    public HashMap<String, Integer> token = new HashMap<>();

    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lower = upper.toLowerCase(Locale.ROOT);
    public static final String digits = "0123456789!@#$%^&*()_+-={}[]:;'\"|/?.,`~";
    public static final String AlphaNumericString = upper + lower + digits;

    public String getAlphaNumericString() {

        StringBuilder sb = new StringBuilder(hashValue);
        if (countTocken == (long) Math.pow(62, hashValue)) hashValue += 1;
        for (int i = 0; i < hashValue; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        if (!token.containsKey(sb.toString())) {
            token.put(sb.toString(), (int) countTocken);
            countTocken++;
        } else getAlphaNumericString();

        return sb.toString();
    }


}
