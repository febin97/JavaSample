import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        char[] s = (inp.next().toLowerCase()).toCharArray();  //convert String(lowercase) to Character Array
        for(int i=0;i<s.length;i++){
            if(Character.isLetter(s[i])){
                if((s[i] == 'a')||(s[i] == 'e')||(s[i] == 'i')||(s[i] == 'o')||(s[i] == 'u')){
                    System.out.print("Vowel ");
                }else{
                    System.out.print("Consonant ");
                }
            }else{
                System.out.print("Error ");
            }
            
        }
        inp.close();
    }
}