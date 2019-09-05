import java.util.Scanner;

public class UpperLower{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch)){
                System.out.println("Capital Letter");
            }
            else{
                System.out.println("Small Letter");
            }
        }else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
        input.close();
    }
}