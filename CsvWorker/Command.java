import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

public abstract class Command{
    public abstract void execute();
	public abstract void setData(LinkedHashMap<String, ArrayList<String[]>> _dataStack);
	public abstract void setDataIndex(List<String> _dataIndex);
}