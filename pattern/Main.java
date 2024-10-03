package pattern;

import pattern.strategy.Auto;
import pattern.strategy.FuelCalculation;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(20, 100);

        FuelCalculation fuelCalculation = new FuelCalculation();
        System.out.println(fuelCalculation.calculate(auto));

    }
}
