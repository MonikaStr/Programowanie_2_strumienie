package wzorceProjektoweTemplateMethod;

public abstract class AbstractMoneyTransfer {

    public void performTransfer(DiscountInterface discountInterface) {
        prepareTransfer();
        addCommisstion();
        addDiscount(discountInterface);
        sendMoney();
    }

    protected abstract String prepareTransfer(); //klasy diedziczące rozpoczynają proces przelewu (może po prostu wypisywać na ekran „Starting transfer from bank - <bank name>…”)

    protected abstract String addCommisstion(); // metoda abstrakcyjna w której klasy dziedziczące będą dodawać swoją prowizję

    protected int addDiscount(DiscountInterface discountInterface) {
        return discountInterface.getDiscount();
    }

    private String sendMoney() {
        String statusInfo = "Transfering money";
        System.out.println(statusInfo);
        return statusInfo;
    }//metoda finalna która przeleje pieniądze (może po prostu wypisywać na ekran „Transfering money…”)


}
