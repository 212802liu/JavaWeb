package example01;

import java.io.Serializable;

public class book implements Serializable{
	private static final long serialVersionUID=1L;
	private String name;
	private String id;
	public book(String id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	public book() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
