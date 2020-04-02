package pojo.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	private @JsonProperty("email")String email;
	private @JsonProperty("id")int id;
	private @JsonProperty("first_name")String firstName;
	private @JsonProperty("last_name")String lastName;
	private @JsonProperty("avatar")String avatar;
     
	public Data() {
		
	}
     
    public Data(int id, String email, String first_name, String last_name, String avatar) {
		this.email = email;
		this.firstName = first_name;
		this.id = id;
		this.lastName = last_name;
		this.avatar = avatar;
	}

	public int getId() {
        return id;
    }
 
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAvatar() {
        return avatar;
    }
     
   
}