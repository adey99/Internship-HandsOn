import java.io.*;
import java.util.*;
public class FileManager {
	public static File createFile(){
	    try{
    		File file = new File("visitors.txt");
    		file.createNewFile();  
    		return file;
	    }
	    catch(IOException e){
	        System.out.println(e.getMessage());
	        return null;
	    }
	}


	static public void writeFile(File f, String record){
	    try{
    		if(!f.exists()) {
                f = createFile();
             } 
             FileWriter fileWritter = new FileWriter(f.getName(),true);
             BufferedWriter bw = new BufferedWriter(fileWritter);
             bw.write(record);
             bw.close();
	    }
	    catch(IOException e){
	        System.out.println(e.getMessage());
	    }
	}


	static public String[] readFile(File f){
	    try{
    		Scanner sc = new Scanner(f); 
    		String txt = "";
    		while(sc.hasNextLine()) {
    			txt = txt + sc.nextLine();
    		}
    
    
    		return txt.split(";");
	    }
	    catch(IOException e){
	        System.out.println(e.getMessage());
	        return null;
	    }
	}
}