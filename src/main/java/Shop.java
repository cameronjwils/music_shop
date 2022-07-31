import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Instrument> instruments;
    private Equipment.drumSticks drumSticks;
    private Equipment.fluteMouthpiece fluteMouthpiece;
    private Equipment.guitarStrings guitarStrings;
    private Equipment.musicSheets musicSheets;

    public Shop(ArrayList<Instrument> instruments, Equipment.drumSticks drumSticks, Equipment.fluteMouthpiece fluteMouthpiece, Equipment.guitarStrings guitarStrings, Equipment.musicSheets musicSheets) {
        this.instruments = instruments;
        this.drumSticks = drumSticks;
        this.fluteMouthpiece = fluteMouthpiece;
        this.guitarStrings = guitarStrings;
        this.musicSheets = musicSheets;
    }
}
