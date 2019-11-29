package View.ViewModel;
import Exceptions.InvalidNewRentalThrowable;
import Model.Car;
import Utils.Point;

public class RentCarSimple {
    private final Point point;
    private final Car.CarType type;

    public RentCarSimple(Point point, String type) throws InvalidNewRentalThrowable {

        this.point = point;
        try {
            this.type = Car.CarType.valueOf(type.toLowerCase());
        }
        catch (IllegalArgumentException e){
            throw new InvalidNewRentalThrowable();
        }
    }

    public Point getPoint() {
        return this.point;
    }

    public Car.CarType getCarType() {
        return this.type;
    }
}
