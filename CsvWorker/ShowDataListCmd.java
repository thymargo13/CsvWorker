import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ShowDataListCmd extends Command {
	private LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	
	public ShowDataListCmd(LinkedHashMap<String, ArrayList<String[]>> _dataStack) {
		// TODO Auto-generated constructor stub
		this._dataStack = _dataStack;
	}

	@Override
	public void execute() {
		try{
            if(!_dataStack.isEmpty()){
            	System.out.println("Size of Data Stack: "+_dataStack.size());
            	_dataStack.forEach((k,v) -> System.out.println(k+":"+v.size()));
            }else{
            	System.out.println("It is Empty!");
            }
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
		
	}
	
}