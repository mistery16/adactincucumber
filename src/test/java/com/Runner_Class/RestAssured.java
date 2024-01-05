package com.Runner_Class;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RestAssured {

	
	public static Properties prop;
	private static String basePath;
	private static String baseURI;
	public static String params;
	
	
	static ExtentReports Report;
	static ExtentTest test;
	
	
	@BeforeMethod
	private void Beforemethod() {
		// TODO Auto-generated method stub
    Report =new ExtentReports("D:\\Report.html");
    test=Report.startTest("ExtentDemo");
	}
	
	
	
	
//@Test(priority = 2)
	public static void restget() throws IOException, InterruptedException {
	Thread.sleep(3000);
		FileInputStream propFile = new FileInputStream(".\\conf.file");

		prop = new Properties();
		prop.load(propFile);

		String base = prop.getProperty("url");

		// base url
		RestAssured.baseURI = "http://localhost:3000";
		// rest assured method

		
		//RestAssured.
		String res = given().
				baseUri(baseURI).when().get("/Trendnologies").prettyPrint();

		params = "[Manikandan, test, test, test]";

		JsonPath api = new JsonPath(res);

		String req = api.getString("Student");

		
		System.out.println(req);
		if (req.equalsIgnoreCase(params)) {
			test.log(LogStatus.PASS, "expected result" + params);
		} else {
			test.log(LogStatus.FAIL, "expected result" + params);
		}
	}
	//@Test(priority = -2)
	private void postmethod() throws IOException {
		
		FileInputStream propFile = new FileInputStream(".\\conf.file");

		prop = new Properties();
		prop.load(propFile);

		
		String request="\r\n"
				+ "    {\r\n"
				+ "        \"Student\": \"test\",\r\n"
				+ "        \"id\": \"004\",\r\n"
				+ "        \"Contact\": \"8721856256\",\r\n"
				+ "        \"Email\": \"quue@gmail.com\",\r\n"
				+ "        \"Dob\": \"August 16, 1998\"\r\n"
				+ "    }\r\n"
				+ "";
		
		
			
	
		String base = prop.getProperty("url");
		RestAssured.basePath = "/002";
		
	given().baseUri(base).header("Content-Type","application/json").body(request).when().post("/Trendnologies/").prettyPrint();
		
		//System.out.println(resp1);

	}
	@Test
	private void schemavalidation() throws IOException {
		
		String schema ="{\r\n"
				+ "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\r\n"
				+ "  \"type\": \"object\",\r\n"
				+ "  \"properties\": {\r\n"
				+ "    \"data\": {\r\n"
				+ "      \"type\": \"object\",\r\n"
				+ "      \"properties\": {\r\n"
				+ "        \"id\": {\r\n"
				+ "          \"type\": \"integer\"\r\n"
				+ "        },\r\n"
				+ "        \"email\": {\r\n"
				+ "          \"type\": \"string\"\r\n"
				+ "        },\r\n"
				+ "        \"first_name\": {\r\n"
				+ "          \"type\": \"string\"\r\n"
				+ "        },\r\n"
				+ "        \"last_name\": {\r\n"
				+ "          \"type\": \"string\"\r\n"
				+ "        },\r\n"
				+ "        \"avatar\": {\r\n"
				+ "          \"type\": \"string\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      \"required\": [\r\n"
				+ "        \"id\",\r\n"
				+ "        \"email\",\r\n"
				+ "        \"first_name\",\r\n"
				+ "        \"last_name\",\r\n"
				+ "        \"avatar\"\r\n"
				+ "      ]\r\n"
				+ "    },\r\n"
				+ "    \"support\": {\r\n"
				+ "      \"type\": \"object\",\r\n"
				+ "      \"properties\": {\r\n"
				+ "        \"url\": {\r\n"
				+ "          \"type\": \"string\"\r\n"
				+ "        },\r\n"
				+ "        \"text\": {\r\n"
				+ "          \"type\": \"string\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      \"required\": [\r\n"
				+ "        \"url\",\r\n"
				+ "        \"text\"\r\n"
				+ "      ]\r\n"
				+ "    }\r\n"
				+ "  },\r\n"
				+ "  \"required\": [\r\n"
				+ "    \"data\",\r\n"
				+ "    \"support\"\r\n"
				+ "  ]\r\n"
				+ "}";
		FileInputStream propFile = new FileInputStream(".\\conf.file");

		prop = new Properties();
		prop.load(propFile);

		String basese = prop.getProperty("url2");

		// base url
		//RestAssured.baseURI = "http://localhost:3000";
		// rest assured method

		ValidatableResponse res = given().baseUri(basese).when().get("/api/users/2").
				then().assertThat().statusCode(200)
				.body(JsonSchemaValidator.matchesJsonSchema(schema));
System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	@AfterMethod
public static void Aftermethod() {
	
Report.endTest(test);
Report.flush();
}
	public void Postmethod() {

	}
}
