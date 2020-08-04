package com.core.nk.simpleclass;

public class Employee {
   int salary;
   String name;

   public Employee(){
      this("Naveen Patti");
   }

   public Employee(String name){
      this(name, 200000000);
   }

   public Employee(String name, int salary){
      this.name = name;
      this.salary = salary;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

}
