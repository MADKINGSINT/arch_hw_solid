package D.LSP;

public class Rectangle extends RectangularShape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getters/Setters

    @Override
    public int area() {
        return width * height;
    }
}
