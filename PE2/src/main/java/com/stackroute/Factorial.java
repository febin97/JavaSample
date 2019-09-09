package com.stackroute;

public class Factorial {
    public int factorial(int x){
        if(x==1 || x==2){
            return x;
        }
        return x*factorial(x-1);
    }
    public long longFactorial(int x){
        if(x==1 || x==2){
            return x;
        }
        return x*longFactorial(x-1);
    }
    public String printFactorial(){
        int i=1;
        String str="";
        while(true){
            int num = factorial(i);
            if(num>0)
                str += "Factorial of "+i+" is "+num+"\n";
            else {
                str += "Factorial of " + i + " is out of range\n";
                break;
            }
            i++;
        }
        return str;
    }
    public String printLongFactorial(){
        int i=1;
        String str="";
        while(true){
            long num = longFactorial(i);
            if(num>0)
                str += "Factorial of "+i+" is "+num+"\n";
            else {
                str += "Factorial of " + i + " is out of range\n";
                break;
            }
            i++;
        }
        return str;
    }
}
