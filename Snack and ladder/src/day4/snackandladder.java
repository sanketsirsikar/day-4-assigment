package day4;

public class snackandladder {
	public static void main(String[] args) {
		
		int position = 0;
		  while (position < 100) {
			  int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
	            System.out.println("diceNumber is : " + diceNumber);
	            
	            int option = (int) Math.floor(Math.random() * 10) % 3;
	            System.out.println("selected player option : " + option);
	            
	            switch (option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("Ladder");
                    System.out.println("position for the player after the ladder is : " + position);
                    break;
                    
                case 2:
                    position = position - diceNumber;
                    System.out.println("Snack");
                    if (position < 0) {
                        position = 0;
                        System.out.println("Player restart from zero: ");
                    }
                    System.out.println("position for the player after the Snake is : " + position);
                    break;
	            
                default:
                    System.out.println("No play");
			}
		
}
}
}
