// Circle class with a private radius field, constructor, getter, and setter
class Circle {
    // Private field for radius
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to get the radius
    public double getRadius() {
        return radius;
    }

    // Setter method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

// CircleAreaCalculator class to calculate the area of a circle
class CircleAreaCalculator {
    // Method to calculate area
    public double calculateArea(Circle circle) {
        // Using the formula area = π * r^2
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}

// Main class to demonstrate the functionality
public class Area {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5
        Circle myCircle = new Circle(5);

        // Create an object of CircleAreaCalculator
        CircleAreaCalculator calculator = new CircleAreaCalculator();

        // Calculate the area of the circle
        double area = calculator.calculateArea(myCircle);

        // Print the area of the circle
        System.out.println("The area of the circle is: " + area);
    }
}
