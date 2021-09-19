
/*
Author: Mridul Sen 
Code Language: java
Requirement: #2 Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g. “MyString” rotated by 2 is “ngMyStri”.
          
*/

import java.util.*;
import java.io.*;

public class Main
{ 
    
    public static String rotation(String word, int num){
        
        String wordFill =  word.substring(word.length()-num) + word.substring(0, word.length()-num);

        return wordFill;
        
    }
    

    public static void main(String[] args) {
        
        String word = "String";
        int num = 2;
        System.out.println(rotation(word, num));
    }
}
