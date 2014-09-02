import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class myName{

	public static void main(String[] args)throws IOException{
                String textLine = args[0];
		Scanner sc = new Scanner(System.in);
		File file = new File(textLine);
		String name = sc.nextLine();

		System.out.println("Hi there, " + name);
                
		try{
		FileWriter writeFile = new FileWriter(file);
		BufferedWriter out = new BufferedWriter(writeFile);
		out.write("Hi there, " + name + "!\n");
		out.close();
		}

		catch(IOException ex){
		}
	}

}
