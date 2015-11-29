package ua.artcode.week4.station;

/**
 * Created by serhii on 28.11.15.
 */
public final class NuclearStation {

    private final int criticalTemperature;
    private final int requiredPower;

    public NuclearStation() {
        this(100, 1000);
    }

    public NuclearStation(int criticalTemperature, int requiredPower) {
        this.criticalTemperature = criticalTemperature;
        this.requiredPower = requiredPower;
    }

    public final void start(int currentTemp, int currentPower) {
        if(currentPower < requiredPower){
            System.err.println("Can not run, require more power");
            return;
        }

        if(currentTemp > criticalTemperature){
            System.err.println("Critical temerature error");
            return;
        }

        System.out.println("Station was run!");

    }

}
