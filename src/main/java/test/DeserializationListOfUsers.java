package test;
import pojo.listofusers.*;
import pojo.user.Data;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class DeserializationListOfUsers{

	@Test
	public void deseralizingUserJson() {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		int[] expectedIds = {1,2,3,4,5,6};
		String expectedEmail = "janet.weaver@reqres.in";
		Data[] dataCollection =  RestAssured.given()
						.get()
						.then()
						.assertThat()
							.statusCode(200)
						.extract()
							.as(Users.class)
								.getData();
		for (int i = 0; i < dataCollection.length; i++) {
			int actualId = dataCollection[i].getId();
			Assert.assertEquals(actualId, expectedIds[i], "Was not deserialize");
		}
	}
	

}