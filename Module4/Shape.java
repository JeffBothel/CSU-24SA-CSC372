import java.lang.Math.*;

public class Shape {
    // Original shape surface area is based on a cube
    public double surface_area(double side_length) {
        return (6.0*Math.pow(2.0, side_length));
    }

    // Original shape volume is based on a cube
    public double volume(double side_length) {
        return Math.pow(3.0, side_length);
    }
}