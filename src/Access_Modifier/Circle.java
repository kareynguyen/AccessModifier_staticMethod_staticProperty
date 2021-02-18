package Access_Modifier;

public class Circle {
    private double radius = 1.0D;
    private String color = "red";
    final double PI = 3.15149;

    public Circle(double v, String red) {
    }
    public Circle(double radius){
        this.radius = radius;
    }
// protected, default and public are all usable except private access modifier;
    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 2*radius*PI;
    }
}
