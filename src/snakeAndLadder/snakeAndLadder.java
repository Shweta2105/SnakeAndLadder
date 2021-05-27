package snakeAndLadder;

public class snakeAndLadder {
	public static void main(String[] args) {
		int player;
		int position = 0;
		
		int dice = (1 + (int)(Math.random() * 6));
		System.out.println(+dice);
		
		int option = (int)((Math.random() * 10) % 3);
		
		
		System.out.println(+ option);
		
		switch(option)
		{
		case 1:
			position = position +dice;
			System.out.println("Current position is ladder :"+ position);
			break;
			
		case 2:
			if(position > dice) {
				position = position - dice;
				System.out.println("Current position is snake :"+position);
				
			}
			break;
		default:
			position = position;
			System.out.println("Current position is  :"+position);
		}
		System.out.println(+dice);
	}

}
