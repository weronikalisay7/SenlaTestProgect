package task2__common_multiple_and_divisor;
import java.util.*;

public class CommonMultipleAndDivisor
{
    public static void commonMultipleAndDivisor(){
        Scanner in=new Scanner(System.in);
        System.out.println("Input a: ");
        int a=in.nextInt();
        System.out.println("Input b: ");
        int b=in.nextInt();
        System.out.println("Your numbers are: a= "+a+", b="+b);
        if(a==0||b==0){
            System.out.println("Your input is incorrect!");
        }
        System.out.println("The Greatest Common Divisor of two numbers is: "+greatestCommonDivisor(a,b));
        System.out.println("The Least Common Multiple of two numbers is: "+leastCommonMultiple(a,b));
    }
    public static int greatestCommonDivisor(int a, int b) {
        return b==0?a:greatestCommonDivisor(b,a%b);
    }
    public static int leastCommonMultiple(int a,int b){
        return (a/greatestCommonDivisor(a,b))*b;
    }
}
