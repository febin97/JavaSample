package com.stackroute;

public class PowerFour {
    public boolean checkPowerFour(double num){
        if(num==0)
            return false;
        double logNum = Math.log(num)/Math.log(4);
        return logNum%1==0;
    }
}
