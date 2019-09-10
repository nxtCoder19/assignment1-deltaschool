/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;


import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author piyush
 */
public class Admin {

public static void main(String[] args) 
{

    int num;
    ArrayList<Customer> list = new ArrayList<Customer>();

    int[] randam;
    Scanner obj = new Scanner(System.in);
    System.out.println("welcome as Admin");
    System.out.println("Enter password");
    int a;
    a=obj.nextInt();
    
    if(a==111)
    {
    do {

        System.out.println("enter number between 1 to 6");
        
        System.out.println("1 :- Add New Customer");
        System.out.println("2 :- Add Car Details For Existing Customer");
        System.out.println("3 :- Show Car Details Sorted By Name");
        System.out.println("4 :- Search By Id");
        System.out.println("5 :- Random Number");
        System.out.println("6 :- Exit From Menu");

        num = obj.nextInt();
        switch (num) 
        {
        case 1:

        list.add(new Customer());
        break;
        case 2:

        int carId;
        int counter=0;
        String carModel;
        double carPrice;
        Scanner obj1=new Scanner(System.in);
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter Id Of Customer:");
        int x=obj1.nextInt();
        
        
        for(int i=0;i<list.size();i++)
        {
            if (list.get(i).getId() == x)
            {
    
            counter++;
            Customer customer=list.get(i);
            ArrayList<Car> listOfCars= customer.getCarList();
            Car car=null;
            System.out.println("Enter CarType( press Maruti: 1, Hyundai: 2,Toyota: 3 )");
            int carType=obj1.nextInt();
            switch (carType)
                
                
                {
                    case 1:
                    System.out.println("Enter car Id,car model and car Price");
                    carId=obj1.nextInt();
                    carModel=obj2.next();
                    carPrice=obj1.nextDouble();
                    car=new Maruti(carId,carModel,carPrice);
                    listOfCars.add(car);
                    customer.setCarList(listOfCars);
                    break;
                    
                    
                    case 2: System.out.println("Enter car Id,car model and car Price");
                    carId=obj1.nextInt();
                    carModel=obj2.next();
                    carPrice=obj1.nextDouble();
                    car=new Hyundai(carId,carModel,carPrice);
                    listOfCars.add(car);
                    customer.setCarList(listOfCars);
                    break;
                    case 3:
                        
                        
                    System.out.println("Enter car Id,car model and car Price");
                    carId=obj1.nextInt();
                    carModel=obj2.next();
                    carPrice=obj1.nextDouble();
                    car=new Toyota(carId,carModel,carPrice);
                    listOfCars.add(car);
                    customer.setCarList(listOfCars);
                    break;
                    
                    default:    
                        
                    System.out.println("Car Type Does not Exist");
                    break;
                }       
            }
        }
                if(counter==0)
                    {
                    System.out.println("Id is Not Exist Need To Add New Customer."); }
                    break;
                    case 3:
                        
                        
                    
                    Collections.sort(list);
                    for (int i = 0; i < list.size(); i++)
                    {
                    System.out.println("Customer Id : " + list.get(i).getId() + " Name : "
                    + list.get(i).getName() );
                    for(Car carDetail : list.get(i).getCarList())
                    {
                    System.out.println("Car Id: "+carDetail.getCarId() +" Car Model :"+carDetail.getCarModel()+" Car Price: "+carDetail.getCarPrice()+
                    " Resales Price :"+carDetail.getResalePrice());
                    }
                    } 
                    break;
                    case 4:
                        
                        
                    
                    SearchById search = new SearchById();
                    int count=0;
                    for (int i = 0; i < list.size(); i++)
                    {
                    int x1 = search.getCusId();
                    if (list.get(i).getId() == x1)
                    { count++;
                    System.out.println("Name of Customer: "
                    + list.get(i).getName());
                    for(Car carDetail : list.get(i).getCarList())
                    {
                    System.out.println("Car Name "+carDetail.getCarModel());
                    }
                    }
                    }
                if(count==0)System.out.println("Customer Id is incorrect");
                break;
                case 5:
                
                int flag=0;
                Random random = new Random();
                RandomNumber r = new RandomNumber();
                randam = new int[6];
                for (int i = 0; i < 6; i++)
                {
                int index = random.nextInt(list.size());
                randam[i] = list.get(index).getId();
                }
                for (int i = 0; i < list.size(); i++)
                {
                if (randam[i] == r.num1) {
                flag++;
                System.out.println("Id : " + randam[i] + " price Winner");
                break;
                }
                else if (randam[i] == r.num2) {
                flag++;
                System.out.println("Id : " + randam[i] + " price Winner");
                break;
                }
                else if (randam[i] == r.num3) {
                flag++;
                System.out.println("Id : " + randam[i] + " price Winner");
                break;  
                }
                }
                if(flag==0)System.out.println("There are no price winner :)");
                break;
                
        
               case 6:
               
                  exit(0);
                  break;
                  
               default:
                   System.out.println("enter valid number");
                
              }
                } while (num != 0);
    } 
     else
    {
        System.out.println("Password is incorrect");
    }
    
    
    }
                }

           




                class SearchById {
                public int cusId;
                public SearchById() {
                System.out.println("Enter Id Of Customer");
                Scanner obj = new Scanner(System.in);
                cusId = obj.nextInt();
                }
                public int getCusId() {
                return cusId;
                }
                }
                
            class RandomNumber
                {
                public int num1;
                public int num2;
                public int num3;
                public RandomNumber() {
                System.out.println("Enter 3 random No as id:");
                Scanner obj = new Scanner(System.in);
                num1 = obj.nextInt();
                num2 = obj.nextInt();
                num3 = obj.nextInt();
                }
                public int getNum1()
                {
                return num1;
                }
                public int getNum2()
                {
                return num2;
                }
                public int getNum3() 
                {
                return num3;
                }
                }

                