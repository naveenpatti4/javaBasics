package com.core.nk.advJava.interfaces;

/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of Trivera Technologies, LLC
 *
 * Copyright (c) 2020 Trivera Technologies, LLC.
 * http://www.triveratech.com   
 * </p>
 * @author Trivera Technologies Tech Team.
 */


public class TestMailable {
    public static void main(String[] args) {
        Mailable [] distribution = new Mailable[2];
        distribution[0] = new Company();
        distribution[1] = new Employee ("Jim", 111);

        for (int i=0;i<distribution.length;i++) {
            distribution[i].mailNote("Testing the mail System");
        }
        // LAB HINT: Define a Mailable array

    // LAB HINT: Create Mailable instances and store them in the array

    // LAB HINT: Loop through the array invoking each object's
    //           mailNote() method
    }
}