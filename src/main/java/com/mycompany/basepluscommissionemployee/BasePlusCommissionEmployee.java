/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basepluscommissionemployee;
/**
 *
 * @author ramlifting
 */
public class BasePlusCommissionEmployee {
    private final CommissionEmployee employee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, 
        String socialSecurityNumber, double grossSales, 
        double commissionRate, double baseSalary) {
        employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, 
            grossSales, commissionRate);

       
        if (baseSalary < 0.0) {                  
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }       

        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {                  
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }       

        this.baseSalary = baseSalary;                
    } 


    public double getBaseSalary() {
        return baseSalary;
    }

  
    public double earnings() {
        return baseSalary + employee.earnings();
    }


    @Override 
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
            employee.toString(), "base salary", getBaseSalary());   
    } 
     
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Ruben", "Menacho", "123-45-6789", 5000, 0.05, 1000);
        System.out.println(employee.toString());
        System.out.println("Earnings: " + employee.earnings());
    }
}


