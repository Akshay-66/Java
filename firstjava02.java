//1. Write a program to print whether a number is even or odd, also take input from the user.
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int a = n.nextInt();
        if(a%2==0){
            System.out.println(a+" is a Even number");
        }
        else{
            System.out.println(a+" is a odd number");
        }
    }
}
 */

//2. Take name as input and print a greeting message for that particular name.
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = i.nextLine();
        System.out.println("Hello "+name+"\nGood Morning");
        System.out.println("Have a great day");
    }
}
 */

//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);
        System.out.print("Enter principal: ");
        float p = sim.nextFloat();
        System.out.print("Enter Time: ");
        float t = sim.nextFloat();
        System.out.print("Enter Rate: ");
        float r = sim.nextFloat();
      //  int s = (int) (p*(1+r*t));
        float s = p*(1+r*t);
        System.out.println("The Simple interest is "+s);
    }
}
 */

//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        int c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();
        System.out.println("Enter the operator to perform");
        System.out.println("(+, -, *, /)");
        System.out.print("Select any one from the above: ");
        char ch = in.next().trim().charAt(0);
        if(ch=='+' || ch=='-' || ch=='*' || ch =='/'){
            if(ch=='+'){
                c = a+b;
            } else if(ch=='-') {
                c = a-b;
            } else if (ch=='*') {
                c = a*b;
            } else {
                c = a/b;
            }
            System.out.println("The "+ch+" of "+a+" and "+b+" is "+c);
        } else {
            System.out.println("Please Enter valid operator!");
        }
    }
}
 */

//5. Take 2 numbers as input and print the largest number.
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        Scanner lar = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int x = lar.nextInt();
        System.out.print("Enter the Second Number: ");
        int y = lar.nextInt();
        if(x>y){
            System.out.println(x+" is largest");
        } else {
            System.out.println(y+" is largest");
        }
    }
}
 */

//6. Input currency in rupees and output in USD.
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        Scanner ru = new Scanner(System.in);
        System.out.print("Enter the currency value in Rupees(₹): ");
        float rup = ru.nextFloat();
        System.out.println("The value of ₹"+rup+" in US Dollars is $"+rup/83);
    }
}
 */

//7. To calculate Fibonacci Series up to n numbers.
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        int n,i,a=0,b=1,c;
        Scanner f = new Scanner(System.in);
        System.out.print("Enter Range: ");
        n = f.nextInt();
        for(i=1 ; i<=n ; i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }
    }
}
 */

//8. To find out whether the given String is Palindrome or not.
/*
import java.util.*;
public class firstjava02 {
    public static void main(String[] args) {
        String a,b="";
        int i,n;
        Scanner z = new Scanner(System.in);
        System.out.print("Enter String: ");
        a = z.nextLine();
        n = a.length();
        for(i=n-1;i>=0;i--){
            b= b + a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println(a+" is Pallindrome");
        } else {
            System.out.println(a+" is Not a Pallindrome");
        }
    }
}
 */

//9. To find Armstrong Number between two given number.
/*
import java.util.Scanner;
public class firstjava02 {
    public static void main(String[] args) {
        int a,i,e,r,sum,x,y,o,g;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        x = in.nextInt();
        System.out.print("Enter Number 2: ");
        y = in.nextInt();
        if(x>y){
            o=y;
            g=x;
        } else {
            o=x;
            g=y;
        }
        for(i=o ; i<=g ; i++) {
            sum = 0;
            e = i;
            while(e>0){
                r = e % 10;
                a = r*r*r;
                sum = sum + a;
                e = e/10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
 */
















