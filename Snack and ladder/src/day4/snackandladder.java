package day4;

public class snackandladder {
	public static void main(String[] args) {
		
		int position =0;
		int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("dice number is " + diceNumber);
		
		int options = (int) Math.floor(Math.random() *10 ) % 3 ;
		System.out.println("player option is"  + options);
		 
		switch (options) {
		case 1 : 
			position  = diceNumber + position;
			System.out.println("ladder");
			System.out.println("position of the playar after the ladder" + position);
		
		case 2 :
			position = position - diceNumber;
			System.out.println("snack");
			System.out.println("position of the player after the snack" + position);
		default :
			System.out.println("no play");
			}
		
}
}
