package uz.coder.muslimuz.model;

import java.io.Serializable;

public class VersesItem implements Serializable {
	private String translation;
	private int id;
	private String text;

	public VersesItem(String translation, int id, String text) {
		this.translation = translation;
		this.id = id;
		this.text = text;
	}

	public void setTranslation(String translation){
		this.translation = translation;
	}

	public String getTranslation(){
		return translation;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"VersesItem{" + 
			"translation = '" + translation + '\'' + 
			",id = '" + id + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}

}
