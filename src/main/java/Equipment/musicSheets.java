package Equipment;

import behaviours.ISell;

public class musicSheets implements ISell {
    private double buyPrice;
    private double sellPrice;
    public musicSheets(double buyPrice, double sellPrice){
        this.buyPrice = 2.00;
        this.sellPrice = 5.00;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
