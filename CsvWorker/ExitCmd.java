import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;

public class ExitCmd extends Command {
	private LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	
	public ExitCmd(LinkedHashMap<String, ArrayList<String[]>> _dataStack) {
		// TODO Auto-generated constructor stub
		this._dataStack = _dataStack;
	}

	@Override
	public void execute() {
		try{
			_dataStack.clear();
			System.out.println("Leaving the System...");
			System.exit(0);
		}catch(Exception e){
			System.out.println("*** "+ e.getMessage());
		}
		
	}

	@Override
	public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack) {
		this._dataStack = _dataStack;
	}

	

	@Override
	public void setDataIndex(List<String> _dataIndex) {
		// TODO Auto-generated method stub
		
	}
}