import java.util.Scanner;

public class Pallindrome{
    public static Boolean isPallindrome(long x){
        long rev=0;
        long temp = x;
        while(temp>0){
            rev = (rev*10) + temp%10;
            temp /= 10;
        }
        return (rev==x);
    }
    public static long SumOfEven(long x){
        long s=0;
        long temp;
        while(x>0){
            temp = x%10;
            if(temp%2==0){
                s += temp;
            }
            x = x/10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner readInt = new Scanner(System.in);
        System.out.println("Enter the number:");
        long x = readInt.nextLong();
        long sum= SumOfEven(x);
        if(isPallindrome(x)){
            if(sum>25){
                System.out.println(x+" is pallindrome and the sum of even numbers is greater than 25");
            }
            else{
                System.out.println(x+" is pallindrome and the sum of even numbers is less than 25");
            }
        }
        else{
            System.out.print(x+" is not pallindrome");
        }
        readInt.close();
    }
}