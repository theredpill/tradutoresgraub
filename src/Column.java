
public class Column {
    private String name;
    private String dataType;
    private String constraint;
    private int lengthInteger;
    private int lengthDecimal;
    private boolean isKey;
 
	public Integer getLengthInteger() {
		return lengthInteger;
	}

	public void setLengthInteger(Integer lengthInteger) {
		this.lengthInteger = lengthInteger;
	}

	public Integer getLengthDecimal() {
		return lengthDecimal;
	}

	public void setLengthDecimal(Integer lengthDecimal) {
		this.lengthDecimal = lengthDecimal;
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
	
	public boolean isKey() {
		return isKey;
	}

	public void setKey(boolean isKey) {
		this.isKey = isKey;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Column other = (Column) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}