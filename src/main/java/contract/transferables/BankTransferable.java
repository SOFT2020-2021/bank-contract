package contract.transferables;

import java.io.Serializable;
import contract.Contract;

public class BankTransferable implements Contract<BankTransferable>, Serializable {

    private int cvr;
    private String name;

    public BankTransferable(){ }

    public BankTransferable(int cvr, String name) {
        this.cvr = cvr;
        this.name = name;
    }

    public int getCvr() {
        return cvr;
    }

    public void setCvr(int cvr) {
        this.cvr = cvr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
