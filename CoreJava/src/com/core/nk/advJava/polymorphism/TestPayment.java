package com.core.nk.advJava.polymorphism;

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


public class TestPayment {

    public static void main(String[] args) {
        SalesEmployee jennifer = new SalesEmployee();
        HourlyEmployee john = new HourlyEmployee();

        Employee[] staff = new Employee[2];

        jennifer.setSalesAmount(3000);
        jennifer.setCommissionRate(.1);

        john.setHourRate(15.5);
        john.setHoursWorked(40);

        staff[0] = jennifer;
        staff[1] = john;

        for (Employee employee : staff){
            System.out.println(employee.calcSalary());
        }

        // Instantiate jennifer and john
        //jennifer = new ????
        //john = new ????

        // LAB HINT: Set values for salesAmount and commission for jennifer


        // LAB HINT: Set staff[0] to jennifer


        // LAB HINT: Set values for hourRate and hoursWorked for john


        // LAB HINT: Set staff[1] to john


        // LAB HINT: Loop through the list of Employees and print out salary.


    }

}