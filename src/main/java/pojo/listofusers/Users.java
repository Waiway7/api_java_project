package pojo.listofusers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import pojo.user.Ad;
import pojo.user.Data;

public class Users{
	private @JsonProperty("page") int page;
	private @JsonProperty("per_page") int perPage;
	private @JsonProperty("total") int total;
	private @JsonProperty("total_pages") String totalPages;

	private @JsonProperty("data")Data[] data;
	private @JsonProperty("ad")Ad ad;
	Users(){};
	public Data[] getData(){
		return data;
	}
	public Ad getAd(){
		return ad;
	}
	
}