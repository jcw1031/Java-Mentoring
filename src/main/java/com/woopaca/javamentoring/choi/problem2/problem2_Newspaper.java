package com.woopaca.javamentoring.choi.problem2;

public class problem2_Newspaper extends problem2_Item {
private String local;
	
	public problem2_Newspaper(String title, String author, String publicationDate, String local) {
		super(title,author,publicationDate);
		this.local=local;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(", 지역: "+local);
	}

}