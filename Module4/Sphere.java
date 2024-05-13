public class Sphere extends Shape {

    // Constructor for the Sphere class
    public Sphere(double radius) {
        this.height = radius;
    }

    // For finding the surface area of the sphere
    public double surface_area() {
        return 4 * Math.PI * Math.pow(height, 2);
    }

    // For finding the volume of the sphere
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(height, 3);
    }

    // Output attributes to the string
    public String toString() {
        return "Sphere with radius: " + height + "\n"
            + "Surface Area: " + surface_area() + "\n"
            + "Volume: " + volume();
    }
}