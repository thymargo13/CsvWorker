import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

public class ConcatenateCmd extends Command {
	private LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	private List<String> _dataIndex;
	
	private String[] options = {"ColumnConcatnateCmdFac", "FileConcatnateCmdFac" };
	
	public ConcatenateCmd(LinkedHashMap<String, ArrayList<String[]>> _dataStack, List<String> _dataIndex) {
		// TODO Auto-generated constructor stub
		this._dataStack = _dataStack;
		this._dataIndex = _dataIndex;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("[0] Column Concatnate, [1] File Concatnate");
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