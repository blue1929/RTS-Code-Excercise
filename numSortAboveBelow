
/*
Author: Mridul Sen 
Code Language: java
Requirement: #1 Print the number of integers in an array that are above the given input and the number that are below, 
                e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
                Solution is applicable to the range provided.
*/

import java.util.*;
import java.io.*;
import java.util.Arrays;


public class Main
{ 
    
    public static void sortNum(int input){
        
        // [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4
        Integer[] array =  {1, 5, 2, 1, 10};
        List<Integer> numAbove = new ArrayList<>();
        List<Integer> numBelow = new ArrayList<>();

        for ( int i = 0; i<array.length; i++ ){
            
            if(array[i]>input){
               numBelow.add(array[i]) ; 
            }
            else if(array[i]<input){
               numAbove.add(array[i]) ;
            }
        }

        System.out.print("Above : " +Arrays.asList(array).indexOf(Collections.max(numAbove)) + " ");
        System.out.print("Below : " +Arrays.asList(array).indexOf(Collections.min(numBelow)) + " ");
    }
    

     public static void main(String[] args) {
        
       sortNum(6);
       
    }
}
