package d_convertingandparsingjson_JSONOBJECT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class ConvertingJsonObjectToJavaObject_Unmarshalling {



	@Test
	public void jsonobject2javaobject() {

		// Creating JSON Object
		JSONObject jsonobject = new JSONObject();
		JSONObject jsonobject2 = new JSONObject();
		JSONObject jsonobject3 = new JSONObject();
		JSONObject jsonobject4 = new JSONObject();
		JSONObject jsonobject5 = new JSONObject();
		JSONObject jsonobject6 = new JSONObject();
		JSONObject jsonobject7 = new JSONObject();
		JSONObject jsonobject8 = new JSONObject();
		JSONArray jsonarray1 = new JSONArray();
		JSONArray jsonarray2 = new JSONArray();

		Map<String, Object> hashMap = new HashMap<String, Object>();

		jsonobject8.put("id", "5001");
		jsonobject8.put("type", "None");

		jsonobject7.put("id", "5002");
		jsonobject7.put("type", "Glazed");

		jsonobject6.put("id", "5005");
		jsonobject6.put("type", "Sugar");

		jsonarray2.put(jsonobject8);
		jsonarray2.put(jsonobject7);
		jsonarray2.put(jsonobject6);

		jsonobject.put("topping", jsonarray2);

		jsonobject5.put("id", "1001");
		jsonobject5.put("type", "Regular");

		jsonobject4.put("id", "1002");
		jsonobject4.put("type", "Chocolate");

		jsonobject3.put("id", "1003");
		jsonobject3.put("type", "Blueberry");

		jsonarray1.put(jsonobject5);
		jsonarray1.put(jsonobject6);
		jsonarray1.put(jsonobject7);

		jsonobject2.put("batter", jsonarray1);

		jsonobject.put("topping", jsonarray1);
		jsonobject.put("batters", jsonobject2);
		jsonobject.put("id", "0001");
		jsonobject.put("name", "Cake");
		jsonobject.put("ppu", "0.55");
		jsonobject.put("type", "donut");
		// System.out.println(jsonobject);

		
		// Converting Json Object to Java Object	
		hashMap = jsonobject.toMap();
		
		
			
		System.out.println(hashMap);

	}

}
