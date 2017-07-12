import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
     JFrame jframe = new JFrame();
     PlayGround playGround = new PlayGround();
     jframe.setBounds(10, 10, 700, 580);
     jframe.setBackground(Color.black);
     jframe.setTitle("Brick Breaker");
     jframe.setResizable(false);
     jframe.add(playGround);
     jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jframe.setVisible(true);
	}

}
