import java.util.*;

public class RollDouble {

    public static void main(String[] roller)
           throws InterruptedException {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      int tries = 0,die1,die2;
       System.out.println("Rolling dice until we get a double..");
       Thread.sleep(3000);
     do {
           die1 = rand.nextInt(6) + 1;
           die2 = rand.nextInt(6) + 1;
           System.out.println(die1+" and "+die2);
            tries++;
              }while(die1 != die2);
          if(tries > 1){
           System.out.println("It took "+tries+" attempts!");
                        }else{
           System.out.println("It took "+tries+" attempt!");
                             }
              }//end of main method

      }//end of Roll Double class
