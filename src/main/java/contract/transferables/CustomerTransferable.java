package contract.transferables;

import java.io.Serializable;
import contract.Contract;

public class CustomerTransferable implements Contract<CustomerTransferable>, Serializable {

    private String cpr;
    private String name;


    public CustomerTransferable(String cpr, String name) {
        this.cpr = cpr;
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
