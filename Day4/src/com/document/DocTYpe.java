package com.document;

public enum DocTYpe {

	GENERAL("High"), DEPARTMENTAL("Medium") , PERSONAL("Low") ;
	String type;

	DocTYpe(String string) {
		// TODO Auto-generated constructor stub
		this.type= string;
	}
	
	public String getDoctype() {
		return this.type;
	}
	
}
