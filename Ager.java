public class Ager{

   public static void main(String[] args){
    int my_age = 40;
    int year = 2017;
    System.out.println("I am "+my_age+" years old now.."+(++my_age)+" in September..");
    for(int i=0;i<=5;i++){
    System.out.println("In "+(++year)+",I pray to be "+(++my_age)+"..");
    if(i==5){
         System.out.println("..AND,in "+(++year)+",I look forward to my "+(++my_age)+"th birthday!!");
          }

      }
             System.out.println("**************************");
           String[] futures = {"Mobile","Web","Security","Applications Dev.."};
           System.out.println("By then,I should be a guru in:\n");
           System.out.println("**************************");
           for(int x=0;x<futures.length;x++){
            System.out.println(futures[x]+"\nAND..");
                  }


              }//main method
  }
