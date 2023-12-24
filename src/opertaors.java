import java.util.Scanner;
import java.io.*;
public class opertaors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = "HARRY is  not good man";
        System.out.println(s.equalsIgnoreCase("barry"));
        System.out.println(s.lastIndexOf("R", 2));
        System.out.println("I am escape sequence double quote");
        System.out.println(s.replace(' ', '-'));
        System.out.println(s.indexOf("   "));
        System.out.println(s.indexOf("   "));
        System.out.println("dear harry,\n\tthis java course is nice");
    }
}