package snakeladder;

import java.util.Random;

class Game{
	int position = 0;
}
	
public class snakeladder {

	public static void main(String[] args) {
		int turns = 0;
		Game player1 = new Game();
		while(player1.position<100) {
		int dicenumber= dice();
		int option= condition();
		int move = dicenumber*option;
		if(player1.position+move>100) {
			continue;
		}
		player1.position=player1.position+move;
		if(player1.position<0) {
			player1.position=0;
		}
		turns++;
	}
		System.out.println("position of player1 is : " +player1.position);
		System.out.println("number of turns of dice are :" +turns);
		
	}
	
		private static int dice() {
		Random r = new Random();
		int num = r.nextInt(6)+1;
		return num;
	}
		private static int condition() {
			Random r = new Random();
			int flag = r.nextInt(3);
			int temp;
			if(flag==0)
			{
				temp=0;
				System.out.println("no play");
			}
			else if(flag==1) {
				temp=1;
				System.out.println("ladder");
			}
			else {
				temp=-1;
				System.out.println("snake");
			}
			return temp;
			
			
		}
}

