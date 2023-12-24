import java.util.Scanner;
public class literals {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int phy=sc.nextInt();

        int chem=sc.nextInt();

        int math=sc.nextInt();

        int eng=sc.nextInt();

        int comp=sc.nextInt();
        System.out.println("enter the total value");
        int total= sc.nextInt();


        float per=(((phy+chem+math+eng+comp)*100/total));
                System.out.println("your percentage is" +per);
                System.out.println(6==8);
    }

}
