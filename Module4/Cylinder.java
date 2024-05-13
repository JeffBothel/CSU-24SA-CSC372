public class Cylinder extends Shape {
    double radius;

    // Constructor for the Cylinder class
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // For finding the surface area of the cylinder
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // For finding the volume of the cylinder
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Output attributes to the string
    public String toString() {
        return "Cylinder with radius: " + radius + " and height: " + height + "\n"
            + "Surface Area: " + surface_area() + "\n"
            + "Volume: " + volume();
    }
    
}