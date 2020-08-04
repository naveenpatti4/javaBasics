package com.core.nk.lang;

public class Looping {
   public static void main(String[] args) {
//      counter();
      whileCounter();
   }

   private static void counter(){
      int counter;
      for (int i = 0; i < 10; i++){
         counter = i;
         System.out.println(" current count :: "+ counter);
      }
   }

   private static void whileCounter(){
      int counter = 0;
      while (counter < 10){
         counter ++;
         System.out.println(" current count :: "+ counter);
      }
   }
}
