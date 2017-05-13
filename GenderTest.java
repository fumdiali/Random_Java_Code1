import java.util.*;

public class GenderTest {

   public static void main(String[] args){
      char sex;String name;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your 1st name: ");
      name = sc.nextLine();
         System.out.println("Hello,"+name.toUpperCase()+".What is your gender(M | F)?");
      sex = sc.next().charAt(0);
       //((sex=='m')||(sex=='M')) ? System.out.println("Male..") : System.out.println("Female..");
      if((sex=='m')||(sex=='M')){
           System.out.println("I see that you're a MALE..");
             }else{
              System.out.println("Oops!You're FEMALE!?");
                }
            }


     }
