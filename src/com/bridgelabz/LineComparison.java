package com.bridgelabz;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();


        System.out.print("Enter p1: ");
        double p1 = sc.nextDouble();
        System.out.print("Enter p2: ");
        double p2 = sc.nextDouble();
        System.out.print("Enter m1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter m2: ");
        double m2 = sc.nextDouble();
        
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(p1 - p2, 2) + Math.pow(m2 - m1, 2));


        boolean result = length1==(length2);

        if (result == true)
            System.out.println("Length of lines are same...");
        else
            System.out.println("Lines are not equals...");
        public class LineComparison {
            public static void main(String[] args) {
                System.out.println("Welcome to Line\n" +
                        "Comparison Computation\n" +
                        "Program on Master Branch");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter x1: ");
                double x1 = sc.nextDouble();
                System.out.print("Enter y1: ");
                double y1 = sc.nextDouble();
                System.out.print("Enter x2: ");
                double x2 = sc.nextDouble();
                System.out.print("Enter y2: ");
                double y2 = sc.nextDouble();


                System.out.print("Enter p1: ");
                double p1 = sc.nextDouble();
                System.out.print("Enter p2: ");
                double p2 = sc.nextDouble();
                System.out.print("Enter m1: ");
                double m1 = sc.nextDouble();
                System.out.print("Enter m2: ");
                double m2 = sc.nextDouble();

                double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                double length2 = Math.sqrt(Math.pow(p1 - p2, 2) + Math.pow(m2 - m1, 2));


                boolean result = length1.equals(length2);

                if (result == true)
                    System.out.println("Length of lines are same...");
                else
                    System.out.println("Lines are not equals...");
                System.out.println("The length1 of the line segment is: " + length1);
                System.out.println("The length2 of the line segment is: " + length2);


            }
        }




    }
}
