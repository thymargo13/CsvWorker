import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Stack;

public class ShowDataListCmdFac implements CommandFactory{

	LinkedHashMap<String, ArrayList<String[]>> _dataStack;
    public ShowDataListCmdFac(){
        _dataStack = null;
    }
    public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack){
        this._dataStack = _dataStack;
    }

    public Command create()throws Exception{
        return new ShowDataListCmd(_dataStack);
    }
}