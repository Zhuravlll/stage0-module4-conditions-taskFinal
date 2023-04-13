package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide < 1 || secondSide < 1 || thirdSide < 1) {
            System.out.println("it's not a triangle");
        } else if ((firstSide <= secondSide + thirdSide) && (secondSide <= firstSide + thirdSide) && (thirdSide <= firstSide + secondSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
