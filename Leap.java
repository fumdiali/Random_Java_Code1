import java.io.Console;
public class Leap {
    public static void main(String[] args){
         Console con = System.console();
       System.out.println("Enter your Year of Birth..");
       System.out.println("...and i will show you all the Leap years since..");
       System.out.println("What year were you born(e.g. 1923<enter>)? ");
       String strBirthYr = con.readLine();
       Integer birth = Integer.parseInt(strBirthYr);

       System.out.println("The Leap Years");
       System.out.println("--------------");
         int year=0,numberOfLeaps=0;
     for(year=birth;year<2017;year++){

            if(year%4==0){
                  System.out.println(year);
                  numberOfLeaps++;
                     }
           }

      System.out.println("There have been "+numberOfLeaps+" Leap Years..");
      System.out.println("..in your lifetime,so far..");
      }

    }
