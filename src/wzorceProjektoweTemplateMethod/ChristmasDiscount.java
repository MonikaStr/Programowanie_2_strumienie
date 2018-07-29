package wzorceProjektoweTemplateMethod;

public class ChristmasDiscount implements DiscountInterface {

    @Override
    public int getDiscount() {
        System.out.println("Zniżka Bożonardzeniowaa: 10%");
        return 10;
    }
}
