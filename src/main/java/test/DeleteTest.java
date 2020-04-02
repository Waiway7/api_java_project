package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DeleteTest {

	@Test
	public void deleteUser() {
		RestAssured.baseURI = "https://reqres.in/api";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.header("Content-Type", "application/json").delete("/users/2");
		
		Assert.assertEquals(response.getStatusCode(), 204, "Error in deleting" + "Status Code" + response.getStatusCode());
	
	}
	

}