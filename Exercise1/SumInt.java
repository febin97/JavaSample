import java.util.Scanner;

public class SumInt{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inpString = input.nextLine();
        Scanner numInput = new Scanner(inpString);      
        //First read the input as string and then extract integers from it using another scanner
        int sum=0,x;
        while(numInput.hasNext()){
            try{
                x = numInput.nextInt();
            }catch(Exception e){
                System.out.println("No You Cannot use Non Integer Values");
                sum=-1;
                break;
            }
            sum+=x;
        }
        if(sum!=-1){
            System.out.println("Sum is "+sum);
        }
        numInput.close();
        input.close();
    }
}