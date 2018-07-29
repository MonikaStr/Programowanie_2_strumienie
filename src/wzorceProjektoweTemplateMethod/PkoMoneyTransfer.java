package wzorceProjektoweTemplateMethod;

public class PkoMoneyTransfer extends AbstractMoneyTransfer {

    @Override
    public String prepareTransfer() {
        String info = "Starting transfer from bank PKO";
        System.out.println(info);
        return info;
    }

    @Override
    public String addCommisstion() {
        String result = "Addit 8% of commission";
        System.out.println(result);
        return result;
    }
}
