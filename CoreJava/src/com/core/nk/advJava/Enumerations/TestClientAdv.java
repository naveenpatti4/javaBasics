package com.core.nk.advJava.Enumerations;


/**
 * TestClientAdv for enumerations lab
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 * <p>
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of Trivera Technologies, LLC
 * <p>
 * Copyright (c) 2020 Trivera Technologies, LLC.
 * http://www.triveratech.com
 * </p>
 *
 * @author Trivera Technologies Tech Team.
 */


public class TestClientAdv {

   public static void main(String args[]) {
      //Use the new for-loop feature to iterate over all
      //USState enumeration types
      System.out.println(USState.DE.getStateCapital());

      for (USState state : USState.values()) {

         System.out.println("State :: " + state.getStateName() + " ,Capital :: " + state.getStateCapital());
      }
      //Invoke getStateName() and getStateCapital() on each enum
      //The name and the capital of each state in the U.S.


   }
}
