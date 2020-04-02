package test;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestTest {
	
	@Test
	public void getUser() {
		String expectedEmail = "janet.weaver@reqres.in";
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users";
		Response response = null;
		try {
			response = RestAssured.given()
					.when()
					.get("/2");
		} catch(Exception e) {
			e.printStackTrace();
		}
		String actualEmail = response.then().extract().path("data.email");
		
		Assert.assertEquals(actualEmail, expectedEmail);
	}
}