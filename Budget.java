import java.io.Console;

class Vehicle {
   public String mModel;
   public int mYear;
   public int mPrice;
   public double mMiles;

// constructor 
 public Vehicle(String model,int year,int price,double miles){
       mModel = model;
       mYear = year;
       mPrice = price;
       mMiles = miles;
      }

// method
   public boolean worthIt(int maxPrice){
        return(mPrice < maxPrice);
      }
  }

public class Budget {
   public static void main(String[] args) {
    Console con = System.console();

// use constructor

   Vehicle car1 = new Vehicle("Honda Civic",2016,2300000,2000);
   Vehicle suv = new Vehicle("Nissan Xterra",2003,600000,50000);
   Vehicle bus = new Vehicle("Toyota Hiace",2009,1000000,17000);
   Vehicle car2 = new Vehicle("Mitsubishi Galant",1999,230000,540000);
    /*Vehicle car1 = new Vehicle();
     car1.mYear = 2012;
     car1.mModel = "Toyota Carina";
     car1.mMiles = 45000;
     car1.mPrice = 800000;
    Vehicle truck = new Vehicle();
     truck.mYear = 2009;
     truck.mModel = "Ford Terrain";
     truck.mMiles = 120000;
     truck.mPrice = 1200000;
   Vehicle car2 = new Vehicle();
     car2.mYear = 1999;
     car2.mModel = "Honda Civic";
     car2.mMiles = 170000;
     car2.mPrice = 250000;*/

    Vehicle[] allSpec = {car1,suv,bus,car2};

    System.out.println("What is your max budget for a vehicle?");
    String strUserMax = con.readLine();
    int userMax = Integer.parseInt(strUserMax);

   //System.out.println("OK, here's what we have for that range: ");

   for(Vehicle v : allSpec){
       if(v.worthIt(userMax)){
           System.out.println("OK, here's what we have for that range: ");
           System.out.println("------------------");
           System.out.println(v.mModel);
           System.out.println(v.mYear);
           System.out.println(v.mPrice);
              }else{System.out.print("No!");}
                             }//for loop
   }


 }
