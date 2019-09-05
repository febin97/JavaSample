import java.util.Scanner;

public class TomJerry{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>=20 && num<=30){
            if(num%2!=0){
                System.out.println("Tom");
            }
            else{
                System.out.println("Jerry");
            }
        }
        else{
            System.out.println("Number is not between 20 and 30");
        }
        input.close();
    }
}