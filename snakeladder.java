package snakeladder;

import java.util.Random;

class Game{
	int position = 0;
	public static int Rolldice()
	{
		Random r = new Random();
		int num = r.nextInt(6)+1;
		return num;
	}
}
public class snakeladder {

	public static void main(String[] args) {
		Game player1 = new Game();
		System.out.println(player1.Rolldice());

	}

}
