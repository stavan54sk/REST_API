package c_parsingjson_JSONPATH;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.restassured.path.json.JsonPath;
/**
@author Stavan S. Kodolikar
*
*
*/
public class ParsingJson {

	String originalJson = "{\r\n" + "	\"id\": \"0001\",\r\n" + "	\"type\": \"donut\",\r\n"
			+ "	\"name\": \"Cake\",\r\n" + "	\"ppu\": 0.55,\r\n" + "	\"batters\":\r\n" + "		{\r\n"
			+ "			\"batter\":\r\n" + "				[\r\n"
			+ "					{ \"id\": \"1001\", \"type\": \"Regular\" },\r\n"
			+ "					{ \"id\": \"1002\", \"type\": \"Chocolate\" },\r\n"
			+ "					{ \"id\": \"1003\", \"type\": \"Blueberry\" },\r\n"
			+ "					{ \"id\": \"1004\", \"type\": \"Devil's Food\" }\r\n" + "				]\r\n"
			+ "		},\r\n" + "	\"topping\":\r\n" + "		[\r\n"
			+ "			{ \"id\": \"5001\", \"type\": \"None\" },\r\n"
			+ "			{ \"id\": \"5002\", \"type\": \"Glazed\" },\r\n"
			+ "			{ \"id\": \"5005\", \"type\": \"Sugar\" },\r\n"
			+ "			{ \"id\": \"5007\", \"type\": \"Powdered Sugar\" },\r\n"
			+ "			{ \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },\r\n"
			+ "			{ \"id\": \"5003\", \"type\": \"Chocolate\" },\r\n"
			+ "			{ \"id\": \"5004\", \"type\": \"Maple\" }\r\n" + "		]\r\n" + "}";

	@Test
	public void parsingJsonFirstTest() {
		// Creating jsonPath Object to parse
		JsonPath jsonPath = new JsonPath(originalJson);

		// Getting Top Level Element
		System.out.println(jsonPath.getString("id"));

		// Getting Element inside of Array of the Top Level Element
		System.out.println(jsonPath.getString("batters.batter[3].type"));

		// Getting Element inside of the Top Level Array Element
		System.out.println(jsonPath.getString("topping[6].type"));

		SoftAssert softAssert = new SoftAssert();

		//Soft Assert that should fail and the Execution should continue
		softAssert.assertEquals("sdfaf", jsonPath.getString("id"), "Stavan First Assert Failed");

		//To get assert to  soft assert for checking the actual and expected
		softAssert.assertAll();

	}

	@Test
	public void parsingJsonSecondTest() {
		// Creating jsonPath Object to parse
		JsonPath jsonPath = new JsonPath(originalJson);
		System.out.println(originalJson);

		// Hard Assert success as both actual and expected are equal
		Assert.assertEquals("Devil's Food", jsonPath.getString("batters.batter[3].type"));

	}

	@Test
	public void parsingJsonThirdTest() {
		// Creating jsonPath Object to parse
		JsonPath jsonPath = new JsonPath(originalJson);

		SoftAssert softAssert = new SoftAssert();
		
		//Soft Assert that should success as both actual and expected are equal
		softAssert.assertEquals("Maplel", jsonPath.getString("topping[6].type"), "Assert Passed");
		
	}

}
