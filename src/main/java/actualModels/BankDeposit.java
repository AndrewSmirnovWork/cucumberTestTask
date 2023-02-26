package actualModels;

import baseModels.BaseModel;

public class BankDeposit extends BaseModel {

    public BankDeposit(int balance, String currency, String name) {
        super(balance, currency, name);
    }

    public void close() {
        setBalance(0);
    }
}
