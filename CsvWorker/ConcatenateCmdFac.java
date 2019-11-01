import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

public class ConcatenateCmdFac implements CommandFactory{

	LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	List<String> _dataIndex;
	
    public ConcatenateCmdFac(){
        _dataStack = null;
    }
    public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack){
        this._dataStack = _dataStack;
    }

    public Command create()throws Exception{
        return new ConcatenateCmd(_dataStack, _dataIndex);
    }
}