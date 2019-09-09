package com.stackroute;

public class Palindrome
{
    public boolean checkIfPalindrome(String input){
        char[] inputArr = input.toCharArray();
        int i=0;
        int j=inputArr.length-1;
        while(i<j) {
            char temp = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = temp;
            i++;
            j--;
        }
        String output= new String(inputArr);
        return output.equals(input);
    }


}
