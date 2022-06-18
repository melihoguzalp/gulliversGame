package main;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader("files\\firebase.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			JSONArray playerList = (JSONArray) obj;
			System.out.println(playerList);

			// Iterate over player array
			playerList.forEach(player -> parsePlayerObject((JSONObject) player));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private static void parsePlayerObject(JSONObject player) {
		// Get player object within list
		JSONObject playerObject = (JSONObject) player.get("player");

		// Get player name
		String name = (String) playerObject.get("playerName");
		System.out.print(name + " : ");

		// Get player score
		int score = (int) playerObject.get("playerScore");
		System.out.println(score);

	}
}
