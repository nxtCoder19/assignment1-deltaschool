/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author piyush
 */
public  abstract class Car 
                {
                public int carId;
                public String carModel;
                double carPrice;
                public int getCarId() 
                {
                return carId;
                }
                public double getCarPrice()
                {
                return carPrice;}
                public String getCarModel() 
                {
                return carModel;
                }
                abstract double getResalePrice();
                }
