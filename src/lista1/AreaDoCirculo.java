package lista1;

import java.util.Scanner;

public class AreaDoCirculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double raio = ler.nextDouble();
		double n = 3.14159;
		double area = n * Math.pow(raio, 2);

		System.out.printf("A= %.4f", area);

	}

}
