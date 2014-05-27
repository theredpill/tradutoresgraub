
public class Column {
    private String name;
    private String dataType;
    private String constraint;
    private Integer length;
 
    public Column(final String name, final String dataType, final String constraint, final Integer len) {
        this.name = name;
        this.dataType = dataType;
        this.constraint = constraint;
        this.length = len;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getConstraint() {
		return constraint;
	}

	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
    
}