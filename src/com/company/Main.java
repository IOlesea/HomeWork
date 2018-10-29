package com.company;

public class Main {

    public static void main(String... args) {
        Triangle one = new Triangle();
        one.lengthOne = 2;
        one.lengthTwo = 3;
        one.lengthThree = 5;
        int result1 = ShapeController.trianglePerim(one);
        System.out.println("The triangle area is: " + result1);

        Rectangle two = new Rectangle();
        two.height = 2;
        two.width = 3;
        int result2 = ShapeController.rectanglePerim(two);
        System.out.println("The rectangle area is: " + result2);

        Circle three = new Circle();
        three.r = 2.5;
        double result3 = ShapeController.circleAria(three);
        System.out.println("The circle aria is: " + result3);


        Triangle one1 = new Triangle();
        one1.lengthOne = 2;
        one1.lengthTwo = 5;
        one1.lengthThree = 4;
        ShapeController.modifyTriangle(one1);
        System.out.println("The triangle area was incremented: " + one1.lengthOne + one1.lengthTwo + one1.lengthThree);

        Rectangle two2 = new Rectangle();
        two2.width = 2;
        two2.height = 3;
        ShapeController.modifyRectangle(two2);
        System.out.println("The rectangle area was incremented: " + two2.height + two2.width);

    }
}
