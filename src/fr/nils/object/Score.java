package fr.nils.object;

public class Score {
	private int numWord;
	private int score;
	private String name;

	public Score() {
		this.numWord = 0;
		this.score = 0;
		this.name = "";
	}

	public int getScore() {
		return this.score;
	}

	public int getNumWord() {
		return this.numWord;
	}

	public String getName() {
		return this.name;
	}

	public void addNumWord() {
		this.numWord++;
	}

	public boolean changeScore(int error) {
		switch (error) {
		case 0:
			this.addScore(100);
			break;
		case 1:
			this.addScore(50);
			break;
		case 2:
			this.addScore(35);
			break;
		case 3:
			this.addScore(25);
			break;
		case 4:
			this.addScore(15);
			break;
		case 5:
			this.addScore(10);
			break;
		case 6:
			this.addScore(5);
			break;
		default:
			return false;
		}
		return true;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void addScore(int score) {
		this.score += score;
	}
}
