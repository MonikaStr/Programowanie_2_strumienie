package wzorceProjektoweTemplateMethod;

public abstract class AbstractMoneyTransfer {

    public void performTransfer() {
        prepareTransfer();
        addCommisstion();
        sendMoney();
    }

    public abstract String prepareTransfer();
    //klasy diedziczące rozpoczynają proces przelewu (może po prostu wypisywać na ekran „Starting transfer from bank - <bank name>…”)

    public abstract String addCommisstion();
    // metoda abstrakcyjna w której klasy dziedziczące będą dodawać swoją prowizję

    public final String sendMoney() {
        String statusInfo = "Transfering money";
        System.out.println(statusInfo);
        return statusInfo;
    }
    //metoda finalna która przeleje pieniądze (może po prostu wypisywać na ekran „Transfering money…”)


}
