package wzorceProjektoweTemplateMethod;

public class BzwbkMoneyTransfer extends AbstractMoneyTransfer {

    @Override
    public String prepareTransfer() {
        String info = "Starting transfer from bank BZWBK";
        System.out.println(info);
        return info;
    }

    @Override
    public String addCommisstion() {
        String result = "Additinal 10% of commission";
        System.out.println(result);
        return result;
    }
}
