package model;

public class Player {
	// player name;scored points;

	private int id;
	private String playerName;
	private int playerScore;

	public Player() {

	}

	public Player(int id, String playerName, int playerScore) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.playerScore = playerScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", playerScore=" + playerScore + "]";
	}
}
