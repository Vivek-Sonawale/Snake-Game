package SnakeGame;
import javax.swing.*;//java extended package

import java.awt.*;

public class Snakegame extends JFrame {

	// created a constructor
	Snakegame() {
		
		setTitle("Snake Game");
		add(new Board());//adding a component in JFrame
		pack();//use to restart the JFrame
		
		setSize(400, 450);
		setLocationRelativeTo(null);//this will open the JFrame at the center of the screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String args[]) {
		new Snakegame();
	}
}
