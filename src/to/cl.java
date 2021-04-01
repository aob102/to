package to;

import java.util.Scanner;

public class cl {

	private int n = 0;
	private int r = (int) (Math.random() * 101);
	private int i = 0;

	public void game() {

		do {

			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			if (n > r) {
				System.out.println("too big, try again");

			} else if (n<r){
				System.out.println("too small, try again!!");
			}

			i++;

		} while (n != r);
		System.out.println("you win");
		System.out.println(i);

	}

}
