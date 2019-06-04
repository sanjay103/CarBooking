
package com.ds.supercar.model.vehicle;

public class FualType {
	private int fualtypeid;
	private String faultype_name;
	private String faultype_desc;
	
	public FualType() {
		
	}

	public FualType(int fualtypeid, String faultype_name, String faultype_desc) {
		super();
		this.fualtypeid = fualtypeid;
		this.faultype_name = faultype_name;
		this.faultype_desc = faultype_desc;
	}

	public int getFualtypeid() {
		return fualtypeid;
	}

	public void setFualtypeid(int fualtypeid) {
		this.fualtypeid = fualtypeid;
	}

	public String getFaultype_name() {
		return faultype_name;
	}

	public void setFaultype_name(String faultype_name) {
		this.faultype_name = faultype_name;
	}

	public String getFaultype_desc() {
		return faultype_desc;
	}

	public void setFaultype_desc(String faultype_desc) {
		this.faultype_desc = faultype_desc;
	}


}
