class Vehicle {
    public void move() {
	System.out.println("Vehicle has four wheels");
    }
}

class Motorbike extends Vehicle {
    @Override
    public void move() {
	System.out.println("Motorbike has two wheels");
    }
}

public class DynamicBinding {
    public static void main(String args[]) {
	// Reference and objects are of Vehicle type.
	Vehicle obj1 = new Vehicle();
	obj1.move();
	// Reference is of Vehicle type and object is Motorbike type
	Vehicle obj2 = new Motorbike();
	obj2.move();
    }
}