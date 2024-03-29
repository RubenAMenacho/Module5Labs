/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basepluscommissionemployee;

/**
 *
 * @author ramlifting
 */
 public class CommissionEmployee extends Employee {
         
   private double grossSales;       
   private double commissionRate; 

   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate) {
      super(firstName, lastName, socialSecurityNumber);

      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }      

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      this.grossSales = grossSales;
   } 

   public double getGrossSales() {return grossSales;}

   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      } 

      this.commissionRate = commissionRate;
   } 

   public double getCommissionRate() {return commissionRate;}

   public double earnings() {
      return getCommissionRate() * getGrossSales();
   } 

   @Override 
   public String toString() {
      return super.toString() + String.format("%n%s: %.2f%n%s: %.2f", 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
   } 
}
