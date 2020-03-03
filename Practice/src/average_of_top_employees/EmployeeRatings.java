package average_of_top_employees;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeRatings {

    static final int TOP_EMPLOYEE_RATINGS=90;
    static final int MAXIMUM_RATE=100;
    static final int MINIMUM_RATE=0;
    static DecimalFormat decimalFormat =new DecimalFormat("#.00");

    public static String averageOfTopEmployees(int [] employee_ratings){
        int sumOfRatings =MINIMUM_RATE;
        int count=0;
        for(int i=0;i<employee_ratings.length;i++){
            if(employee_ratings[i]>=TOP_EMPLOYEE_RATINGS&& employee_ratings[i]<=MINIMUM_RATE){
               sumOfRatings +=employee_ratings[i];
               count +=1;
            }
        }

        return decimalFormat.format((sumOfRatings/(double)count));
    }
    public static int[] ratingsData(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] ratings=new int[n];
        for(int i=0;i<n;i++){
            ratings[i]=in.nextInt();
        }
        return ratings;
    }
    public static void main(String[] args) {
         int[] ratings = ratingsData();
         String s=averageOfTopEmployees(ratings);
        System.out.println(s);
    }
}
