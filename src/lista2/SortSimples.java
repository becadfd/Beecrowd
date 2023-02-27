package lista2;

import java.io.IOException;
import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		if (a < b && a < c) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else if (b < c) {
			System.out.println(b);
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			}
		} else {
			System.out.println(c);
			if (a < b) {
				System.out.println(a);
				System.out.println(b);
			} else {
				System.out.println(b);
				System.out.println(a);
			}
		}

		System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
