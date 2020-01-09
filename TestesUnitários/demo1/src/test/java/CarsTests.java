import Exceptions.CarExistsException;
import Exceptions.InvalidCarException;
import Exceptions.NoCarAvaliableException;
import Exceptions.UnknownCompareTypeException;
import Model.Car;
import Model.Cars;
import Model.Owner;
import Utils.Point;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarsTests {

    Cars cars = new Cars();

    Owner owner1 = new Owner("owner1@gmail.com", "owner1",
            "portugal", 1, "pass");

    Car car1 = new Car("AA-00-00", owner1, Car.CarType.gas,
            120.0, 20000.0, 100000, 300,
            new Point(30.0,30.0), "Seat");

    Car car2 = new Car("BB-00-00", owner1, Car.CarType.electric,
            100.0, 35000.0, 100000, 500,
            new Point(10.0,10.0), "Seat");


    @Test
    public void testAddCar() {

        try {
            cars.addCar(car1);
            cars.addCar(car2);
        } catch (CarExistsException e) {
            e.printStackTrace();
        }

        assertEquals(2, cars.getCarBase().size());
        assertTrue(cars.getCarBase().containsValue(car1));
        assertTrue(cars.getCarBase().containsValue(car2));
    }

    @Test
    public void testSearchCar() throws Exception {
        cars.addCar(car1);

        Car newCar = null;
        try {
            newCar = cars.searchCar("AA-00-00");
        } catch (InvalidCarException e) {
            e.printStackTrace();
        }

        assertEquals(newCar, car1);
    }

    @Test
    public void testGetCar() throws CarExistsException {
        cars.addCar(car1);
        cars.addCar(car2);

        Car newCar1 = null;
        Car newCar2 = null;
        Car newCar3 = null;
        Car newCar4 = null;
        Car newCar5 = null;

        try {
            Point dest = new Point(50.0, 50.0);
            Point origin = new Point(0.0, 0.0);
            newCar1 = cars.getCar("MaisPerto", dest, origin, Car.CarType.any);
            newCar2 = cars.getCar("MaisBarato", dest, origin, Car.CarType.any);
            newCar3 = cars.getCar("MaisPerto", dest, origin, Car.CarType.gas);
            newCar4 = cars.getCar(dest, 400, Car.CarType.any);
            newCar5 = cars.getCar(dest, origin, 400, Car.CarType.any);
        } catch (NoCarAvaliableException | UnknownCompareTypeException e) {
            e.printStackTrace();
        }

        assertEquals(newCar1, car2);
        assertEquals(newCar2, car1);
        assertEquals(newCar3, car1);
        assertEquals(newCar4, car2);
        assertEquals(newCar5, car1);
    }

}
