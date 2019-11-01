import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;


public class SegmentationCmd extends Command {
	private LinkedHashMap<String, ArrayList<String[]>> _dataStack;
	private List<String> _dataIndex;
	Scanner scr = new Scanner(System.in);
	private int segmentSize;
	private CsvWriter w;
	
	
	public SegmentationCmd(LinkedHashMap<String, ArrayList<String[]>> _dataStack, List<String> _dataIndex) {
		// TODO Auto-generated constructor stub
		this._dataStack = _dataStack;
		this._dataIndex = _dataIndex;
	}

	@Override
	public void execute() {
		try{
			//select the file for segmentation
			System.out.println("Which file?");
			for(String i:_dataIndex){
				System.out.println(_dataIndex.indexOf(i)+":"+ i);
			}
			int choice = scr.nextInt();
			
			if(choice < _dataIndex.size()){
				// get the record back
				ArrayList<String[]> dataSet = _dataStack.get(_dataIndex.get(choice));
				System.out.println("SegmentSize?");
				segmentSize = scr.nextInt();
				
				String folder = "csv_out\\"+_dataIndex.get(choice);
				File newFolder = new File(folder);
				boolean created = newFolder.mkdir();
				if(!created){
					System.out.println("Folder not created.");
				}
				if(created){
					int fileNum = dataSet.size()/segmentSize +1;
					int indexing = 0;
					//System.out.println("*****FILENUM: "+fileNum);
					for(int i = 0; i < fileNum; i++){
						String fileName = i+"_"+_dataIndex.get(choice);
						w = new CsvWriter(folder+"\\"+fileName);
						//System.out.println("****DataSet Size: "+ dataSet.size());
						//System.out.println("****Indexing: "+indexing);
						for(int id = indexing; id < dataSet.size();id++){
							//System.out.println("****Indexing:(writing) "+indexing);
							//.... write into file
							for(int r=0; r< dataSet.get(indexing).length;r++){
								w.writeToBuffer(dataSet.get(indexing)[r]);		
							}
							w.writeToBuffer("\n");
							indexing++;
							if(id%segmentSize == segmentSize-1 ||indexing == dataSet.size()){
								//System.out.println("****Indexing(CLOSE): "+indexing);
								w.end();
								break;
							}
						}	
					}
					System.out.println("Segmentation finished (Total number of files): "+ fileNum);
				}	
			}

        }catch(Exception e){
            System.out.println("*** ");
            e.printStackTrace();
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
		this._dataIndex = _dataIndex;
	}
	
}