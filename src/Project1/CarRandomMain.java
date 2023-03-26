public class CarRandomMain {

	public static void main(String[] args) {

		System.out.print("| ");
		double randombox;

		for (int i = 1; i <= 9; i++) {
			randombox = (int) (Math.random() * (100 - 1 + 1) + 1);

			if (1 <= randombox && randombox <= 1) {
				System.out.print("**자동차 키링**");
			}

			else if (2 <= randombox && randombox <= 3) {
				System.out.print("*스타벅스 텀블러*");
			} else if (4 <= randombox && randombox <= 7) {
				System.out.print("*스타벅스 커피*");
			} else {
				System.out.print("꽝");
			}

			System.out.print(" | ");
		}
		randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
		if (1 <= randombox && randombox <= 5)
			System.out.print("**스타벅스 텀블러**");
		else if (6 <= randombox && randombox <= 100)
			System.out.print("*스타벅스 커피*");
		System.out.print(" |");
	}

}