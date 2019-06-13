package Package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Class_File_ReadDesiredLinebwrange {
	
	public void readLines(int i, int j) throws IOException {
		File f = new File("C:\\Users\\r.singh.panwar\\Desktop\\Bench Activities\\Practise.txt");
    	FileReader fr = new FileReader(f);
    	BufferedReader b = new BufferedReader(fr);
    	String s;
    	int count = 0;
    	while ((s=b.readLine())!=null) {
    		count++;
    		if ((count>=i) && (count<=j)) {
    		     System.out.println(s);
    		}
    	}
    	b.close();
	}
    
	public static void main(String[] args) throws IOException{
		
    	Class_File_ReadDesiredLinebwrange c = new Class_File_ReadDesiredLinebwrange();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the line number from to read: ");
    	int m = s.nextInt();
    	System.out.print("Enter the line number till read: ");
    	int n = s.nextInt();
    	c.readLines(m,n);
    	s.close();
    	
    }
    
}	
	

