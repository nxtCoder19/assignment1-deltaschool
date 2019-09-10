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
     class Maruti extends Car 
                {
                public Maruti(final int carId, final String carModel, final double carPrice){
                this.carId=carId;
                this.carModel=carModel;
                this.carPrice=carPrice;
                }
                @Override
                double getResalePrice() 
                {
                return carPrice*0.80;
                }
            }

