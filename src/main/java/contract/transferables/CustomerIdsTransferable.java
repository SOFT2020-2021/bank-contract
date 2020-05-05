package contract.transferables;

import contract.Contract;

import java.io.Serializable;
import java.util.List;

public class CustomerIdsTransferable implements Contract<CustomerIdsTransferable>, Serializable {

    private List<String> customerIds;

    public CustomerIdsTransferable(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }
}

