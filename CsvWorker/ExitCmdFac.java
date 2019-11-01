import java.util.ArrayList;
import java.util.LinkedHashMap;


public class ExitCmdFac implements CommandFactory{

	LinkedHashMap<String, ArrayList<String[]>> _dataStack;
    public ExitCmdFac(){
        _dataStack = null;
    }
    public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack){
        this._dataStack = _dataStack;
    }

    public Command create()throws Exception{
        return new ExitCmd(_dataStack);
    }
}