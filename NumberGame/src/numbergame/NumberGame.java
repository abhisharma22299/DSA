package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static int genratingARandomNumber() {
		Random r = new Random();
		int a=r.nextInt(1, 100);
		//System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		int i = 0;
		System.out.println("Number game(1-100) ");
		int number = genratingARandomNumber();
		System.out.println("note : max attempts 10 ");
		Scanner sc = new Scanner(System.in);
		
		while (i != 10) {
			System.out.println("Enter a number ");
			int enteredNumber = sc.nextInt();

			if (enteredNumber == number) {
				System.out.println("you entered correct number in  " + (i + 1) + " attempts");
				return;
			} else if (enteredNumber < number) {
				System.out.println("you entered lower number enter higher number form that ...... ");

			} else {
				System.out.println("you enter higher number enter lower number from that .. ");
			}
			i++;
		}
		sc.close();
	}
}
