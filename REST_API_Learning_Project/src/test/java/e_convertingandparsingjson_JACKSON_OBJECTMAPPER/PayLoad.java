package e_convertingandparsingjson_JACKSON_OBJECTMAPPER;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"type",
"name",
"ppu",
"batters",
"topping"
})
public class PayLoad {

@JsonProperty("id")
private String id;
@JsonProperty("type")
private String type;
@JsonProperty("name")
private String name;
@JsonProperty("ppu")
private Double ppu;
@JsonProperty("batters")
private Batters batters;
@JsonProperty("topping")
private List<Topping> topping = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("ppu")
public Double getPpu() {
return ppu;
}

@JsonProperty("ppu")
public void setPpu(Double ppu) {
this.ppu = ppu;
}

@JsonProperty("batters")
public Batters getBatters() {
return batters;
}

@JsonProperty("batters")
public void setBatters(Batters batters) {
this.batters = batters;
}

@JsonProperty("topping")
public List<Topping> getTopping() {
return topping;
}

@JsonProperty("topping")
public void setTopping(List<Topping> topping) {
this.topping = topping;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}