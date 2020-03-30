package contract.transferables;

import java.io.Serializable;
import contract.Contract;

public class BankTransferable implements Contract<BankTransferable>, Serializable {

    private String cvr;
    private String name;


    public BankTransferable(String cvr, String name) {
        this.cvr = cvr;
        this.name = name;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
