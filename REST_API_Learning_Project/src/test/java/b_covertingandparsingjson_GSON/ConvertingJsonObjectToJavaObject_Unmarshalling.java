package b_covertingandparsingjson_GSON;

import org.testng.annotations.Test;

import com.google.gson.Gson;

public class ConvertingJsonObjectToJavaObject_Unmarshalling {

	
	@Test
	public class jsonobject2javaobject {

		String originalJson = "{\"accounting\":[{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":\"23\"},{\"firstName\":\"Mary\",\"lastName\":\"Smith\",\"age\":\"32\"}],\"sales\":[{\"firstName\":\"Sally\",\"lastName\":\"Green\",\"age\":\"27\"},{\"firstName\":\"Jim\",\"lastName\":\"Galley\",\"age\":\"41\"}]}";

		// Getting gson Object for Conversion;
		Gson gson = new Gson();
		

	}

}
