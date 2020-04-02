package test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdatePatchTest {
	
	@Test
	public void getUpdatedDate() {
		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification httpRequest = RestAssured.given();
		SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy HH:mm");

		
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("name", "morpheus2");
		
		httpRequest.header("Content-Type", "application/json").body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST, "/users/2");
		String actualName = response.then().extract().path("name");
		
		String updatedDate = response.then().extract().path("updatedAt");
		Date currDate = Date.from(java.time.Clock.systemUTC().instant());
		Instant updatedInstantDate = Instant.parse(updatedDate);
		Date dateUpdated = Date.from(updatedInstantDate);
		String formattedCurrDate = formatter.format(currDate);
		
		String formattedUpdatedDate = formatter.format(dateUpdated);

		Assert.assertEquals(formattedUpdatedDate, formattedCurrDate, "Was not updated");
		Assert.assertEquals(actualName, "morpheus2", "Was not updated");
	}
}