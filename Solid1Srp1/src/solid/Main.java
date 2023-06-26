package solid;

import solid.srp.Square;
import solid.srp.SquareDraw;

public class Main {
    public static void main(String[] args) {
        int side =  5;
        SquareDraw squareDraw =  new SquareDraw(side);
        Square square = new Square(side);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
        squareDraw.draw();
        squareDraw.zoom(1.5f);
        System.out.println("\n ________________________________________________");
        squareDraw.draw();
    }
}
