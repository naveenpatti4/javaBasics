package com.core.nk.lang;

public class FunWithStrings {

   public static void main(String[] args) {
      String string1 = "Hello";
      String string2 = new String("Hello");
      String string3 = "How are you ?";
      String string4 = string3;
      string1 = string1.toUpperCase();

      System.out.println(string1 + ":" + string1.length());

      if (string1 == string2 ){
         System.out.println("String 1 and 2 are ==");
      }else {
         System.out.println("String 1 and 2 are Not ==");
      }

      if (string1.equalsIgnoreCase(string2) ){
         System.out.println("String 1 and 2 are equal");
      }else {
         System.out.println("String 1 and 2 are Not equal");
      }

      if (string3 == string4 ){
         System.out.println("String 3 and 4 are ==");
      }else {
         System.out.println("String 3 and 4 are Not ==");
      }

      if (string3.equalsIgnoreCase(string4) ){
         System.out.println("String 3 and 4 are equal");
      }else {
         System.out.println("String 3 and 4 are Not equal");
      }




   }




}
