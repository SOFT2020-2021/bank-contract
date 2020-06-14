package contract.transferables;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class AccountTransferableTest {

    AccountTransferable at;

    @Before
    public void setup(){
        at = new AccountTransferable("1234","4321", "112",10000L);
    }

    @After
    public void tearDown(){
        at = null;
    }

    @Test
    public void getAndSetBankCvr() {
        Assert.assertEquals("4321",at.getBankCvr());
        at.setBankCvr("1000");
        Assert.assertEquals("1000",at.getBankCvr());
    }

    @Test
    public void getAndSetCustomerCpr() {
        Assert.assertEquals("1234",at.getCustomerCpr());
        at.setCustomerCpr("1000");
        Assert.assertEquals("1000",at.getCustomerCpr());
    }

    @Test
    public void getAndSetNumber() {
        Assert.assertEquals("112", at.getNumber());
        at.setNumber("1");
        Assert.assertEquals("1", at.getNumber());
    }

    @Test
    public void getAndSetBalance() {
        Assert.assertEquals(10000L, at.getBalance());
        at.setBalance(1L);
        Assert.assertEquals(1L, at.getBalance());
    }

    @Test
    public void getAndSetTransactions() {
        Assert.assertEquals(at.getTransactions().size(), 0);
        List<TransactionTransferable> transferables = new ArrayList();
        transferables.add(new TransactionTransferable(100L, System.currentTimeMillis()));
        at.setTransactions(transferables);
        Assert.assertEquals(at.getTransactions().size(), 1);
        Assert.assertEquals(at.getTransactions().get(0).getAmount(), 100L);
    }

}
