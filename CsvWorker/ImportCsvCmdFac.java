import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ImportCsvCmdFac implements CommandFactory{

	LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	List<String> _dataIndex;
	
    public  ImportCsvCmdFac(){
        _dataStack = null;
        _dataIndex = null;
    }
    public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack,List<String> _dataIndex){
        this._dataStack = _dataStack;
        this._dataIndex = _dataIndex;
    }

    public Command create()throws Exception{
        return new  ImportCsvCmd(_dataStack, _dataIndex);
    }
}