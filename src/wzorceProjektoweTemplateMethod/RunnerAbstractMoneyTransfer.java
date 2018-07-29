package wzorceProjektoweTemplateMethod;

public class RunnerAbstractMoneyTransfer {

    public static void main(String[] args) {

        BzwbkMoneyTransfer bz = new BzwbkMoneyTransfer();
        PkoMoneyTransfer pko = new PkoMoneyTransfer();

        bz.performTransfer();
        pko.performTransfer();

    }
}
