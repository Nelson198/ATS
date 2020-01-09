import Model.*;
import Utils.Point;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class RentalsTests {

    Rentals rentals = new Rentals();

    Owner owner1 = new Owner("owner1@gmail.com", "owner1",
            "portugal", 1, "pass");

    Car car1 = new Car("AA-00-00", owner1, Car.CarType.gas,
            120.0, 20000.0, 100000, 300,
            new Point(30.0,30.0), "Seat");

    Car car2 = new Car("BB-00-00", owner1, Car.CarType.electric,
            100.0, 35000.0, 100000, 500,
            new Point(10.0,10.0), "Seat");

    Client client1 = new Client(new Point(0.0, 0.0), "client1@gmail.com",
            "pass", "client1", "portugal", 2);

    Client client2 = new Client(new Point(100.0, 0.0), "client2@gmail.com",
            "pass", "client2", "portugal", 3);


    Rental rental1 = new Rental(car1, client1, new Point(20.0, 20.0));
    Rental rental2 = new Rental(car2, client2, new Point(0.0, 100.0));
    Rental rental3 = new Rental(car1, client2, new Point(0.0, 500.0));



    @Test
    public void testAddRental() {

        rentals.addRental(rental1);
        rentals.addRental(rental2);

        assertTrue(rentals.getRentalBase().contains(rental1));
        assertTrue(rentals.getRentalBase().contains(rental2));
    }


    @Test
    public void testGetTotalBilledCar() {

        double total1 = rentals.getTotalBilledCar(
                car1, LocalDateTime.MIN, LocalDateTime.MAX);

        double total2 = rentals.getTotalBilledCar(car2);

        assertEquals(0, total1);
        assertEquals(0, total2);

        rental1.rent();
        rental2.rent();
        rentals.addRental(rental1);
        rentals.addRental(rental2);

        total1 = rentals.getTotalBilledCar(
                car1, LocalDateTime.MIN, LocalDateTime.MAX);

        total2 = rentals.getTotalBilledCar(car2);
        assertTrue(total1 > 0 && total2 > 0);
    }


    @Test
    public void testGetRentalListClient() {

        rentals.addRental(rental1);
        rentals.addRental(rental2);
        rentals.addRental(rental3);

        List<Rental> l1 = rentals.getRentalListClient(client1);
        List<Rental> l2 = rentals.getRentalListClient("client2@gmail.com");

        assertTrue(l1.contains(rental1));
        assertEquals(1, l1.size());

        assertTrue(l2.contains(rental2));
        assertTrue(l2.contains(rental3));
        assertEquals(2, l2.size());
    }


    @Test
    public void testGetRentalListOwner() {

        rentals.addRental(rental1);
        rentals.addRental(rental2);
        rentals.addRental(rental3);

        List<Rental> l = rentals.getRentalListOwner(owner1);

        assertTrue(l.contains(rental1));
        assertTrue(l.contains(rental2));
        assertTrue(l.contains(rental3));
        assertEquals(3, l.size());
    }
}
