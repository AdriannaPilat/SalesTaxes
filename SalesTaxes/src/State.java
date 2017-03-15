

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class State {
	private static ArrayList<String> states = new ArrayList<>();
	
	State() {
		File file = new File("src/states.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       states.add(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> pobierzStany() {
		return states;
	}
}
