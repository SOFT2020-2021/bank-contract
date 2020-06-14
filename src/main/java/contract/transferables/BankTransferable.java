package contract.transferables;

import contract.Contract;
import java.io.Serializable;

public class BankTransferable implements Contract<BankTransferable>, Serializable {
    private String cvr;
    private String name;

    public BankTransferable() {
    }

    public BankTransferable(String cvr, String name) {
        this.cvr = cvr;
        this.name = name;
    }

    public String getCvr() {
        return this.cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
