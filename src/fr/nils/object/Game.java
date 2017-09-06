package fr.nils.object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Observable;

public class Game extends Observable implements ActionListener {
	private String wordRevealed;
	private String wordShowed;
	private String wordNoAccent; //
	private final String DICTIONNARYFILE = "dictionnaire.txt";
	private final int WORDNUMBER = 336531;
	private final char accentTable[][] = { { 'é', 'à', 'è', 'ù', 'â', 'ê', 'î', 'ô', 'û', 'ç', 'ë', 'ï', 'ü' },
			{ 'e', 'a', 'e', 'u', 'a', 'e', 'i', 'o', 'u', 'c', 'e', 'i', 'u' } };
	private LineNumberReader lnr;
	public Score score = new Score();

	public Game() {

	}

	private void changeWord() {
		int randomNum = (int) (Math.random() * WORDNUMBER);
		try {
			lnr = new LineNumberReader(new BufferedReader(new FileReader(new File(DICTIONNARYFILE))));
			for (int x = 0; x < randomNum; x++) {
				lnr.readLine();
			}
			wordRevealed = lnr.readLine();
			lnr.close();
			System.out.println("number :" + randomNum + ", word :" + lnr); // To remove (debug)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}
		wordNoAccent = wordRevealed;
		for (int y = 0; y < accentTable[0].length; y++) {
			wordNoAccent = wordNoAccent.replace(accentTable[0][y], accentTable[1][y]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
