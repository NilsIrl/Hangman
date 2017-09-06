package fr.nils.vue;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.nils.object.Game;

public class GamePanel extends JPanel implements Observer {
	private JPanel keyboard = new JPanel();
	private final String NUMWORDSTR = "Nombre de mot actuel : ";
	private final String SCORESTR = "Votre score actuel est de : ";
	private JLabel numWord;
	private JLabel score;
	private Game game = new Game();

	public GamePanel() {
		game.addObserver(this);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		
		numWord = new JLabel(NUMWORDSTR + game.score.getNumWord());
		score = new JLabel(SCORESTR + game.score.getScore());
		JPanel infos = new JPanel();
		infos.setLayout(new BorderLayout());
		infos.add(numWord, BorderLayout.NORTH);
		infos.add(score, BorderLayout.SOUTH);
		jPanel.add(infos, BorderLayout.NORTH);
		
		

	}

	@Override
	public void update(Observable o, Object arg) {
		this.numWord.setText(NUMWORDSTR + game.score.getNumWord());
		this.score.setText(SCORESTR + game.score.getScore());
	}
}
