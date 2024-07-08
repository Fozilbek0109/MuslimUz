package uz.coder.muslimuz.model.date;

import com.google.gson.annotations.SerializedName;

public class NamozVaqti {

	@SerializedName("date")
	private String date;

	@SerializedName("times")
	private Times times;

	@SerializedName("weekday")
	private String weekday;

	@SerializedName("region")
	private String region;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setTimes(Times times){
		this.times = times;
	}

	public Times getTimes(){
		return times;
	}

	public void setWeekday(String weekday){
		this.weekday = weekday;
	}

	public String getWeekday(){
		return weekday;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}
}