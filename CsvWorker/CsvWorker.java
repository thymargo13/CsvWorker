

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CsvWorker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedHashMap<String, ArrayList<String[]>> _dataStack = new LinkedHashMap<String, ArrayList<String[]>>();
		List<String> _dataIndex = new ArrayList<String>();
		//CsvReader csvRead;
		String [] cmdClass = {"ImportCsvCmdFac","SegmentationCmdFac","ConcatenateCmdFac","SelectCmdFac","ShowDataListCmdFac","ExitCmdFac"};
		Scanner scr = new Scanner(System.in);
		Command cmd;
		while(true){
			
			System.out.println("[0]Import Csv | [1] Sementation | [2] Concatenate | [3] Select Specify Column & Formatting |"+
								"[4]Show Data Imported | [5] Exit");
			int option = scr.nextInt();
			
			if(option < cmdClass.length){
				try{
					CommandFactory cf = (CommandFactory)Class.forName(cmdClass[option]).newInstance();
					cmd = (Command)cf.create();
					cmd.setData(_dataStack);
					cmd.setDataIndex(_dataIndex);
					cmd.execute();
				}catch(Exception e){
					e.printStackTrace();
				}
			}else{
				System.out.println("Command Not Found");
			}
		//System.out.println(data.size());
		// for (String[] d:data){
		// 	System.out.println(d[0]);
		// }
		}
	}
}
