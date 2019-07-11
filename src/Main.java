
import Comparator.CircleComparator;
import Comparator.RectangleComparator;
import Comparator.SquareComparator;
import Shapes.Shape;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);


        Circle circle1 = new Circle(2,"white",false);
        Circle circle2 = new Circle(3,"white",false);
        System.out.println(circle1);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle(20,10,"blue", true);
        Rectangle rectangle2 = new Rectangle(30,8,"xanh",false);
        System.out.println(rectangle1);

        Square square1 = new Square(15,"black",true);
        Square square2 = new Square(14);
        System.out.println(square1);
        System.out.println(square2);


        CircleComparator circleComparator = new CircleComparator();
        int result =circleComparator.compare(circle1,circle2);
        if(result == 1){
            System.out.println("circle 1 is bigger than circle 2");
        }else if (result == -1){
            System.out.println("circle 1 is smaller than circle 2");

        }else {
            System.out.println("two circles are equals");
        }


        SquareComparator squareComparator = new SquareComparator();
        int result1 = squareComparator.compare(square1,square2);
        if(result1 == 1){
            System.out.println("square 1 is bigger than square 2");
        }else if (result1 == -1){
            System.out.println("square 1 is smaller than square 2");

        }else {
            System.out.println("two squares are equals");
        }


        RectangleComparator rectangleComparator = new RectangleComparator();

        int result2 = rectangleComparator.compare(rectangle1,rectangle2);
        if(result1 == 1){
            System.out.println("Rectangle 1 is bigger than rectangle 2");
        }else if (result1 == -1){
            System.out.println("Rectangle 1 is smaller than rectangle 2");

        }else {
            System.out.println("two rectangles are equals");
        }

    }
}
