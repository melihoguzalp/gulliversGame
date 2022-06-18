package model;

public class Player {
	// player name;scored points;

	private int id;
	private String playerName;
	private Long playerScore;

	public Player() {

	}

	public Player(int id, String playerName, Long playerScore) {
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

	public Long getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(Long playerScore) {
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", playerScore=" + playerScore + "]";
	}
}
