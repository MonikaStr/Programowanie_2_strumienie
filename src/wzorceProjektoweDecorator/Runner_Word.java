package wzorceProjektoweDecorator;

public class Runner_Word {
    public static void main(String[] args) {

        Word word = new Prefix(new NormalWord());
        WordDecorator word2 = new Suffix(new NormalWord());
        System.out.println(word.display());
        System.out.println(word2.display());
    }
}
