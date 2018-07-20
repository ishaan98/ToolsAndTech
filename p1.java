import java.util.*;

class Game{

	void show(){
		System.out.println("playing football");
	}
	
	class Play{
	
		void display(){
			System.out.println("Mobile Game");
		}
	
	}
	
	void showGame(){
		Play p = new Play();
		p.display();
	}
	
}

class Cricket{

	public static void main(String args[]){
		Game g = new Game();
		g.show();
		g.showGame();
		Game.Play p = g.new Play();
		p.display();
	}

}
