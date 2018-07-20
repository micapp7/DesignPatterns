package weatherstation;

import weatherstation.view.CurrentConditionsDisplay;
import weatherstation.view.ForecastDisplay;
import weatherstation.view.HeatIndexDisplay;
import weatherstation.view.StatisticsDisplay;
import weatherstation.viewmodel.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay((weatherData));
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        // All observers are notified when the observable's state is change.
        weatherData.setMeasurements(80, 65, 12.f);


    }
}
