package snakeAndLadder;

public class snakeAndLadder {
	public static void main(String[] args) {
		int player;
		int position = 0;

		
		
		while (position < 100) {
			int dice = (1 + (int) (Math.random() * 6));
			int option = (int) ((Math.random() * 10) % 3);

			

			switch (option) {
			case 1:
				position = position + dice;
				System.out.println("Current position is ladder :" + position);
				break;

			case 2:
				if (position > dice) {
					position = position - dice;
					System.out.println("Current position is snake :" + position);

				} else if (position < dice) {
					position = 0;
				}
				break;
			default:
				position = position;
				System.out.println("Current position is  :" + position);
			}
			System.out.println(+option);
			System.out.println(+dice);
		}
	}

}
