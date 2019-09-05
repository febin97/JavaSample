import java.util.Scanner;

public class Substring{
    public static void main(String[] args){
        
        System.out.println("Enter The String: ");
        Scanner input = new Scanner(System.in);
        String S =  input.nextLine();
        char[] s = S.toCharArray();
        System.out.println("Enter number");
        int num = input.nextInt();
        System.out.print(S);
        for(int j=0;j<num;j++){
            for(int i=s.length-num;i<s.length;i++){
                System.out.print(s[i]);
            }
        }
        input.close();
    }
}