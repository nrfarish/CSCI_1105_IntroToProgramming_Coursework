
public class addMatrices {

	public static void main(String[] args) {

		double[][] matrixA = {
				{1.0, 2.0, 3.0},
				{4.0, 5.0, 6.0},
				{7.0, 8.0, 9.0},
		};

		double[][] matrixB = {
				{0.0, 2.0, 4.0},
				{1.0, 4.5, 2.2},
				{1.1, 4.3, 5.2},
		};

		double[][] sumMatrix = new double
				[matrixA.length][matrixA[1].length];

		sumMatrix = addMatrix(matrixA, matrixB);

		for (int i = 0; i < sumMatrix.length; i++) {

			for(int j = 0; j < sumMatrix[i].length; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}

			System.out.println("\n");
		}

	}

	public static double[][] addMatrix(double[][] a, double [][] b) {

		double[][] m = new double[a.length][a[1].length];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				m[i][j] = a[i][j] + b[i][j];
			}
		}

		return m;
	}
}
