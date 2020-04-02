package pojo.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ad {

	private @JsonProperty("company") String company;
	private @JsonProperty("url") String url;
	private @JsonProperty("text") String text;
     
	public Ad() {
		
	}
     
    public String getCompany() {
        return company;
    }
 
    public String getUrl() {
        return url;
    }
    public String getText() {
        return text;
    }
   
}