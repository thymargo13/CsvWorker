import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

public class SelectCmd extends Command {
	private LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	
	public SelectCmd(LinkedHashMap<String, ArrayList<String[]>> _dataStack) {
		// TODO Auto-generated constructor stub
		this._dataStack = _dataStack;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void setDataIndex(List<String> _dataIndex) {
		// TODO Auto-generated method stub
		
	}
	
}