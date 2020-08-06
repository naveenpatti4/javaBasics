package com.core.nk.advJava.exceptions;

public class InvalidCommissionRateException extends Exception{

   @Override
   public String toString() {
      return "Acceptable commission rate has been exceeded";
   }
}
