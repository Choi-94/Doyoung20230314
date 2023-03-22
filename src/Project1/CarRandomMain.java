package Project1;

public class CarRandomMain {

	public static void main(String[] args) {

		System.out.print("| ");

		double randombox;
		for (int i = 1; i <= 1; i++) {
			int p = 0;
			randombox = (int) (Math.random() * (100 - 1 + 1) + 1);

			if (1 <= randombox && randombox <= 3) {
				System.out.print("**키링**");
			} else if (4 <= randombox && randombox <= 13) {
				System.out.print("*커피기프티콘*");
			} else {
				System.out.print("꽝");
				p = p++;
			}
			System.out.print(" | ");
		}
	}
}