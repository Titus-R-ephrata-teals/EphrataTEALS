package sampleCode.Games;

import java.util.Scanner;

public class WesGame2 {
    
    
    public static int middleOfThree(int a, int b, int c) 
    { 
        if ((a < b && b < c) || (c < b && b < a)) 
            return b; 
  
        else if ((b < a && a < c) || (c < a && a < b)) 
        return a; 
  
        else
        return c; 
    } 
      
    
    public static void main(String[] args) 
    { 
        int a = 3, b = 5, c = 4; 
        System.out.println( middleOfThree(a, b, c) ); 
    } 
}
    



