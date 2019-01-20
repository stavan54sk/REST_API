//THIS IS A POJO(PLAIN OLD JAVA OBJECT) CLASS,
// obtained from Website http://www.jsonschema2pojo.org/
package b_covertingandparsingjson_GSON;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
@author Stavan S. Kodolikar
*
*
*/
public class JsonClass {

@SerializedName("accounting")
@Expose
private List<Accounting> accounting = null;
@SerializedName("sales")
@Expose
private List<Sale> sales = null;

public List<Accounting> getAccounting() {
return accounting;
}

public void setAccounting(List<Accounting> accounting) {
this.accounting = accounting;
}

public List<Sale> getSales() {
return sales;
}

public void setSales(List<Sale> sales) {
this.sales = sales;
}

}