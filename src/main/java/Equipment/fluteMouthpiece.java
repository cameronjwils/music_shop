package Equipment;

import behaviours.ISell;

public class fluteMouthpiece implements ISell {
    private double buyPrice;
    private double sellPrice;
    public fluteMouthpiece(double buyPrice, double sellPrice){
        this.buyPrice = 20.00;
        this.sellPrice = 50.00;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
