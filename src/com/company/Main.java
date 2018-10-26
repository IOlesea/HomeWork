package com.company;

public class Main {

    public static void main(String... args) {
        int result1 = ShapeController.trianglePerim(1, 5,6);
        System.out.println("The triangle area is: " + result1);
        int result2 = ShapeController.rectanglePerim(5,5);
        System.out.println("The rectangle area is: " + result2);

        Triangle one = new Triangle();
        ShapeController.modifyTriangle(one,1,1,1);
        System.out.println("The triangle area was incremented: " + one.lengthOne + one.lengthTwo + one.lengthThree);

        Rectangle two = new Rectangle();
        ShapeController.modifyRectangle(two,1,0);
        System.out.println("The rectangle area was incremented: " + two.height + two.width);

    }
}
