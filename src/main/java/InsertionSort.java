package com.solomon.algo.sort;

public class InsertionSort{


    public int [] sort(int [] a){

        for(int i=1; i< a.length; i++){
            int k = i;
            int kvalue = a[k];
            int j=k-1;
            for(; j>=0; j--){
                if(a[j] > kvalue){
                    int temp = a[j+1];
                    a[j+1] =  a[j] ;
                    a[j] = temp;

                }
            }
            if(j>=0) {
                a[j] = kvalue;
            }
        }
        return a;
    }

    public static void main(String ... args){
        int [] array = {3,5,6,7,9,4,2,78,98,45};
        InsertionSort sort = new InsertionSort();
        sort.sort(array);

        for(int i = 0 ; i < array.length; i++){
            System.out.println(String.format("array[ %d] = %d",i,array[i]));
        }


    }
}