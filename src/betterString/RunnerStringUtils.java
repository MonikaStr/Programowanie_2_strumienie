package betterString;

public class RunnerStringUtils {

    public static void main(String[] args) {

        String string1 = "krowa";
        String string2 = "bóbrrrrrr";
        String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);

        System.out.println(longer);
        System.out.println(first);
    }
}
