/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava;

import java.util.Scanner;
import learn.leapfrog.corejava.util.ResultPublisher;

/**
 *
 * @author Zeppelin
 */
public class Marksheet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] students = {"John", "Paul", "George", "Ringo"};
        String[] subjects = {"English", "Science", "Math"};
        int[][] marks = new int[students.length][subjects.length];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Marks for " + students[i]);
            for (int j = 0; j < subjects.length; j++) {
                System.out.println("Enter marks in " + subjects[j]);
                marks[i][j] = input.nextInt();
            }
            System.out.println("");
        }

        ResultPublisher publisher = new ResultPublisher(subjects);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Displaying result of " + students[i] + ":");

            publisher.setMarks(marks[i]);
            System.out.println("Total marks= " + publisher.getTotal());

            if (!publisher.isFail()) {
                System.out.println("Percentage= " + publisher.getPercentage() + "%");
                System.out.println("Grade= " + publisher.getGrade());
            } else {
                System.out.println(students[i] + " has failed.");
            }
            System.out.println("");
        }
    }

}
