//THIS IS A POJO(PLAIN OLD JAVA OBJECT) CLASS,
// obtained from Website http://www.jsonschema2pojo.org/
package b_covertingandparsingjson_GSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
@author Stavan S. Kodolikar
*
*
*/
public class Accounting {

@SerializedName("firstName")
@Expose
private String firstName;
@SerializedName("lastName")
@Expose
private String lastName;
@SerializedName("age")
@Expose
private String age;

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getAge() {
return age;
}

public void setAge(String age) {
this.age = age;
}

}