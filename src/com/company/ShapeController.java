package com.company;

public  class ShapeController {
    static int trianglePerim(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        } else {
            int perim = a + b + c;
            return perim;
        }
    }

        static int rectanglePerim ( int a, int b) {
            if (a <= 0 || b <= 0) {
                return 0;
            } else {
                int perim = 2 * a + 2 * b;
                return perim;
            }
        }

        static void modifyTriangle (Triangle result,int a, int b, int c){
            result.lengthOne += a;
            result.lengthTwo += b;
            result.lengthThree += c;

        }

        static void modifyRectangle (Rectangle result,int x, int y){
            result.height += x;
            result.width += y;
        }
    }

