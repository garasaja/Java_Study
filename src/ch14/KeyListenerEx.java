package ch14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel[] keyMessage;
	
	public KeyListenerEx() {
		setTitle("gd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // 배경색 보이도록 불투명 설정
			keyMessage[i].setBackground(Color.yellow); 
		}
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("keyPressed");
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("keyTyped");
		}
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
