package contract.transferables;

import contract.Contract;
import java.io.Serializable;
import java.util.List;

public class UserWithAccountsTransferable implements Contract<UserWithAccountsTransferable>, Serializable {
    private String cpr;
    private List<SimpleAccountTransferable> accounts;

    public UserWithAccountsTransferable(String cpr, List<SimpleAccountTransferable> accounts) {
        this.cpr = cpr;
        this.accounts = accounts;
    }

    public String getCpr() {
        return this.cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public List<SimpleAccountTransferable> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(List<SimpleAccountTransferable> accounts) {
        this.accounts = accounts;
    }
}
