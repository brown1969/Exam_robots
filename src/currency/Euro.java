package currency;

public class Euro extends Currency implements IsFreeConverted{

    public Euro(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "EUR";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }

    public static class CurrencyExchange {
        public static void main(String[] args) {

            Dollar dollar = new Dollar(38);
            Euro euro = new Euro(41);
            Som som = new Som(0.001);


        }
    }
}
