/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author user
 */
public class GradeTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // clear buffer

        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            names[i] = input.nextLine();

            System.out.print("Enter mark: ");
            marks[i] = input.nextInt();
            input.nextLine(); // clear buffer
        }

        displayResults(names, marks);
    }

    public static void displayResults(String[] names, int[] marks) {
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int mark : marks) {
            total += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) total / marks.length;

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + marks[i]);
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}
