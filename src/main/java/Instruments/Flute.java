package Instruments;

public class Flute extends Instrument{
    private int noOfHoles;
    public Flute(String material, String colour, String type, int noOfHoles){
        super(material, colour, type);
        this.noOfHoles = noOfHoles;
    }
    public String play() {
        return "Flute Sound";
    }
}
