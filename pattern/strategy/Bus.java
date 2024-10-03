package pattern.strategy;

public class Bus implements FuelConsumptionFormula {
    private float volumeFuelConsumed; // объем израсходованного топлива
    private float km;  //пройденное автомобилем расстояние.

    public Bus(float speed, float km) {
        this.volumeFuelConsumed = speed;
        this.km = km;
    }

    @Override
    public float formula() {
        return volumeFuelConsumed / km * 100L;
    }
}
