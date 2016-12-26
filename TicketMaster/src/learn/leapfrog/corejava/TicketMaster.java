/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava;

import java.util.Scanner;
import learn.leapfrog.corejava.util.TicketPublisher;

/**
 *
 * @author Zeppelin
 */
public class TicketMaster {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int startTicketNumber = 1001, totalTickets = 500;
        int[] ticketNumber = new int[totalTickets];

        TicketPublisher publisher = new TicketPublisher(ticketNumber, totalTickets);
        publisher.generateTickets(startTicketNumber, totalTickets);
        
        System.out.println("Enter your ticket number:");
        int userTicketNumber = input.nextInt();
        
        if (publisher.isValid(userTicketNumber)) {
            System.out.println("Your ticket is valid.");
        } else {
            System.out.println("Your ticket is invalid.");
        }
    }
}
