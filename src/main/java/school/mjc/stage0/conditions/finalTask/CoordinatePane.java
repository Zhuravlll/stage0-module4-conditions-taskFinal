package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (y > 0) {
            switch (x) {
                case 1 -> System.out.println("first");
                case -1 -> System.out.println("second");
            }
        } else if (x == 0 && y == 0) {
            System.out.println("zero");
        } else {
            switch (x) {
                case 1 -> System.out.println("fourth");
                case -1 -> System.out.println("third");
            }
        }
    }
}
