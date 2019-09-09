package com.stackroute;

public class EvenNum {

    public boolean isEven(int number){
        if(number<0)
            return false;
        return number%2==0;
    }
}
