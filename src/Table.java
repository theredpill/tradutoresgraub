import java.util.ArrayList;
import java.util.List;


public class Table {

    private String name;
    private int length;
    private List<Column> columns;
 
    public Table() {
    	this.columns = new ArrayList<Column>();
    }
    
	public String getName() {
		return name;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void addColumn(Column column){
		this.columns.add(column);
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}
    
    
}
