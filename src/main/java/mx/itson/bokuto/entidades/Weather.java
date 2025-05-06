/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.bokuto.entidades;

import java.util.List;
import mx.itson.bokuto.enums.WeatherStatus;

/**
 *
 * @author alumnog
 */
public class Weather {
    
    private String city;
    private int temperature;
    private int humidity;
    private WeatherStatus status;
    private int windSpeed;
    private List<Forecast> forecas;
    //@SerializedName("wind_speed");
    
    
}
