package contract;

import com.fasterxml.jackson.databind.ObjectMapper;
import contract.transferables.*;

import java.io.IOException;

public class JSON {
    public JSON() {
    }

    public AccountTransferable fromJsonAccount(String JSONString) throws IOException {
        return (AccountTransferable)(new ObjectMapper()).readValue(JSONString, AccountTransferable.class);
    }

    public BankTransferable fromJsonBank(String JSONString) throws IOException {
        return (BankTransferable)(new ObjectMapper()).readValue(JSONString, BankTransferable.class);
    }

    public UserTransferable fromJsonUser(String JSONString) throws IOException {
        return (UserTransferable)(new ObjectMapper()).readValue(JSONString, UserTransferable.class);
    }

    public TransactionTransferable fromJsonTransaction(String JSONString) throws IOException {
        return (TransactionTransferable)(new ObjectMapper()).readValue(JSONString, TransactionTransferable.class);
    }

    public TransactionActivityTransferable fromJSONTransactionActivity(String JSONString) throws IOException {
        return (TransactionActivityTransferable)(new ObjectMapper()).readValue(JSONString, TransactionActivityTransferable.class);
    }
}
