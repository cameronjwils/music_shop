package Instruments;

public class Trumpet extends Instrument{
    private int noOfValves;
    public Trumpet(String material, String colour, String type, int noOfValves){
        super(material, colour, type);
        this.noOfValves = noOfValves;
    }
    public String play() {
        return "Trumpet Sound";
    }
}
