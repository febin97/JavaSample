package com.stackroute;

public class StudentMarks {
    public float getAvg(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return (float)sum/n;
    }
    public int getMin(int[] arr, int n){
        int min=100;
        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
    public int getMax(int[] arr, int n){
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    public String returnOutput(int[] arr,int n){
        return "The average is "+getAvg(arr,n)+"\nThe minimum is "+getMin(arr,n)+"\nThe maximum is "+getMax(arr,n);
    }
}