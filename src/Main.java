
import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
       int y;
       System.out.println("Enter the year");
       y=sc.nextInt();

        if(y%4==0||y%100==0 && y%400==0){
            System.out.println("year is leap");}
        else{
            System.out.println("not a leap year");}
        }
    }
