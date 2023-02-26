package actualModels;

import baseModels.BaseModel;

public class CreditCard extends BaseModel {

    private double interestRate;

    public CreditCard(int balance, String currency, String name, double interestRate) {
        super(balance, currency, name);
        this.interestRate = interestRate;
    }

    public double getDebt() {
        return getBalance();
    }

    public double getInterestRate() {
        return interestRate;
    }
}
