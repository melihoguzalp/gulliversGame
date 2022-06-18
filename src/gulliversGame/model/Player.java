package gulliversGame.model;

public class Player {
	// player name;nickname;number;team name;position;scored points;rebounds;assists

	private int id;
	private String playerName;
	private int playerScore;
	
	public Player() {
		
	}
	
	public Player(String playerName, String nickName, String number) {

		this.playerName = playerName;
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
	
	
}
