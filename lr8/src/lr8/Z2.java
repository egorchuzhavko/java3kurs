package lr8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Z2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try (FileWriter writer = new FileWriter("f.txt",false)){
			for(int i =0;i<10;i++) {
				System.out.print("¬ведите число: ");
				int ch=in.nextInt();
				writer.write(Integer.toString(ch));
				writer.write(System.lineSeparator());
			}
		}
		catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
		ArrayList<Integer> listofint=new ArrayList<Integer>();
		int sum=0;
		try (FileReader reader = new FileReader("f.txt")){
			Scanner scan=new Scanner(reader);
			while(scan.hasNextLine()) {
				listofint.add(Integer.parseInt(scan.nextLine()));
				System.out.println(listofint.get(listofint.size()-1));
			}
			for(int ch : listofint)
				sum+=ch;
			System.out.println("—реднее число = " + (double)sum/listofint.size());
		}
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
	}

}
