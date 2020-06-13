package contract.transferables;

import contract.Contract;
import java.io.Serializable;

public class BankTransferable implements Contract<BankTransferable>, Serializable {
    private int cvr;
    private String name;

    public BankTransferable() {
    }

    public BankTransferable(int cvr, String name) {
        this.cvr = cvr;
        this.name = name;
    }

    public int getCvr() {
        return this.cvr;
    }

    public void setCvr(int cvr) {
        this.cvr = cvr;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
