package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double avarageTemperature(){
        Map<String, Double> temperatures1 = temperatures.getTemperatures();
        double result = 0.0;
        for (Double temp: temperatures1.values()) {
            result += temp;
        }
        result = result/temperatures1.size();
        return result;
    }

    public double medianTemperature(){
        double result;
        ArrayList<Double> temperatureList = new ArrayList<>();
        for(Double t: temperatures.getTemperatures().values()){
            temperatureList.add(t);
        }
        Collections.sort(temperatureList);
        if(temperatureList.size()%2 == 1){
            result = temperatureList.get(temperatureList.size()/2 -1);
        }else result = (temperatureList.get(temperatureList.size() / 2 -1)
                + temperatureList.get(temperatureList.size() / 2)) / 2;
        return result;
    }
}
