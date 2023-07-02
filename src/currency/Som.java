package currency;

public class Som extends Currency implements IsFreeConverted{
    public Som(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "SOM";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
