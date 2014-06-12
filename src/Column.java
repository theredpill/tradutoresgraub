
public class Column {
    private String name;
    private String dataType;
    private String constraint;
    private int lengthInteger;
    private int lengthDecimal;
    private String comment;
    private boolean key;
    private String pic;
 
	public Integer getLengthInteger() {
		return lengthInteger;
	}

	public void setLengthInteger(Integer lengthInteger) {
		this.lengthInteger = lengthInteger;
	}

	public Integer getLengthDecimal() {
		return lengthDecimal;
	}
	
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
		return key;
	}

	public void setKey(boolean key) {
		this.key = key;
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