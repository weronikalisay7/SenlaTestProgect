package task1__number_description;
import java.util.*;
import java.lang.*;

public class NumberDescription {
    public static void numberDescription(){
        Scanner in=new Scanner(System.in);
        System.out.println("Input x: ");
        int x=in.nextInt();
        System.out.println("Your number is "+x);
        if (isPrime(x)){
            System.out.println("Your number is simple and");
        }
        else if (x >= 2){
            System.out.println("Your number is compound and");
        }
        if (isEven(x)){
            System.out.print(" even!");
        }
        else{
            System.out.print(" odd!");
        }
    }
    public static boolean isEven(int number){
        return number %2==0?true:false;
    }
    public static boolean isPrime(int number){
        if(number<3){
            return number==2;
        }
        if(number%2==0) {
            return false;
        }
        for(int i=number/3;i>=3;i-=2){
            if(isEven(i)){
                i--;
            }
            if((number%i)==0)
                return false;
        }
        return false;
    }
}
