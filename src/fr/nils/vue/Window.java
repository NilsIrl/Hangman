package fr.nils.vue;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Window extends JFrame {
	private final int WIDTH = 900;
	private final int HEIGHT = 700;

	private JPanel gamePane = new GamePanel();
	private JPanel leaderboardPane = new LeaderboardPanel();
	private JPanel rulesPane = new RulesPanel();
	private JPanel aboutPane = new AboutPanel();

	public Window() {
		this.setTitle("Hangman");

		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.initMenuBar();

		this.setVisible(true);
	}

	private void initMenuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem newGameMenuItem = new JMenuItem("New Game");
		newGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		newGameMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(gamePane);
			}
		});
		JMenuItem leaderboardMenuItem = new JMenuItem("Leaderboard");
		leaderboardMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(leaderboardPane);
			}
		});
		JMenuItem rulesMenuItem = new JMenuItem("Rules");
		rulesMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(rulesPane);
			}
		});
		file.add(newGameMenuItem);
		file.add(leaderboardMenuItem);
		file.add(rulesMenuItem);
		JMenuItem aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(aboutPane);
			}
		});
		bar.add(file);
		bar.add(aboutMenuItem);

		this.setJMenuBar(bar);
	}
}
