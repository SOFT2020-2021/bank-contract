package contract.transferables;

import contract.Contract;
import java.io.Serializable;

public class CustomerTransferable implements Contract<CustomerTransferable>, Serializable {
    private int cpr;
    private String name;

    public CustomerTransferable() {
    }

    public CustomerTransferable(int cpr, String name) {
        this.cpr = cpr;
        this.name = name;
    }

    public int getCpr() {
        return this.cpr;
    }

    public void setCpr(int cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
