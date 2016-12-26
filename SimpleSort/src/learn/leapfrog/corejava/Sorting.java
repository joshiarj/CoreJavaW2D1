/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava;

import learn.leapfrog.corejava.util.ArrayHelper;

/**
 *
 * @author Zeppelin
 */
public class Sorting {

    public static void main(String[] args) {

        int[] numbers = {34, 2, 56, 6, 78, 7, 18, 90, 25, 40};

        ArrayHelper helper = new ArrayHelper();
        helper.simpleSort(numbers, false);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
