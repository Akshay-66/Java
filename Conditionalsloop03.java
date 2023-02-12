
//1. Area of circle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        float a,c;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle: ");
        a = i.nextFloat();
        c = (float)(3.14159*a*a);
        System.out.println("The area of the circle is "+c);
    }
}
*/

//2. Area of Triangle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        int a,b;
        float c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        a = s.nextInt();
        System.out.print("Enter the Height of triangle: ");
        b = s.nextInt();
        c = (float)(0.5*a*b);
        System.out.println("The area of triangle is "+c);
    }
}
 */

//3. Area of Rectangle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args){
        int c,b;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the base of Rectangle: ");
        c = a.nextInt();
        System.out.print("Enter the height of Rectangle: ");
        b = a.nextInt();
        System.out.println("The area of Rectangle is "+c*b);
    }
}
 */

//4. Area of Isosceles Triangle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        float a,b;
        Scanner q = new Scanner(System.in);
        System.out.print("Enter the base of isosceles triangle: ");
        a = q.nextFloat();
        System.out.print("Enter the height of isosceles triangle: ");
        b = q.nextFloat();
        double c = 0.5*a*b;
        System.out.println("The area of the isosceles triangle is "+c);
    }
}
*/

//5. Area of Parallelogram
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        float b,h;
        Scanner w = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        b = w.nextFloat();
        System.out.print("Enter the height of the parallelogram: ");
        h = w.nextFloat();
        System.out.println("The area of the Parallelogram is "+b*h);
    }
}
*/

//6. Area of Rhombus
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        double p,q;
        Scanner e = new Scanner(System.in);
        System.out.print("Enter the length of diagonal 1: ");
        p = e.nextFloat();
        System.out.print("Enter the length of diagonal 2: ");
        q = e.nextFloat();
        System.out.println("The area of Rhombus is "+0.5*p*q);
    }
}
*/

//7. Area of Equilateral Triangle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        double a;
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        a = b.nextFloat();
        System.out.println("The Area of the Equilateral triangle is "+0.433012701892*a*a);
    }
}
*/

//8. Perimeter Of Circle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        double r;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        r = a.nextFloat();
        System.out.println("The Perimeter of Circle is "+2*3.141592653589*r);
    }
}
*/

//9. Perimeter Of Equilateral Triangle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        int a;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter 1 side of Equilateral Triangle: ");
        a = i.nextInt();
        System.out.println("The Perimeter of Equilateral Triangle is "+3*a);
    }
}
*/

//10. Perimeter of Parallelogram
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        int x,y;
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        x = aa.nextInt();
        System.out.print("Enter the side of parallelogram: ");
        y = aa.nextInt();
        System.out.println("The Perimeter of Parallelogram is "+2*(x+y));
       //(or) System.out.println("The Perimeter of Parallelogram is "+x+y+x+y);
    }
}
*/

//11. Perimeter of Rectangle
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        int x,y;
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter the base of Rectangle: ");
        x = aa.nextInt();
        System.out.print("Enter the side of Rectangle: ");
        y = aa.nextInt();
        System.out.println("The Perimeter of Parallelogram is "+(x+y+x+y));
    }
}
*/

//12. Perimeter of Square
/*
import java.util.Scanner;
public class Conditionalsloop03 {
    public static void main(String[] args) {
        int a;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter 1 side of Square: ");
        a = i.nextInt();
        System.out.println("The Perimeter of Square is "+4*a);
    }
}
*/

//13. Perimeter of Rhombus
/*
import java.util.Scanner;
public class  {
    public static void main(String[] args) {
        int a;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter 1 side of Rhombus: ");
        a = i.nextInt();
        System.out.println("The Perimeter of Rhombus is "+4*a);
    }
}
*/

//Skillrack daily test 04.02.2023
/*
import java.util.*;
public class Conditionalsloop03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        String b1 = sc.nextLine();
        String a[] = a1.split(" ");
        String b[] = b1.split(" ");
        int k,i,j,n,q=0,w=0,e=0;
        for(String x:a)
        {
            q++;
        }
        for(String y:b)
        {
            w++;
        }
        if(q<w)
        {
            k = q;
            e = w;
            j=1;
        }
        else
        {
            k = w;
            e = q;
        }
        //System.out.print(k);
        for(i=0; i<k; i++)
        {
            int z = a[i].length();
            int c = b[i].length();
            if(z>c)
            {
                System.out.print(a[i]+" ");
            }
            else if(z==c)
            {
                System.out.print(a[i]+" ");
            }
            else
            {
                System.out.print(b[i]+" ");
            }
        }
        for(i=k; i<e; i++)
        {
            if(q>w) {
                System.out.print(a[i]+" ");
            }
            else{
                System.out.print(b[i]+" ");
            }
        }
    }
}
 */











