import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args){
        System.out.println("Come On Lets Guess (range 1-50)");
        Scanner inp = new Scanner(System.in);
        int target = 34;
        while(true){
            int userInp = inp.nextInt();
            if(userInp == target){
                System.out.println("Bingoooo!!!!!,, You guessed it Right");
                break;
            }else if(userInp>target){
                System.out.println("Your number is higher");
            }else{
                System.out.println("Your number is Lower");
            }
        }
    }
}