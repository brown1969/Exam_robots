package currency;

public class Dollar extends Currency implements IsFreeConverted {
    public Dollar(double externalKursNBU) {
        super(externalKursNBU); // super - звернення до батьківського класу
    }

    @Override    // тег що ми переписали метод з основного класу в чайлд методі
    String getCurrencyName() {
        return "USD";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
