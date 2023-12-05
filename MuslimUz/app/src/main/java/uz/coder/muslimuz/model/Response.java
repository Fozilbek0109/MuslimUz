package uz.coder.muslimuz.model;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("translation")
	private String translation;

	@SerializedName("id")
	private int id;

	@SerializedName("text")
	private String text;

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
			"Response{" + 
			"translation = '" + translation + '\'' + 
			",id = '" + id + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}