package contract.transferables;

import contract.Contract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AccountTransferable implements Contract<AccountTransferable>, Serializable {
    private String bankCvr;
    private String customerCpr;
    private String number;
    private long balance = 0L;
    private List<TransactionTransferable> transactions = new ArrayList();

    public AccountTransferable() {
    }

    public AccountTransferable(String customerCpr, String bankCvr, String number, long balance) {
        this.customerCpr = customerCpr;
        this.bankCvr = bankCvr;
        this.number = number;
        this.balance = balance;
    }

    public String getBankCvr() {
        return this.bankCvr;
    }

    public void setBankCvr(String bankCvr) {
        this.bankCvr = bankCvr;
    }

    public String getCustomerCpr() {
        return this.customerCpr;
    }

    public void setCustomerCpr(String customerCpr) {
        this.customerCpr = customerCpr;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public List<TransactionTransferable> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(List<TransactionTransferable> transactions) {
        this.transactions = transactions;
    }
}
