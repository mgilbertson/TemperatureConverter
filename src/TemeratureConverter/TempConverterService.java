/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemeratureConverter;

/**
 *
 * @author Mitch
 */
public class TempConverterService {
    
    public double getCelsiusFromFahrenheit(double fahrenheit) throws NumberFormatException{
        return (fahrenheit - 32) * 5/9;
    }
    public String getCelsiusFromFahrenheit(String fahrenheit) throws NumberFormatException{
        double f = Double.valueOf(fahrenheit);
        double c = (f - 32) * 5/9;
        return String.valueOf(c);
    }
    
    public double getFahrenheitFromCelsius(double celsius) throws NumberFormatException{
        return ((celsius * 1.8) + 32);
    }
    public String getFahrenheitFromCelsius(String celsius) throws NumberFormatException{
        double c = Double.valueOf(celsius);
        double f = (c * 1.8) + 32;
        return String.valueOf(f);
    }
}
