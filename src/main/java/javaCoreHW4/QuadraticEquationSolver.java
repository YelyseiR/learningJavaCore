<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return new double[]{};
        } else if (discriminant == 0) {
            double root = -b / (2.0 * a);
            return new double[]{root};
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            if (root1 > root2) {
                return new double[]{root1, root2};
            } else {
                return new double[]{root2, root1};
            }
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        System.out.println(solver.solve(1, -2, -3));
    }
}
