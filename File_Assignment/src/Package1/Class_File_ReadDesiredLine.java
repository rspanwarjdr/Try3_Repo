package Package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Class_File_ReadDesiredLine {
	
	public String readLine(int i) throws IOException {
		File f = new File("C:\\Users\\r.singh.panwar\\Desktop\\Bench Activities\\Practise.txt");
    	FileReader fr = new FileReader(f);
    	BufferedReader b = new BufferedReader(fr);
    	String s;
    	int count = 0;
    	while ((s=b.readLine())!=null) {
    		count++;
    		if (count==i) {
    			break;
    		}
    	}
    	b.close();
	    return s;
	}
	
    public static void main(String[] args) throws IOException {
		
    	Class_File_ReadDesiredLine c = new Class_File_ReadDesiredLine();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the line number to be read: ");
    	int n = s.nextInt();
    	String s1 = c.readLine(n);
    	System.out.println(s1);
    	s.close();
    }
}	
	

