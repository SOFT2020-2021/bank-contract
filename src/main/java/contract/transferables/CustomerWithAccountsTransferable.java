package contract.transferables;

import contract.Contract;

import java.io.Serializable;
import java.util.List;

public class CustomerWithAccountsTransferable implements Contract<CustomerWithAccountsTransferable>, Serializable {

    private String cpr;
    private List<SimpleAccountTransferable> accounts;

    public CustomerWithAccountsTransferable(String cpr, List<SimpleAccountTransferable> accounts) {
        this.cpr = cpr;
        this.accounts = accounts;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public List<SimpleAccountTransferable> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<SimpleAccountTransferable> accounts) {
        this.accounts = accounts;
    }
}
