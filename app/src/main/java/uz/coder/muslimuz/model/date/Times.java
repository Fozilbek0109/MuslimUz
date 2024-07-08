package uz.coder.muslimuz.model.date;

import com.google.gson.annotations.SerializedName;

public class Times{

	@SerializedName("asr")
	private String asr;

	@SerializedName("quyosh")
	private String quyosh;

	@SerializedName("hufton")
	private String hufton;

	@SerializedName("shom_iftor")
	private String shomIftor;

	@SerializedName("tong_saharlik")
	private String tongSaharlik;

	@SerializedName("peshin")
	private String peshin;

	public void setAsr(String asr){
		this.asr = asr;
	}

	public String getAsr(){
		return asr;
	}

	public void setQuyosh(String quyosh){
		this.quyosh = quyosh;
	}

	public String getQuyosh(){
		return quyosh;
	}

	public void setHufton(String hufton){
		this.hufton = hufton;
	}

	public String getHufton(){
		return hufton;
	}

	public void setShomIftor(String shomIftor){
		this.shomIftor = shomIftor;
	}

	public String getShomIftor(){
		return shomIftor;
	}

	public void setTongSaharlik(String tongSaharlik){
		this.tongSaharlik = tongSaharlik;
	}

	public String getTongSaharlik(){
		return tongSaharlik;
	}

	public void setPeshin(String peshin){
		this.peshin = peshin;
	}

	public String getPeshin(){
		return peshin;
	}
}