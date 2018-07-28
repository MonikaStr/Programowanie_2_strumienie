package betterString;

public class StringUtils {

    public static String betterString(String str1, String str2, TwoStringPredicate twoStringPredicate) {
        if (twoStringPredicate.compare(str1, str2)) {
            return str1;
        }
        else {
            return str2;
        }
    }

}
