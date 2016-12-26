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
public class TicketPublisher {

    int startTicketNumber, totalTickets, userTicketNumber;
    int[] ticketNumber;

    public TicketPublisher(int[] ticketNumber, int totalTickets) {
        this.ticketNumber = ticketNumber;
        this.totalTickets = totalTickets; // had to add this line and parameter to set only one parameter to isValid()
    }
    
    public void generateTickets(int startTicketNumber, int totalTickets) {
        int ticketCounter = startTicketNumber;
        for (int i = 0; i < totalTickets; i++) {
            ticketNumber[i] = ticketCounter;
            ticketCounter++;
        }
    }

    public boolean isValid(int userTicketNumber) {
        for (int i = 0; i < totalTickets; i++) {
            if (userTicketNumber == ticketNumber[i]) {
                return true;
            }
        }
        return false;
    }

}
