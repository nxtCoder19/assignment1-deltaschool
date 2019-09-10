/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author piyush
 */
 public class Customer implements Comparable< Customer>
                {
                public int id;
                public String name;
                public ArrayList<Car> carList;
                public Customer() {Scanner obj1 = new Scanner(System.in);
                Scanner obj2 = new Scanner(System.in);
                System.out.println("Enter ID, Name");
                id = obj1.nextInt();
                name = obj2.next();
                this.carList = new ArrayList<Car>();
                }
                
                public int getId() 
                {
                return id;
                
                }
                public String getName() 
                {
                return name;
                }
                public ArrayList<Car> getCarList() 
                {
                return carList;
                }
                public void setCarList(ArrayList<Car> CarList)
                {
                this.carList = CarList;
                }
                public int compareTo(Customer o)
                {
                
                int compareInt = this.name.compareTo(o.name);
                if (compareInt < 0) 
                {
                return -1;
                }
                if (compareInt > 0)
                {
                return 1;
                }
                return 0;
                }
                }

                