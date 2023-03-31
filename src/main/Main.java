/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author amanp
 */
public class Main {
    
    
    public static void main(String[] args) {
 String format = "%-30s%s%n";

        System.out.println("-".repeat(60));
        System.out.println("-- Welcome to:");
        System.out.printf(format,"--","BODY MASS INDEX (BMI) COMPUTATION, English version");
        System.out.printf(format,"--","by Arric Sekhon");
        System.out.println("-".repeat(60));

        System.out.println();

        Scanner key = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String name = key.nextLine();

        System.out.print("Please enter height in centimeters for "+ name+": ");
        double height = key.nextDouble();
        height=height/100;

        System.out.print("Please enter weight in kilograms for "+ name+": ");
        double weight = key.nextDouble();

        double result = weight/(Math.pow(height,2));

        System.out.println();
        System.out.println("-- SUMMARY REPORT for "+ name.toUpperCase());

        String weightStatus = "";

        if (result<18.5){
            weightStatus = "Underweight";
        } else if ((result)>=18.5 && (result)<=24.9){
            weightStatus = "Normal";
        } else if ((result)>=25.0 && (result)<=29.9){
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obesity";
        }


        System.out.printf(format, "-- BMI:", result + "( or " + (Math.round(result*10.0)/10.0) + " if rounded )");
        System.out.printf(format, "-- WEIGHT STATUS:", weightStatus);

        System.out.println();

        System.out.println("The SFSU Mashouf Wellness Center is at 755 Font Blvd.");

        System.out.println();

        System.out.println("-".repeat(60));
        System.out.println();
        System.out.println("Thank you for using my program,"+name);
        System.out.println();
        System.out.println("-".repeat(60));
    }
    
    
}
