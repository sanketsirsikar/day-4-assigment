package day4;

public class snackandladder {
	public static void main(String[] args) {
		
		int WINNING_POSITION = 100;
		int position = 0;
		while (position < WINNING_POSITION) {
			 int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
	            System.out.println("DiceNumber is : " + diceNumber);
	            int option = (int) Math.floor(Math.random() * 10) % 2;
	            System.out.println("Selected player option : " + option);
	            

	            switch (option) {
	                case 1:
	                    position = diceNumber + position;
	                    System.out.println("Ladder");
	                    if (position > 100) {
	                        position = 100;
	                        position = position - diceNumber;
	                    }
	                    System.out.println("Position for the player after the ladder is : " + position);
	                    break;
	                case 2:
	                    position = position - diceNumber;
	                    System.out.println("Snack");
	                    if (position < 0) {
	                        position = 0;
	                        System.out.println("Player restart from zero: ");
	                    }
	                    System.out.println("Position for the player after the Snake is : " + position);
	                    break;
	                default:
	                    System.out.println("No play");

			}
		
}
}
}
