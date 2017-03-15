

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		State state = new State();
		ArrayList<String> stany = state.pobierzStany();
		for(String s : stany) {
			System.out.println(s);
		}
	}

}
