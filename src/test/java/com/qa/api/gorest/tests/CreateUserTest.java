package com.qa.api.gorest.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.api.gorest.Util.ExcelUtil;
import com.qa.api.gorest.pojo.User;
import com.qa.api.gorest.restclient.RestClient;


import io.restassured.response.Response;

public class CreateUserTest {
	
	String baseURI = "https://gorest.co.in";
	String basePath = "/public-api/users";
	String token = "ebb73c03ae45d16cca5fabee8db3c888c63200a7bd8914c44731fe8b1fe58c7e";
	
	@DataProvider
	public Object[][] getUserData() {
		Object userData[][] = ExcelUtil.getTestData("userdata");
		return userData;
	}
	
	
	@Test(dataProvider = "getUserData")
	public void createUserAPIPOSTTest(String name, String email, String gender, String status, String created_at, String updated_at) {

		Map<String, String> authTokenMap = new HashMap<String, String>();
		authTokenMap.put("Authorization", "Bearer " + token);


		//User user = new User("Athira101","athira101@gmail.com","female","active","2021-01-04T03:50:03.469+05:30","2021-01-04T18:31:02.662+05:30");
		User user = new User(name,email,gender,status,created_at,updated_at);
		Response response = RestClient.doPost("JSON", baseURI, basePath, authTokenMap, null, true, user);
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println("=============================");

	}

}
