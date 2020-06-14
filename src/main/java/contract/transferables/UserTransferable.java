package contract.transferables;

import contract.Contract;
import java.io.Serializable;

public class UserTransferable implements Contract<UserTransferable>, Serializable {
    private String cpr;
    private String name;

    public UserTransferable() {
    }

    public UserTransferable(String cpr, String name) {
        this.cpr = cpr;
        this.name = name;
    }

    public String getCpr() {
        return this.cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
