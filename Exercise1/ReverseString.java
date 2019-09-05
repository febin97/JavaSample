import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char[] s = input.nextLine().toCharArray();
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        String S = new String(s);
        System.out.println(S);
        input.close();
    }
}