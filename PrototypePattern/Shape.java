package PrototypePattern;

public abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	abstract void draw();
	public String getType(){
		return type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//overriding
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();  //copy and return the object
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}

