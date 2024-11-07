public class Rectangle_17 {
    private double length;
    private double width;

    // Default constructor setting both length and width to 1
    public Rectangle_17() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setters with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Length must be between 0.0 and 20.0.");
        }
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Width must be between 0.0 and 20.0.");
        }
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Create an object of Rectangle and test
        Rectangle_17 rect = new Rectangle_17();

        // Display default values
        System.out.println("Default Length: " + rect.getLength());
        System.out.println("Default Width: " + rect.getWidth());

        // Set new values
        rect.setLength(10.5);
        rect.setWidth(15.0);

        // Display new values
        System.out.println("Updated Length: " + rect.getLength());
        System.out.println("Updated Width: " + rect.getWidth());

        // Calculate and display perimeter and area
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Area: " + rect.calculateArea());

        // Test invalid set values
        rect.setLength(25.0);  // Invalid length
        rect.setWidth(30.0);   // Invalid width
    }
}