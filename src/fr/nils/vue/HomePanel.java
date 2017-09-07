package fr.nils.vue;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class HomePanel extends DefaultPanel {
	private final Font titleFont = new Font("Arial", Font.BOLD, 20);
	public HomePanel() {
		JLabel title = new JLabel("Bienvenue dans le jeu du PENDU");
		title.setFont(titleFont);
		System.out.println();
		title.setBounds(250, 0, 900, 20);
		this.add(title);
		
		JLabel img = new JLabel("", new ImageIcon("home.jpg"), JLabel.CENTER);
		img.setBounds(0, 0, 800, 500);
		this.add(img);
		
		JTextArea area = new JTextArea("");
	}
}
