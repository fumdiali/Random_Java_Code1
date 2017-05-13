/* calculate the average grades of
   a school class */
public class CalcAvg {

 public static void main(String[] args) {
     
    int subjects = 4; double maths=55.5,eng=91.3,history=76.7,art=69.9;
     double gradeSum = maths+eng+history+art;

     double avg = gradeSum / subjects;
     System.out.println("The average grade for "+subjects+" subjects:"+avg);



     }

}
