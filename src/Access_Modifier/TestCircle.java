package Access_Modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0, "red");
        System.out.println("Circle has radius is: " + circle.getRadius() + " and area is: " + circle.getArea());
    }
}
