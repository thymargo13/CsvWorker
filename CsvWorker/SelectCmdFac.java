import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

public class SelectCmdFac implements CommandFactory{

	LinkedHashMap<String, ArrayList<String[]>> _dataStack;
    public SelectCmdFac(){
        _dataStack = null;
    }
    public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack){
        this._dataStack = _dataStack;
    }

    public Command create()throws Exception{
        return new SelectCmd(_dataStack);
    }
}