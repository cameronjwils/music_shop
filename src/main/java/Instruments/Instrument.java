package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Instrument implements IPlay, ISell {
    private String material;
    private String colour;
    private String type;
    public Instrument(String material, String colour, String type){
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String play() {
        return null;
    }

    public double calculateMarkup() {
        return 0;
    }
}
