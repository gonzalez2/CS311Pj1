import java.io.File;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter the name of the file");
		String machine = scanner.nextLine();
		File file = new File(machine);
		if(!file.exists()){
			System.out.println("The file does not exist");
			System.exit(0);
		}
	}

}
