package new29;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Car {
    private TypeCar type;
    private int year;
    private double engine_capacity;

    public enum TypeCar {
        Sedan, Hatchback, Universal, Coupé, Limousine, SUV, Crossover, Pick_up, Minivan
    }

    public Car(TypeCar type, int year, double engine_capacity) {
        this.type = type;
        this.year = year;
        this.engine_capacity = engine_capacity;
    }

    public TypeCar getType() {
        return type;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car : " +
                "type = " + type +
                ", year = " + year +
                ", engine_capacity = " + engine_capacity ;
    }
}
