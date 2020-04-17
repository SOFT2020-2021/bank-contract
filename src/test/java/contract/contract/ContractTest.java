package contract.contract;

import contract.Contract;
import contract.transferables.AccountTransferable;
import contract.transferables.BankTransferable;
import contract.transferables.CustomerTransferable;
import contract.transferables.TransactionTransferable;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import contract.JSON;

import java.io.IOException;

public class ContractTest {

    Contract<AccountTransferable> aContract;
    Contract<BankTransferable> bContract;
    Contract<CustomerTransferable> cContract;
    Contract<TransactionTransferable> tContract;
    JSON jsonTransformer;


    @Before
    public void setup(){
        jsonTransformer = new JSON();
        aContract = new AccountTransferable(1234,4321, 112,10000L);
        bContract = new BankTransferable(1234, "myBank");
        cContract = new CustomerTransferable(1234, "myCustomer");
        tContract = new TransactionTransferable(10000, 12341342);

    }

    @Test
    public void testToJSON() throws IOException {
        String jsonStringAccount = aContract.toJSON();
        String jsonStringCustomer = cContract.toJSON();
        String jsonStringBank = bContract.toJSON();
        String jsonStringTransaction = tContract.toJSON();

        AccountTransferable at = jsonTransformer.fromJsonAccount(jsonStringAccount);
        BankTransferable bt = jsonTransformer.fromJsonBank(jsonStringBank);
        CustomerTransferable ct = jsonTransformer.fromJsonCustomer(jsonStringCustomer);
        TransactionTransferable tt = jsonTransformer.fromJsonTransaction(jsonStringTransaction);

        Assert.assertEquals(AccountTransferable.class, at.getClass());
        Assert.assertEquals(BankTransferable.class, bt.getClass());
        Assert.assertEquals(CustomerTransferable.class, ct.getClass());
        Assert.assertEquals(TransactionTransferable.class, tt.getClass());

    }

}
