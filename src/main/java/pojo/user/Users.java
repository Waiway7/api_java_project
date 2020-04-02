package pojo.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users{
	private @JsonProperty("data")Data data;
	private @JsonProperty("ad")Ad ad;
	Users(){};
	public Data getData(){
		return data;
	}
	public Ad getAd(){
		return ad;
	}
	
}