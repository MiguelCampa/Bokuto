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

    /**
     * @return the day
     */
    public Date getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Date day) {
        this.day = day;
    }

    /**
     * @return the maxTemperature
     */
    public int getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * @param maxTemperature the maxTemperature to set
     */
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * @return the minTemperature
     */
    public int getMinTemperature() {
        return minTemperature;
    }

    /**
     * @param minTemperature the minTemperature to set
     */
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
    
  private Date day;  
  @SerializedName("max_temperature")
   private int maxTemperature;
  @SerializedName("min_temperature")
  private int minTemperature;  
  
  
  /**
   * No olvidar documentar todo
   * @param temp
   * @return 
   */
  public static double convertFarenheit(int temp)  {    
      return(temp * 1.8) + 32;
              }
  
  
  
  }