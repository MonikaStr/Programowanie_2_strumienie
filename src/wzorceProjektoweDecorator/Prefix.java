package wzorceProjektoweDecorator;

public class Prefix extends WordDecorator {

    public Prefix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        String result = "do" + word.display();
        return result;
    }
}
