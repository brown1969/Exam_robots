package currency;

import java.text.DecimalFormat;

abstract public class Currency {
    private double kursNBU;
    private double marga = 1.1; // 10 % profit

    DecimalFormat df = new DecimalFormat("0.00");

    public Currency(double externalKursNBU){ // Конструктор
        kursNBU = externalKursNBU;
        setMarga(marga);
    }

    public double getKursNBU() { // Getter віддає значення
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) { // Setter змінює значення
        this.kursNBU = kursNBU;  // this - вказує на змінну цього классу
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
        if ( !(this instanceof IsFreeConverted)){  // ! інверсія значень чи є реалізація isFreeConverted
            this.marga = marga * 1.2;
            System.out.println(getCurrencyName() + " is not real currency!!");
            System.out.println("So marga is changed. Current marga = " + df.format(this.marga));

        } else {
            if ( (((IsFreeConverted) this).isFreeConv() ==false )){
                this.marga = marga * 1.1;
                System.out.println(getCurrencyName() + " is not Free converted currency");
                System.out.println("So marga is changed. Current marga = " + df.format(this.marga));
            }
        }


    }

    public double getKursBuy(){
        return kursNBU * marga;
    }

    public double getKursSell(){
        return kursNBU / marga;
    }

    abstract String getCurrencyName(); // Абстрактний метод

    public double exchangeGrnToCurrency(double numberOfGrn){
        Double  tempResult = numberOfGrn / getKursBuy();
        System.out.println(String.format("For %s GRN you get %s %s by kurs %s (marga %s) ", numberOfGrn, df.format(tempResult), getCurrencyName(), df.format(getKursBuy()), df.format(marga)));

        return tempResult;
    }

    public double exchangeCurrencyToGrn(double numberOfCurrency) {
        Double tempResult2 = numberOfCurrency * getKursSell();
        System.out.println(String.format("For %s %s you get %s GRN by kurs %s (marga %s) ", numberOfCurrency, getCurrencyName(), df.format(tempResult2), df.format(getKursSell()), df.format(marga)));

        return tempResult2;


    }

    public void exchangeBTCToGrn(double numberOfCurrency) {
        System.out.println("Exchange of cryptocurrency is prohibited by NBU");
    }

    public double exchangeGrnToBTC(double numberOfGrn) {
        double tempResult3 = numberOfGrn;
        System.out.println("Exchange of cryptocurrency is prohibited by NBU");
        return numberOfGrn;
    }



}
