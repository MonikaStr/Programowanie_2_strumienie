package wzorceProjektoweTemplateMethod;

public class RunnerAbstractMoneyTransfer {

    public static void main(String[] args) {

        BzwbkMoneyTransfer bz = new BzwbkMoneyTransfer();
        PkoMoneyTransfer pko = new PkoMoneyTransfer();

        bz.performTransfer(new ChristmasDiscount());
        pko.performTransfer(new ChristmasDiscount());

    }
}
