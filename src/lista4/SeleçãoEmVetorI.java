package lista4;

import java.util.Scanner;

public class SeleçãoEmVetorI {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Double[] A = new Double[10];
		double x;

		for (int i = 0; i < A.length; i++) {
			x = ler.nextDouble();
			A[i] = x;
		}
		// A[i] = 0.0
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 10) {
				System.out.println("A [" + i + "] = " + A[i]);
			}
		}

	}
}
