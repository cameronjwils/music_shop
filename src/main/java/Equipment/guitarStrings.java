package Equipment;

import behaviours.ISell;

public class guitarStrings implements ISell {
    private double buyPrice;
    private double sellPrice;
    public guitarStrings(double buyPrice, double sellPrice){
        this.buyPrice = 12.00;
        this.sellPrice = 35.00;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}