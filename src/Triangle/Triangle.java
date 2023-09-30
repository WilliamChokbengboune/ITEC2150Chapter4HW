package Triangle;

/**
 * Class: Triangle
 *Author: William Chokbengbooune
 * Date: 9/29/2023
 * Description: Triangle checks the sides of a and bto make sure they are bigger than c
 *
 */

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    boolean checkSides(double sideA, double sideB, double sideC) throws IllegalTriangleSideException{
        if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB) ){
            System.out.println("This is a triangle.");
            return true;
        }
        else {
            throw new IllegalTriangleSideException ("Side C is less than A and B combined.");
        }
    }

    public static void main(String[] args) {
        Triangle te1 = new Triangle();
        Triangle te2 = new Triangle();
        Triangle te3 = new Triangle();
        try {
            boolean result = te1.checkSides(1.5, 6.8, 3.2);
        }catch (IllegalTriangleSideException ae){
            System.out.println(ae.getMessage());
        }

        try {
            boolean result = te2.checkSides(1.5, 0.8, 6.2);
        }catch (IllegalTriangleSideException ae){
            System.out.println(ae.getMessage());
        }

        try {
            boolean result = te3.checkSides(1.5, 1.1, 2.6);
        }catch (IllegalTriangleSideException ae){
            System.out.println(ae.getMessage());
        }
    }
}

