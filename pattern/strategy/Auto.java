package pattern.strategy;

public class Auto implements FuelConsumptionFormula {
    private float volumeFuelConsumed; // объем израсходованного топлива
    private float km;  //пройденное автомобилем расстояние.


    public Auto(float volumeFuelConsumed, float km) {
        this.volumeFuelConsumed = volumeFuelConsumed;
        this.km = km;
    }

    @Override
    public float formula() {
        return volumeFuelConsumed / km * 100L;
    }
}
