package com.core.nk.simpleclass;

public class Driver {
   public static void main(String[] args) {
      Employee employee = new Employee();
      Employee employee1 = new Employee("Naveen");
      Employee employee2 = new Employee("NK", 20000);


      System.out.println(employee.getName() + " makes $ "+ employee.getSalary());
      System.out.println(employee1.getName() + " makes $ "+ employee1.getSalary());
      System.out.println(employee2.getName() + " makes $ "+ employee2.getSalary());
   }
}
