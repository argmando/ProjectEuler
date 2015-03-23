/**
 Problem 8
 The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.

 Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 while(file.hasNext()) 
    {
      value[i] = file.nextInt();
      i++;
    }
 */

import java.io.*;
import java.util.Scanner;

public class Problem8
{
  public static void main(String[] args) throws IOException {
    
    File f = new File("Problem8data.txt");
    Scanner file = new Scanner(f);
    
    long sum = 0L;
    long maxValue = 0L;
    long [] value = new long[1000];
    
    // this loop will store the values of the data in a array
    for(int i = 0; file.hasNext(); i++)
    {
      value[i] = file.nextInt();
    }
    
    for(int i = 0; i < 988; i++)
    {
      sum = value[i + 0] * value[i + 1] * value[i + 2] * value[i + 3] * value[i + 4] * value[i + 5] * value[i + 6] 
          * value[i + 7] * value[i + 8] * value[i + 9] * value[i + 10] * value[i + 11] * value[i + 12];
      
      if(maxValue < sum)
      {
        maxValue = sum;
      }
    }
   System.out.println("The thirteen adjacent digits in the 1000-digit number that have the greatest product is " + maxValue); 
   
  }
}