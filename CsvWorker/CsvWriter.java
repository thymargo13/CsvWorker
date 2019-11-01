import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWriter {
	String output_path;
	BufferedWriter writer;
	ArrayList<String[]> raw;
	
	public CsvWriter(String output_path) throws IOException{
		this.output_path = output_path;
		writer = new BufferedWriter(new FileWriter(output_path));
	}
	
	public CsvWriter(){}
	
	public void setBufferedWriter(BufferedWriter w){
		writer = w;
	}
	public void writeToBuffer(String data) throws IOException{
		writer.write(data);
	}
	
	public void end() throws IOException{
		writer.close();
		System.out.println("Finished: "+ output_path);
	}
	
	public String toString(){
		return "OUTPUT_PATH: "+ output_path;
	}
}
