package com.bridgelabz.cabinvoicegenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        assertEquals(25,fare,0.0);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinimumFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        assertEquals(5,fare,0.0);
    }

    @Test
    public void givenMultipleRides_shouldReturn_averageFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride [] rides = { new Ride (2.0,5),
                new Ride (2.0,5)
        };
        double result = invoiceGenerator.calculateAverageFare(rides);
        assertEquals(25,result);

    }

}
