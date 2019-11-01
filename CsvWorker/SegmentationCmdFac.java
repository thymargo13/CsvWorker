import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

public class SegmentationCmdFac implements CommandFactory{

	LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	List<String> _dataIndex;
	
    public SegmentationCmdFac(){
        _dataStack = null;
    }
    public void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack){
        this._dataStack = _dataStack;
    }

    public Command create()throws Exception{
        return new SegmentationCmd(_dataStack, _dataIndex);
    }
}