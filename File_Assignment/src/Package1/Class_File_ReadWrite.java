package Package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class_File_ReadWrite {
    public static void main(String[] args) throws IOException{
		
    	File f1 = new File("C:\\Users\\r.singh.panwar\\Desktop\\Bench Activities\\Practise.txt");
    	FileReader fr = new FileReader(f1);
    	BufferedReader b1 = new BufferedReader(fr);
    	
    	File f2 = new File("C:\\Users\\r.singh.panwar\\Desktop\\Bench Activities\\Practise1.txt");
    	FileWriter fw = new FileWriter(f2,true);
    	BufferedWriter b2 = new BufferedWriter(fw);
    	
    	String s;
    	while ((s=b1.readLine())!=null) {
    		b2.write(s);
        	b2.newLine();
    	}
    	b2.close();
    	b1.close();
    }
}	
	

