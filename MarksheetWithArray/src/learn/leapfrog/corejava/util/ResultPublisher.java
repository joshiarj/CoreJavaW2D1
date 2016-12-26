/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava.util;

/**
 *
 * @author Zeppelin
 */
public class ResultPublisher {

    String[] subjects;
    int[] marks;
    int passMark = 32, fullMarks = 100;

    public ResultPublisher(String[] subjects){
        this.subjects=subjects;
    }
    
    public ResultPublisher(String[] subjects, int[] marks) {
        this.subjects = subjects;
        this.marks = marks;
    }
    
    public void setMarks(int[] marks){
        this.marks=marks;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < subjects.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public boolean isFail() {
        for (int i = 0; i < subjects.length; i++) {
            if (marks[i] < 32) {
                return true;
            }
        }
        return false;
    }

    public double getPercentage() {
        return (getTotal() / (subjects.length * fullMarks)) * 100;
    }

    public String getGrade() {
        double percentage = getPercentage();

        if (percentage >= 80) {
            return "Distinction";
        } else if (percentage < 80 && percentage >= 60) {
            return "First division";
        } else if (percentage < 60 && percentage >= 45) {
            return "Second division";
        } else if (percentage < 45 && percentage >= passMark) {
            return "Third division";
        }
        return null;
    }

}
