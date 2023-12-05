package uz.coder.muslimuz.model;

import java.io.Serializable;
import java.util.List;

public class QuranModel implements Serializable {
	private int totalVerses;
	private String name;
	private String translation;
	private int id;
	private String type;
	private String transliteration;
	private List<VersesItem> verses;

	public void setTotalVerses(int totalVerses){
		this.totalVerses = totalVerses;
	}

	public int getTotalVerses(){
		return totalVerses;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTransliteration(String transliteration){
		this.transliteration = transliteration;
	}

	public String getTransliteration(){
		return transliteration;
	}

	public void setVerses(List<VersesItem> verses){
		this.verses = verses;
	}

	public List<VersesItem> getVerses(){
		return verses;
	}

	@Override
 	public String toString(){
		return 
			"QuranModel{" + 
			"total_verses = '" + totalVerses + '\'' + 
			",name = '" + name + '\'' + 
			",translation = '" + translation + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",transliteration = '" + transliteration + '\'' + 
			",verses = '" + verses + '\'' +
			"}";
		}
}