package Instruments;

public class Piano extends Instrument{
    private int noOfKeys;
    public Piano(String material, String colour, String type, int noOfKeys){
        super(material, colour, type);
        this.noOfKeys = noOfKeys;
    }
    public String play() {
        return "Piano Sound";
    }
}
