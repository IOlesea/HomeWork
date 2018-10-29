package com.company;

public  class ShapeController {
    static int trianglePerim(Triangle T) {
        if (T.lengthOne <= 0 || T.lengthTwo <= 0 || T.lengthThree <= 0) {
            return 0;
        } else {
            int perim = T.lengthOne + T.lengthTwo + T.lengthThree;
            return perim;
        }
    }

        static int rectanglePerim (Rectangle R) {
            if (R.height <= 0 || R.width <= 0) {
                return 0;
            } else {
                int perim = 2 * R.width + 2 * R.height;
                return perim;
            }
        }

        static void modifyTriangle (Triangle result){
            result.lengthOne += result.lengthOne;
            result.lengthTwo += result.lengthTwo;
            result.lengthThree += result.lengthThree;

        }

        static void modifyRectangle (Rectangle result){
            result.height += result.height;
            result.width += result.width;
        }


        static double circleAria ( Circle C) {

            double aria = Math.PI *(C.r *C.r);
            return aria;
        }
}

