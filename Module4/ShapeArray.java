public class ShapeArray {
    int objectArray_total;
    int objectArray_count;
    Shape objectArray[];

    // Constructor for the ShapeArray class
    public ShapeArray(int startCount) {
        this.objectArray_total = startCount;
        this.objectArray_count = 0;
        this.objectArray = new Shape[startCount];
    }

    // Adds a shape to the objectArray
    public void addShape(Shape shape) {
        if(this.objectArray_count == this.objectArray_total) {
            Shape[] temp = new Shape[this.objectArray_total * 2];
            for(int i = 0; i < this.objectArray_total; i++) {
                temp[i] = this.objectArray[i];
            }
            this.objectArray = temp;
            this.objectArray_total = this.objectArray_total * 2;
        }
        else {
            this.objectArray[this.objectArray_count] = shape;
            this.objectArray_count++;
        }
    }

    // Removes a shape from the objectArray
    public void removeShape(int objectItem) {
        if(objectItem < this.objectArray_count) {
            for(int i = objectItem; i < this.objectArray_count - 1; i++) {
                this.objectArray[i] = this.objectArray[i + 1];
            }
            this.objectArray_count--;
        }
    }
    
    // Ports information to the command line
    public String toString(int objectItem) {
        return (this.objectArray[objectItem].toString() + "\n");
    }
}