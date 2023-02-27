package lista3;

import java.util.Scanner;

public class SomaDeImparesConsecutivosI {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int x = ler.nextInt();
		int y = ler.nextInt();
		int soma = 0;

		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i = y + 1; i < x; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		System.out.println(soma);
	}

}
