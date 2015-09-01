/**
 * Created by Piyush Bhatia on 24-08-2015.
 */
/**
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args){
        float side1,side2,side3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of side 1");
        side1=sc.nextFloat();
        System.out.println("Enter Length of side 2");
        side2=sc.nextFloat();
        System.out.println("Enter Length of side 3");
        side3=sc.nextFloat();
        if(side1+side2<side3)
            System.out.println("Wrong Inputs");
        else if(side2+side3<side1)
            System.out.println("Wrong Inputs");
        else if(side3+side1<side2)
            System.out.println("Wrong Inputs");
        else
            System.out.println("Correct Inputs");
    }

}
*/
/**
public class Assignment_1{
    public static void main(String[] args){
        for(int i=0;i<127;i++)
            System.out.print((char)i+" - "+i+"\n");
    }
}
*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter your number");
        num=sc.nextInt();
        while(num!=0){
          sum=sum+(num%10);
            num=num/10;
        }
        System.out.println(sum);
    }
}
*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args){
        int num1,num2,hcf,lcm,prod;
        hcf=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        num1=sc.nextInt();
        System.out.println("Enter number 2");
        num2=sc.nextInt();
        prod=num1*num2;
        for(int i=2;i<prod;++i){
            if(num1%i==0&& num2%i==0)
                hcf=i;
        }
        lcm=prod/hcf;
        System.out.println("HCF is "+hcf+" LCM is "+lcm);
    }
}
*/
/**
import java.util.Scanner;
import java.lang.Math;
public class Assignment_1{
    public static void main(String[] args){
        double x1,y1,x2,y2,r1,r2,dist;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x coordinate of circle 1");
        x1=sc.nextDouble();
        System.out.println("Enter the y coordinate of circle 1");
        y1=sc.nextDouble();
        System.out.println("Enter the x coordinate of circle 2");
        x2=sc.nextDouble();
        System.out.println("Enter the x coordinate of circle 2");
        y2=sc.nextDouble();
        System.out.println("Enter the radius of circle 1");
        r1=sc.nextDouble();
        System.out.println("Enter the radius of circle 2");
        r2=sc.nextDouble();
        dist=Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println(dist);
        if(dist>r1+r2)
            System.out.println("The Circles do not overlap");
        else if(dist<r1+r2&&dist>Math.abs(r1-r2))
            System.out.println("The circles intersect");
        else if(dist<Math.abs(r1-r2))
            System.out.println("The circles overlap");
    }
}
*/
/**
import java.util.Random;
public class Assignment_1{
    public static void main(String[] args) {
        int head=0,tail=0,r;
        Random rand=new Random();
        for(int i=0;i<1000000;++i){
            r=(int)(Math.random()*2);
            if(r==1)
                head++;
            else tail++;
        }
        System.out.println("No of heads "+head+" No of tails "+tail);
    }
}
*/
/**
public class Assignment_1{
    public static void main(String[] args) {
        for(int i=0;i<5;++i){
            for(int j=0;j<5;++j){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(int i=1;i<7;++i){
           for(int j=1;j<i;++j){
               System.out.print("*");
           }
            System.out.println(" ");
        }
        System.out.println(" ");

        for(int i=1;i<6;++i){
            for(int j=6-i;j>0;--j){
                System.out.print(" * ");
            }
            System.out.println(" ");
            for(int x=0;x<i;++x)
            System.out.print(" ");
        }

    }
}
*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,revnum;
        revnum=0;
        System.out.println("Enter the number you want to reverse");
        num=sc.nextInt();
        while(num!=0){
            revnum=revnum*10+num%10;
            num=num/10;
        }
        System.out.println("The num after reversing is "+ revnum);
    }
}
*/
/**
 import java.util.Scanner;
 public class Assignment_1{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n1,n2,d,gcd=1;
 System.out.println("Enter Number 1");
 n1=sc.nextInt();
 System.out.println("Enter Number 2");
 n2=sc.nextInt();
 if(n1>n2)
 d=n2;
 else
 d=n1;
 while (d!=1) {
 if (n1 % d == 0 && n2 % d == 0) {
     gcd = d;
     break;
 }
 d--;
 }
 System.out.println("gcd is " + gcd);

 }
 }
*/
/**
public class Assignment_1{
    public static void main(String[] args) {
        for(int i=1;i<=10;++i){
            System.out.println(" ");
            for(int j=1;j<=10;++j){
                System.out.println(i+" X " + j +" = " +i*j );
            }
        }
    }
}

*/
/**
public class Assignment_1{
    public static void main(String[] args) {
        for(int i=1;i<=10;++i){
            System.out.println(" ");
            for(int j=1;j<=10;++j){
                System.out.print(j+" X " + i +" = " +i*j+"\t" );
            }
        }
    }
}
*/
/**

import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,temp,i,f,sum,x;
        sum=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        x=n;
        while(x!=0){
            i=1;
            f=1;
            temp=x%10;
            while(i<=temp){
                f=f*i;
                i++;
            }
            sum=sum+f;
            x=x/10;

        }
        if(n==sum)
            System.out.println("Number is strong");
        else
            System.out.println("Number is not strong");
    }
}

*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args) {
        int n,x,temp,f,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        x=n;
        sum=0;
        while(x!=0){
            f=x%10;
            temp=1;
            for(int i=0;i<3;++i){
                temp=temp*f;
            }
            sum=sum+temp;
            x=x/10;
        }
        if(sum==n)
            System.out.println("The number is a Armstrong Number");
        else
            System.out.println("The number is not Armstrong");

    }
}

*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args) {
        int n,count,flag;
        count=0;
        flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers you want to check");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;++i){
            for(int j=2;j<=arr[i]/2;++j){
                if(arr[i]%j==0) {
                    flag = 0;
                    break;
                }
                else flag=1;
            }
            if(flag==1)
                count++;

        }
        System.out.println("Number of primes are "+count);

    }
}
*/
/**
import java.util.Scanner;
public class Assignment_1 {
    public static void main (String [] args){
        System.out.println("Enter integers(0 to exit)");
        Scanner in = new Scanner(System.in);
        int max = -1;
        int count = 0;
        int number;
        while((number = in.nextInt()) != 0){
            if(number > max){
                max = number;
                count = 1;
            } else if (number == max){
                count++;
            }
        }
        System.out.println("Max number is :"+max);
        System.out.println("Count is :"+count);
    }
}
*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args) {
        int n,x;
        int arr[]=new int[101];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students whose marks you want to enter ");
        n=sc.nextInt();
        for(int i=1;i<=n;++i){
            System.out.println("Enter marks of student "+ i);
            x=sc.nextInt();
            arr[x]++;

        }
        for(int i=0;i<101;++i){
            if(arr[i]!=0)
                System.out.println("Number of students with marks "+i +" are "+arr[i]);
        }
    }
}
*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=1;

        while(num!=0) {
            System.out.println("Enter number to be converted into roman numerals");
            num = sc.nextInt();
            if (num > 0 && num < 4000) {
                String thou[] = {"", "M", "MM", "MMM"};
                String hund[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
                String ten[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
                String unit[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

                int th = num / 1000;
                int h = (num / 100) % 10;
                int t = (num / 10) % 10;
                int u = num % 10;

                System.out.println("Roman Equivalent= " + thou[th] + hund[h] + ten[t] + unit[u]);
            } else
                System.out.println("You entered a number out of Range.Please enter a number in the range [1-3999]");
        }

    }
}
*/
/**
import java.util.Scanner;
public class Assignment_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int arr[]=new int[25];
        System.out.println("Enter decimal you want to convert into binary");
        number=sc.nextInt();
        int index = 0;
        while(number > 0){
            arr[index++] = number%2;
            number = number/2;
        }
        System.out.println("The decimal equivalent is :");
        for(int i = index-1;i >= 0;i--){
            System.out.print( arr[i]);
        }


    }
}
*/
/**
import java.util.Scanner;
class Assignment_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter a decimal number : ");
        int num =sc.nextInt();
        int rem;
        String str2="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num>0)
        {
            rem=num%16;
            str2=hex[rem]+str2;
            num=num/16;
        }
        System.out.println("Decimal to hexadecimal: "+str2);
    }
}
*/
/**
import java.util.Scanner;
class Assignement_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds");
        int sec = sc.nextInt();
        while (sec > 0) {
            System.out.println(sec +" sec remaining");
            long start = System.currentTimeMillis();
            while (start + 1000 > System.currentTimeMillis());
            sec--;
        }
    }
}
*/
/**
class assignment_1 {
public static void main(String[] args) {
        int x = 10;
        for (int i = 1; i <= x; i++) {
        for (int j = x - i; j >= 0; j--) {
        System.out.print(" ");
        }
        int r = ((i * 2) - 1);
        int c = i - 1;
        for (int j = 1; j <= r; j++) {
        if (j <= (r / 2 + 1)) {
        c++;
        } else
        c--;
        if (c > 9) {
        c = 0;
        }
        if (c < 0) {
        c = 9;
        }
        System.out.print(c);
        }
        System.out.println();
        }
        }
        }

*/