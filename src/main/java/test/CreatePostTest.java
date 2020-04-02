package test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CreatePostTest {

	@Test
	public void registerUser() {
		RestAssured.baseURI = "https://reqres.in/api";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("email", "eve.holt@reqres.in");
		requestParams.put("password", "pistol");
		
		httpRequest.header("Content-Type", "application/json").body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST, "/register");
		System.out.println(response.getBody().asString());
	}
	

}