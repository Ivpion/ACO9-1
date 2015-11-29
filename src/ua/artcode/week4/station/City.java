package ua.artcode.week4.station;

/**
 * Created by serhii on 28.11.15.
 */
public class City {


    private NuclearStation nuclearStation;

    public City(NuclearStation nuclearStation) {
        this.nuclearStation = nuclearStation;
    }

    public void startWorkDay(){
        nuclearStation.start(23, 2000);
    }

}
