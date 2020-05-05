package contract.contract;

import contract.Contract;
import contract.transferables.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import contract.JSON;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContractTest {

    Contract<AccountTransferable> aContract;
    Contract<BankTransferable> bContract;
    Contract<CustomerTransferable> cContract;
    Contract<TransactionTransferable> tContract;
    Contract<CustomerIdsTransferable> ciContract;
    Contract<CustomerWithAccountsTransferable> cwatContract;
    JSON jsonTransformer;


    @Before
    public void setup(){
        jsonTransformer = new JSON();

        List<SimpleAccountTransferable> accounts = new ArrayList();
        accounts.add(new SimpleAccountTransferable(21231, 2332));
        accounts.add(new SimpleAccountTransferable(211231231, 123));
        accounts.add(new SimpleAccountTransferable(215676231, 23325675));

        cwatContract = new CustomerWithAccountsTransferable("123123", accounts);

        aContract = new AccountTransferable(1234,4321, 112,10000L);
        bContract = new BankTransferable(1234, "myBank");
        cContract = new CustomerTransferable(1234, "myCustomer");
        tContract = new TransactionTransferable(10000, 12341342);

        List<String> customerIds = new ArrayList();
        customerIds.add("112");
        customerIds.add("3232");
        customerIds.add("111341324242");

        ciContract = new CustomerIdsTransferable(customerIds);

    }

    @Test
    public void testToJSON() throws IOException {
        String jsonStringAccount = aContract.toJSON();
        String jsonStringCustomer = cContract.toJSON();
        String jsonStringBank = bContract.toJSON();
        String jsonStringTransaction = tContract.toJSON();
        String jsonCustomerIds = ciContract.toJSON();
        String jsonCustomerWithAccounts = cwatContract.toJSON();

        Assert.assertEquals("{\"customerIds\":[\"112\",\"3232\",\"111341324242\"]}", jsonCustomerIds);

        String expectedJSON = "{\"cpr\":\"123123\"," +
                "\"accounts\":[{\"balance\":21231," +
                "\"id\":2332},{\"balance\":211231231," +
                "\"id\":123},{\"balance\":215676231," +
                "\"id\":23325675}]}";
        Assert.assertEquals(expectedJSON, jsonCustomerWithAccounts);

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
