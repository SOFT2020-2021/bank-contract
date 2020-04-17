package contract;

import com.fasterxml.jackson.databind.ObjectMapper;
import contract.transferables.AccountTransferable;
import contract.transferables.BankTransferable;
import contract.transferables.CustomerTransferable;
import contract.transferables.TransactionTransferable;

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

}
