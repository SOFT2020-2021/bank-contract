package contract.transferables;

import contract.Contract;
import java.io.Serializable;
import java.util.List;

public class UserIdsTransferable implements Contract<UserIdsTransferable>, Serializable {
    private List<String> customerIds;

    public UserIdsTransferable(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public List<String> getCustomerIds() {
        return this.customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }
}
