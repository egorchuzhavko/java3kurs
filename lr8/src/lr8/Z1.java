package lr8;

import java.io.*;
import java.util.Scanner;

public class Z1 {

	public static void main(String[] args) {
		try (FileWriter writerr = new FileWriter("file.txt",false)){
			writerr.write("Меня зовут Егор, я учусь на 3 курсе");
		}
		catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
		File myFile = new File("file.txt");
		System.out.println("File name: "+myFile.getName());
		System.out.println("File size: "+myFile.length());
		System.out.println("Parent folder: "+myFile.getParent());
		
		try (FileReader reader = new FileReader("file.txt")){
			Scanner scan=new Scanner(reader);
			while(scan.hasNextLine())
				System.out.println(scan.nextLine());
		}
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
	}

}
