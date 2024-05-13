public class UnitTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Sphere sphere = new Sphere(6.0);
        Cone cone = new Cone(6.0,6.0);
        Cylinder cylinder = new Cylinder(6.0,6.0);
        ShapeArray shapeArray = new ShapeArray(4);

        // Testing the shape classes
        System.out.println("###Testing the Shape class###");
        System.out.println(shape.toString() + "\n");

        // Testing the sphere classes
        System.out.println("###Testing the Sphere class###");
        System.out.println(sphere.toString() + "\n");

        // Testing the cone classes
        System.out.println("###Testing the Cone class###");
        System.out.println(cone.toString() + "\n");

        // Testing the cylinder classes
        System.out.println("###Testing the Cylinder class###");
        System.out.println(cylinder.toString() + "\n");

        // Testing the shape array classes
        System.out.println("###Testing the ShapeArray class###");
        shapeArray.addShape(sphere);
        shapeArray.addShape(cone);
        shapeArray.addShape(cylinder);
        System.out.println(shapeArray.toString(0));
        System.out.println(shapeArray.toString(1));
        System.out.println(shapeArray.toString(2));
    }
}
