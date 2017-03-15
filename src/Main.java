import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {    
        ArrayList<Category> categories = new ArrayList<Category>();
        File file = new File("Kategorie.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       states.add(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
