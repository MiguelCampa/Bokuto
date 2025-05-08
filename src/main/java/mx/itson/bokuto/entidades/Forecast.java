/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.bokuto.entidades;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 *
 * @author alumnog
 */
public class Forecast {
    
  private Date day;  
  
  @SerializedName("max_temérature")
   private int maxTemperature;
  @SerializedName("min_temperature")
  private int minTemperature;   

  }