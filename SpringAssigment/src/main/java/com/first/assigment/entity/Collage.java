package com.first.assigment.entity;

public class Collage {
	
	private String collageName;
	
	private String collageAdd;

	public Collage() {
		// TODO Auto-generated constructor stub
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageAdd() {
		return collageAdd;
	}

	public void setCollageAdd(String collageAdd) {
		this.collageAdd = collageAdd;
	}

	@Override
	public String toString() {
		return "Collage [collageName=" + collageName + ", collageAdd=" + collageAdd + "]";
	}
	
	
	

}
