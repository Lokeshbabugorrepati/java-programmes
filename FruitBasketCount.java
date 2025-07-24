/********************************
Program no.  :11
Program name :FruitBasketCount.java
Author       :Lokesh
Date         :14-07-2025
Purpose      :Implemention of Arrays
*********************************/

import java.util.Scanner;
public class FruitBasketCount
{
     public void countFruitBasket()
     {
           Scanner console=new Scanner(System.in);
           System.out.print("Enter the number of Baskets: ");
           int n = console.nextInt();

           //create an array
           int baskets[] = new int[n];
          // Initialize an Array
          for(int i=0; i<n; i++)
          {
                 System.out.print("Enter the count of Apples at Basket["+(i+1)+"]: ");
                 baskets[i]=console.nextInt();
          
          }
          int total = 0;
          int max =baskets[0];
          int maxIndex = 0;

          // Accessing an array
          for(int i=0; i<n; i++)
          {
               total += baskets[i];
               if(baskets[i] > max)
               {
                   max = baskets[i];
                   maxIndex = i;
               }

	  }
             System.out.println("Total number of Apples in all baskets: " + total);
             System.out.println("Maximum Apples in a basket: " + max);
             System.out.println("Basket number with maximum Apples: " + (maxIndex + 1));

             console.close();

           
     }
     public static void main(String args[])
     {
            FruitBasketCount ob=new FruitBasketCount();
            ob.countFruitBasket();
           
     }	
}
