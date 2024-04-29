public class Cone extends Shape {
    double radius;
    double height;

    // Constructor for the Cone class
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // For founding the surface are of the cone
    public double surface_area() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    // For finding the volume of the cone
    public double volume() {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // Output attributes to the string
    public String toString() {
        return "Cone with radius: " + radius + " and height: " + height + "\n"
            + "Surface Area: " + surface_area() + "\n"
            + "Volume: " + volume();
    }
}
