package wzorceProjektoweDecorator;

public class Suffix extends WordDecorator {

    public Suffix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        String result = word.display() + "yk";
        return result;
    }


}
