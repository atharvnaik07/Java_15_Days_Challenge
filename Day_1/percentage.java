
import java.util.*;
class UserInputDemo
{
    public static void main(String[] args)
    {
        // write a program to calculate percentage of a given student in cbsc bord exam his marks from 5 subjects must be taken as input from keyword.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter marks of 1s sub :- ");
        int a= sc.nextInt();
        System.out.print("Enter marks of 2nd sub :- ");
        int b= sc.nextInt();
        System.out.print("Enter marks of 3rd sub :- ");
        int c= sc.nextInt();
        System.out.print("Enter marks of 4th sub :- ");
        int d= sc.nextInt();
        System.out.print("Enter marks of 5th sub :- ");
        int e= sc.nextInt();
        if(a<100 && b<100 && c<100 && d<100 && e<100 )
        {
            int total =a+b+c+d+e;   // marks
            System.out.println("Total sum is = " +total);
            int perc = (total*100)/500 ;   //percentage 
            System.out.println(perc);
        }
        else {
            System.out.println("invalid input");
        }

    }
}