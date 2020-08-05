package com.core.nk.arrays;

public class Arrays {
   public static void main(String[] args) {
      String myArray[];
      myArray = new String[5];

      myArray[0] = "First element";
      myArray[1] = "Second element";
      myArray[2] = "Third element";
      myArray[3] = "Fourth element";
      myArray[4] = "Fifth element";
      for (String s : myArray) {
         System.out.println(s);
      }
   }
}
