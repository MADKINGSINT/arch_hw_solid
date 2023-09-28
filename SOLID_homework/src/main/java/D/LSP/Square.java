package D.LSP;

public class Square extends RectangularShape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    // Getters/Setters

    @Override
    public int area() {
        return side * side;
    }
}
