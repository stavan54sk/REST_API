package e_convertingandparsingjson_JACKSON_OBJECTMAPPER;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;

/**
 * @author Stavan S. Kodolikar
 *
 *
 */
public class ConvertingJavaObjectToJsonObject_Marshalling {

	@Test
	public void javaobject2jsonobject() throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		
		//Creating POJO Class for the converted JSON 
		PayLoad origPayload = objectMapper.readValue(new File(
				"C:\\Users\\LENOVO\\Documents\\REST_API\\REST_API_Learning_Project\\src\\test\\java\\e_convertingandparsingjson_JACKSON_OBJECTMAPPER\\Payload.json"),
				PayLoad.class);
		
		
		//Converting Java Object to Json Object 
		objectMapper.writeValue( new File("C:\\Users\\LENOVO\\Documents\\REST_API\\REST_API_Learning_Project\\src\\test\\java\\e_convertingandparsingjson_JACKSON_OBJECTMAPPER\\ConvertedPayload.json"), origPayload);
		
		FileInputStream fis =new FileInputStream("C:\\Users\\LENOVO\\Documents\\REST_API\\REST_API_Learning_Project\\src\\test\\java\\e_convertingandparsingjson_JACKSON_OBJECTMAPPER\\ConvertedPayload.json");

		
	}

}
