import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Enter the name of the file");
		String machine = keyboard.nextLine();
		//open file
		File file = new File(machine);
		if(!file.exists()){
			System.out.println("The file does not exist");
			System.exit(0);
		}
	    Scanner input = new Scanner(file);
	    //read file
		while(input.hasNext()){
			int number = input.nextInt();
			System.out.println(number);
		}//end of openFile
		
		input.close();
	}
	
}
