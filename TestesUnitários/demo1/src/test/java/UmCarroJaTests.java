import static org.junit.jupiter.api.Assertions.*;

import Exceptions.*;
import Model.*;
import Utils.Point;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.Map;

public class UmCarroJaTests {

    UMCarroJa model = new UMCarroJa();

    Owner owner1 = new Owner(
            "owner1@gmail.com",
            "owner1",
            "portugal",
            1,
            "pass");

    Client client1 = new Client(
            new Point(0.0, 0.0),
            "client1@gmail.com",
            "pass",
            "client1",
            "portugal",
            2);

    Client client2 = new Client(
            new Point(0.0, 0.0),
            "client2@gmail.com",
            "pass",
            "client2",
            "portugal",
            3);

    Car car1 = new Car(
            "AA-00-00",
            owner1,
            Car.CarType.gas,
            120.0,
            20000.0,
            100000,
            500,
            new Point(0.0,0.0),
            "Seat");



    @Test
    public void testAddUser() {

        try {
            model.addUser(owner1);
        } catch (UserExistsException e) {
            e.printStackTrace();
        }

        assertTrue(model.getUsers().getUserBase().containsKey("owner1@gmail.com"));
    }


    @Test
    public void testAddCar() throws UserExistsException {

        model.addUser(owner1);

        try {
            model.addCar(
                    owner1,
                    "AA-00-00",
                    Car.CarType.gas,
                    120.0,
                    20000.0,
                    100000,
                    500,
                    new Point(0.0, 0.0),
                    "Seat");
        } catch (CarExistsException | InvalidUserException e) {
            e.printStackTrace();
        }

        assertTrue(model.getCars().getCarBase().containsKey("AA-00-00"));
    }


    @Test
    public void testLogIn() throws UserExistsException {

        model.addUser(owner1);

        try {
            model.logIn("owner1@gmail.com", "pass");

        } catch (WrongPasswordExecption | InvalidUserException e) {
            e.printStackTrace();
        }

        assertTrue(model.getUsers().getUserBase().containsKey("owner1@gmail.com"));
    }

    @Test
    public void testBestClientsTimes() throws UserExistsException {
        model.addUser(client1);
        model.addUser(client2);

        List<Map.Entry<String, Integer>> bct = model.getBestClientsTimes();

        assertEquals(2, model.getUsers().getUserBase().size(), bct.size());
    }

    @Test
    public void testRental() throws UserExistsException, CarExistsException, InvalidUserException {
        model.addUser(client1);
        model.addUser(owner1);
        model.addCar(
                owner1,
                "AA-00-00",
                Car.CarType.gas,
                120.0,
                20000.0,
                100000,
                500,
                new Point(0.0, 0.0),
                "Seat");

        try {
            model.rental("client1@gmail.com", new Point(10.0,10.0), "MaisBarato", Car.CarType.gas);
        } catch (UnknownCompareTypeException | NoCarAvaliableException e) {
            e.printStackTrace();
        }

        assertEquals(1, model.getRentals().getRentalBase().size());
    }


    @Test
    public void testTotalBilledCar() throws Exception {

        model.addUser(client1);
        model.addUser(owner1);
        model.addCar(owner1,
                "AA-00-00", Car.CarType.gas, 120.0, 20000.0,
                100000, 500, new Point(0.0, 0.0), "Seat");

        double total = model.getTotalBilledCar(car1);
        assertEquals(0, total);

        model.rental("client1@gmail.com", new Point(20.0,20.0), "MaisBarato", Car.CarType.gas);

        total = model.getTotalBilledCar(car1);
        assertTrue(total > 0);
    }

    @Test
    public void testGetRentalList() throws Exception {
        model.addUser(client1);
        model.addUser(client2);
        model.addUser(owner1);
        model.addCar(owner1,
                "AA-00-00", Car.CarType.gas, 120.0, 20000.0,
                100000, 500, new Point(0.0, 0.0), "Seat");


        List<Rental> cl = model.getRentalListClient(client1);
        List<Rental> ol = model.getRentalListOwner(owner1);

        assertEquals(0, cl.size());
        assertEquals(0, ol.size());

        model.rental("client1@gmail.com", new Point(20.0,20.0), "MaisBarato", Car.CarType.gas);
        model.rental("client2@gmail.com", new Point(20.0,20.0), "MaisBarato", Car.CarType.gas);

        cl = model.getRentalListClient(client1);
        ol = model.getRentalListOwner(owner1);
        assertEquals(1, cl.size());
        assertEquals(2, ol.size());
    }



}
