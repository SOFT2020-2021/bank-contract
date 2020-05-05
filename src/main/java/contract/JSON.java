package contract;

import com.fasterxml.jackson.databind.ObjectMapper;
import contract.transferables.*;

import java.io.IOException;

public class JSON {

    public JSON(){ }

    public AccountTransferable fromJsonAccount(String JSONString) throws IOException {
        return new ObjectMapper().readValue(JSONString, AccountTransferable.class);
    }

    public BankTransferable fromJsonBank(String JSONString) throws IOException {
        return new ObjectMapper().readValue(JSONString, BankTransferable.class);
    }

    public CustomerTransferable fromJsonCustomer(String JSONString) throws IOException {
        return new ObjectMapper().readValue(JSONString, CustomerTransferable.class);
    }

    public TransactionTransferable fromJsonTransaction(String JSONString) throws IOException {
        return new ObjectMapper().readValue(JSONString, TransactionTransferable.class);
    }

    public TransactionActivityTransferable fromJSONTransactionActivity(String JSONString) throws IOException {
        System.out.println(JSONString);
        return new ObjectMapper().readValue(JSONString, TransactionActivityTransferable.class);
    }

}
