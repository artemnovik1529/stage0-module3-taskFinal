package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float celsius = ((temperatureCelsius - 32) * 5/9);
        System.out.println(celsius);
    }
}
