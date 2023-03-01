import java.util.*;

public class Assignment7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Final Grade = (average(Labs) * 0.10) + (average(Assignments) * 0.40) + (average(Midterm) *
        //0.20) + (average(Final) * 0.30)
        //13 individual lab grades (since the lowest is dropped per FYE policy)
        //• 8 assignment grades
        //• 1 midterm grade
        //• 1 final exam grade
        //two methods
        float array1 []=new float [13];
        float array2 []=new float [8];// assignments
        float array3 []=new float [1];//midterm
        float array4 []=new float [1];//final
        float sum=0,count=0, s2=0,c2=0, s3=0,c3=0,s4=0, c4=0;
        float total=0;


        System.out.println("[CSE 1321L Grade Calculator]");
        System.out.println("Labs");
        for (int i=0;i<array1.length;i++){
            System.out.print("Enter Grade #" +(i+1) +": ");
            float lab=sc.nextInt();
            array1[i]=lab;
            sum=sum+lab;
            count++;
        }
        float avg=average(sum,count);
        System.out.println("Weighted Points: " +weighted(avg,0.10f));
        total=total+weighted(avg,0.10f);

        System.out.println("\nAssignments");
        for (int i=0;i<array2.length;i++){
            System.out.print("Enter Grade #" +(i+1) +": ");
            float lab=sc.nextInt();
            array2[i]=lab;
            s2=s2+lab;
            c2++;
        }
        avg=average(s2,c2);
        System.out.println("Weighted Points: " +weighted(avg,0.4f));
        total=total+weighted(avg,0.4f);

        System.out.println("\nMidterm");
        for (int i=0;i<array3.length;i++){
            System.out.print("Enter Grade #" +(i+1) +": ");
            float lab=sc.nextInt();
            array3[i]=lab;
            s3=s3+lab;
            c3++;
        }
        avg=average(s3,c3);
        System.out.println("Weighted Points: " +weighted(avg,0.2f));
        total=total+weighted(avg,0.2f);

        System.out.println("\nExam");
        for (int i=0;i<array4.length;i++){
            System.out.print("Enter Grade #" +(i+1) +": ");
            float lab=sc.nextInt();
            array4[i]=lab;
            s4=s4+lab;
            c4++;
        }
        avg=average(s4,c4);
        System.out.println("Weighted Points: " +weighted(avg,0.3f));
        total=total+weighted(avg,0.3f);

        System.out.println("\nYour final grade for CSE1321L is: "+total);
    }
    public static float average(float a,float b){
        //A method to calculate the average value of a category. The method should take
        //in an array of floats and the integer size of the array, and return a float value for
        //the average of the category.

        float avg=a/b;
        return avg;

    }
    public static float weighted(float c,float d){
//A method to calculate the weighted points of a category. The method should take
//in the returned value from the previous method and a float value for the
//category’s percentage (e.g. 0.4f) and return a float value for the weighted points
//of the category.

        float a=c*d;
       return a;

    }
}
