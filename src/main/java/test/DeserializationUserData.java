package test;
import pojo.user.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class DeserializationUserData {

	@Test
	public void deseralizingUserJson() {
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		int expectedId = 2;
		Data expectedData = new Data(2, "janet.weaver@reqres.in", "Janet", "Weaver", "https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg");
		Data userData = RestAssured.get()
							.then()
							.assertThat()
								.statusCode(200)
							.extract()
							.as(Users.class)
								.getData();
		Assert.assertEquals(userData.getId(), expectedId, "Deserialize did not succeed");
		
	}
	

}