package Instruments;

public class Guitar extends Instrument{
    private int noOfStrings;
    public Guitar(String material, String colour, String type, int noOfStrings){
        super(material, colour, type);
        this.noOfStrings = noOfStrings;
    }
    public String play() {
        return "Guitar Sound";
    }
}
