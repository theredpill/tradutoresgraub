import java.util.ArrayList;
import java.util.List;


public class Table {

    private String name;
    private List<Column> columns;
 
    public Table() {
    	this.columns = new ArrayList<Column>();
    }
    
    public Table(final String name, List<Column> cols) {
        this.name = name;
        //Collections.sort(cols);
        this.columns = cols;
    }

	public String getName() {
		return name;
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
