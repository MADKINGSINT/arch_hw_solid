package B.OCP;

public class Bus extends Vehicle {

    public Bus(int maxSpeed) {
        super((int) (maxSpeed * 0.6));
    }
}
