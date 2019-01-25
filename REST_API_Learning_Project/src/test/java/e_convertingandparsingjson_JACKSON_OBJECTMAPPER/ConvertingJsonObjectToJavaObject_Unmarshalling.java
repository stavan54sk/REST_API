package e_convertingandparsingjson_JACKSON_OBJECTMAPPER;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author Stavan S. Kodolikar
 *
 *
 */
public class ConvertingJsonObjectToJavaObject_Unmarshalling {

	@Test
	public void jsonobject2javaobject() throws JsonParseException, JsonMappingException, IOException {
		
		//Creating Object Mapper to convert 
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		//Creating POJO Class for the converted JSON 
		PayLoad payload = objectMapper.readValue(new File(
				"C:\\Users\\LENOVO\\Documents\\REST_API\\REST_API_Learning_Project\\src\\test\\java\\e_convertingandparsingjson_JACKSON_OBJECTMAPPER\\Payload.json"),
				PayLoad.class);

		System.out.println(payload.getId());
		System.out.println(payload.getName());
		System.out.println(payload.getType());
		System.out.println(payload.getPpu());
		System.out.println(payload.getBatters().getBatter().get(2).getId());
		System.out.println(payload.getBatters().getBatter().get(2).getType());
		System.out.println(payload.getTopping().get(2).getId());
		System.out.println(payload.getTopping().get(2).getType());

	}

}
