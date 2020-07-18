package Rectangular;

public class Rectagle {


        int length;
        int width;

        public Rectagle() {
        }

        public Rectagle (int length, int width)
        {
            this.length = length;
            this.width = width;
        }
        public int square(){
            int square = width * length;
            return square;
        }

        public int perimeter() {
            int perimeter = (2 * length) + (2 + width);
            return perimeter;
        }

    }

