public class Sphere extends Shape {
    double radius;

    // Constructor for the Sphere class
    public Sphere(double radius) {
        this.radius = radius;
    }

    // For finding the surface area of the sphere
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // For finding the volume of the sphere
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Output attributes to the string
    public String toString() {
        return "Sphere with radius: " + radius + "\n"
            + "Surface Area: " + surface_area() + "\n"
            + "Volume: " + volume();
    }
}