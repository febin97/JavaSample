import java.util.Scanner;

public class SortNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char[] numArr = input.nextLine().toCharArray();
        
        //Selection Sort
        int n = numArr.length;
        int min_index,j;
        for(int i=0;i<n-1;i++){
            min_index = i;
            j=i+1;
            while(j<n){
                if(numArr[j]>numArr[min_index]){
                    min_index=j;
                }               
                j++;
            }
            char temp = numArr[i];
            numArr[i] = numArr[min_index];
            numArr[min_index] = temp;
        }
        int sumEven=0;
        System.out.println("Sorted number in non-increasing order : ");
        for(int i=0;i<n;i++){
            int numVal = numArr[i]-48;
            if(numVal%2==0){
                sumEven += numVal;
            }
            System.out.print(numArr[i]);
        }
        System.out.println();
        System.out.println("Sum of even numbers : "+sumEven);
        if(sumEven>15){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        input.close();
    }
}