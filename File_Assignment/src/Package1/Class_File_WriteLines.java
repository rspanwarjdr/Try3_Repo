package Package1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Class_File_WriteLines {
	
	public void writeLines(int n) throws IOException {
		
		File f = new File("C:\\Users\\r.singh.panwar\\Desktop\\Bench Activities\\Practise3.txt");
    	FileWriter fw = new FileWriter(f);
    	BufferedWriter b = new BufferedWriter(fw);
    	int count = 1;
    	while(count<=n) {
    	 	b.write("This is line Number : " + count);
    	    b.newLine();
    	    count++;
    	}
    	b.close();
	}	
	
	public static void main(String[] args) throws IOException{
		
    	Class_File_WriteLines c = new Class_File_WriteLines();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the number of lines to be write in the file : ");
    	int i = s.nextInt();
    	c.writeLines(i);
    	s.close();
    }
}

