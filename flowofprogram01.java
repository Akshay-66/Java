//import java.util.Objects;
//import java.util.Scanner;

//1. Input a year and find whether it is a leap year or not.
/*
public class flowofprogram01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Year to check: ");
        int year = in.nextInt();
        if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
 */

//2. Take two numbers and print the sum of both.
/*
public class flowofprogram01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number to add: ");
        int a = in.nextInt();
        System.out.print("Enter the 2nd number to add: ");
        int b = in.nextInt();
        int c = a+b;
        System.out.println("Final Added number of "+a+" and "+b+" is "+c);
    }
}
 */

//3. Take a number as input and print the multiplication table for it.
/*
public class flowofprogram01 {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.print("You need the multiples of: ");
        int n = on.nextInt();
        System.out.println("   "+n+" Tables");
        for(int i = 1 ; n >= i ; i++){
            int a = i*n;
            System.out.println("    "+n+" X "+i+" = "+a);
        }
    }
}
 */

//4. Take 2 numbers as inputs and find their HCF and LCM.
/*
public class flowofprogram01 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = j.nextInt();
        System.out.print("Enter Number 2: ");
        int b = j.nextInt();
        j.close();

        int x = a;
        int y = b;

        while(y != 0){
            int z = y;
            y = x % y;
            x = z;
        }
        int hcf = x;
        int lcm = (a*b)/hcf;
        System.out.println("Hcf of "+a+" and "+b+" is "+hcf);
        System.out.println("Lcm of "+a+" and "+b+" is "+lcm);
    }
}
 */

//5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
/*
import java.util.Scanner;
public class flowofprogram01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String str = in.next();
        while (!str.equals("x")){
            str = in.next();
            if(!str.equals("x")){
                sum += Integer.parseInt(str);
            }
        }
        System.out.println(sum);
    }
}
 */

