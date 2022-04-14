MCQ

1. (d)Compile time error
because class or record are expected to be given

2. (c)Compile time error
because class MainClass is public, should be declared in a file named MainClass.java

3. (c)Compile time error
because error: '{' expected
public class Baz extends Foo, Bar


4.Salary Program

class Employee
{
  
     public static void main(String[] args)
     {
        // average salary=e1+e2+e3/3=10000;

       int e1=11000;
       int e2=5000;
       int e3;
       int m= e1-e2
       
       int e3=30000-m

       System.out.println(e3);

     }

}


5.Weekday program 


import java.util.Scanner;
public class Weekday{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weekday number : ");
        int weekday = scanner.nextInt();

        if(weekday == 1) 
        {
         System.out.println("Monday");
        } 
        else if(weekday == 2) 
        {
         System.out.println("Tuesday");
        } 
        else if(weekday == 3) 
        {
         System.out.println("Wednesday");
        } 
        else if(weekday == 4) 
        {
         System.out.println("Thursday");
        } 
        else if(weekday == 5) 
        {
        System.out.println("Friday");
        } 
        else if(weekday == 6) 
        {
        System.out.println("Saturday");
        } 
        else if(weekday == 7) 
        {
        System.out.println("Weekend");
        } 
        else 
        {
         System.out.println("Please enter weekday number between 1-7.");
        }
    }
}
