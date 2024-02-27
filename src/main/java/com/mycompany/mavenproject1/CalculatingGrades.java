/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author litun0640
 */
import java.util.Scanner;
public class CalculatingGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the course name: ");
        String course = input.nextLine();
        System.out.println("Please enter the average time spent in a week for this course in minutes: ");
        int totalmins = input.nextInt();

        int hours = totalmins/60;
        int mins = totalmins%60;

        System.out.println("Please enter the homework grades for this course: ");
        int hw1 = input.nextInt();
        int hw2 = input.nextInt();
        int hw3 = input.nextInt();
        int hw4 = input.nextInt();
        double avghw = ((double) (hw1+hw2+hw3+hw4))/4;

        System.out.println("Please enter the quiz grades for this course: ");
        double quiz1 = input.nextDouble();
        double quiz2 = input.nextDouble();
        double avgquiz = (quiz1+quiz2)/2;

        System.out.println("Please enter the final exam grade for this course: ");
        double exam = input.nextDouble();

        double overall = (0.35*avghw)+(0.15*avgquiz)+(0.50*exam);
        int overallint = (int) (overall+0.5);

        System.out.println("Course name: " + course);
        System.out.println("Weekly time spent: " + hours + "h" + mins);
        System.out.println("Average homework grade: " + avghw);
        System.out.println("Average quiz grade: " + avgquiz);
        System.out.println("Final exam grade: " + exam);
        System.out.println("Overall grade: " + overallint);
    }
    
}
