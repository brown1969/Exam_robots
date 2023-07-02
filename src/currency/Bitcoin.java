package currency;

public class Bitcoin extends Currency implements IsCryptoCurrency{

    public Bitcoin(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "BTC";
    }

    @Override
    public boolean isCryptoCurrency() {
        return true;
    }
}
