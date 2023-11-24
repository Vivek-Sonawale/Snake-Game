package SnakeGame;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
	int dots;
	Image apple;
	Image dot;
	Image head;

	Board() {
		this.setBackground(Color.BLACK); // setBackGround to Black
		this.setFocusable(true);
		loadimages();
		initgame();

	}

	public void loadimages() {
		ImageIcon i1 = new ImageIcon(
				ClassLoader.getSystemResource("SnakeGame/icons/apple.png"));
		apple = i1.getImage();

		ImageIcon i2 = new ImageIcon(
				ClassLoader.getSystemResource("SnakeGame/icons/dot.png"));
		dot = i2.getImage();

		ImageIcon i3 = new ImageIcon(
				ClassLoader.getSystemResource("SnakeGame/icons/head.png"));
		head = i3.getImage();

	}

	public void initgame() {
		dots = 3;
		for (int i = 0; i < dots; i++) {

		}
	}
}
