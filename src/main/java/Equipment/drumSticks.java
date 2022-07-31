package Equipment;

import behaviours.ISell;

public class drumSticks implements ISell {
    private double buyPrice;
    private double sellPrice;
    public drumSticks(double buyPrice, double sellPrice){
        this.buyPrice = 5.00;
        this.sellPrice = 18.00;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}