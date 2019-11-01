

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader{
	private String csv_path;
	BufferedReader br; 
	ArrayList<String[]> data;
	ArrayList<String> data2;
	String row;
	int rec_count = 0;
	String separator = ",";
	
	public CsvReader(String path) throws IOException{
		this.csv_path = path;
		data = new ArrayList<String[]>();
		data2 = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader(csv_path));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<String[]> read_file() throws IOException{
		while((row = br.readLine())!=null){
			String[]record = row.split(separator);
			data.add(record);
		}
		return data;
	}
}
