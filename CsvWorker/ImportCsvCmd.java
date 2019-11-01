import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;


public class ImportCsvCmd extends Command {
	private LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	private Scanner scr = new Scanner(System.in);
	private List<String> _dataIndex;
	private ArrayList<String[]> data;
	public ImportCsvCmd(LinkedHashMap<String, ArrayList<String[]>> _dataStack, List<String> _dataIndex) {
		// TODO Auto-generated constructor stub
		this._dataIndex = _dataIndex;
		this._dataStack = _dataStack;
	}

	@Override
	public void execute() {
        try{
            System.out.println("FILE PATH: ");
            String filePath = scr.nextLine();
            CsvReader csvRead = new CsvReader("csv_raw\\"+filePath);
            data = csvRead.read_file();
            _dataStack.put(filePath,data);
            _dataIndex.add(filePath);
            System.out.println("Data read with number of record: " + data.size());    
	    }catch(Exception e){
            System.out.println("*** " + e.getMessage());
        }
    }

	@Override
	public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack) {
		// TODO Auto-generated method stub
		this._dataStack = _dataStack;
	}

	@Override
	public void setDataIndex(List<String> _dataIndex) {
		// TODO Auto-generated method stub
		this._dataIndex = _dataIndex;
	}
	
}