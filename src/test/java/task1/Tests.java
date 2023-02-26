package task1;

import actualModels.BankDeposit;
import actualModels.CreditCard;
import actualModels.CurrencyCardDebit;
import actualModels.DebitCard;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testCreditCard() {
        CreditCard creditCard = new CreditCard(500, "USD", "Credit Card", 10);
        Assert.assertEquals("USD", creditCard.getCurrency());
        Assert.assertEquals(500, creditCard.getBalance(), 0);
        Assert.assertEquals("Credit Card", creditCard.getName());
        Assert.assertEquals(10, creditCard.getInterestRate(), 0);
        Assert.assertEquals(500, creditCard.getDebt(), 0);
        creditCard.withdraw(200);
        Assert.assertEquals(700, creditCard.getDebt(), 0);
    }

    @Test
    public void testDebitCard() {
        DebitCard debitCard = new DebitCard(2000, "USD", "Debit Card");
        Assert.assertEquals("USD", debitCard.getCurrency());
        Assert.assertEquals(2000, debitCard.getBalance(), 0);
        Assert.assertEquals("Debit Card", debitCard.getName());
        debitCard.deposit(500);
        Assert.assertEquals(2500, debitCard.getBalance(), 0);
        debitCard.withdraw(300);
        Assert.assertEquals(2200, debitCard.getBalance(), 0);
    }

    @Test
    public void testForeignCurrencyDebitCard() {
        CurrencyCardDebit fcdc = new CurrencyCardDebit(100, "EUR", "FCDC");
        Assert.assertEquals("EUR", fcdc.getCurrency());
        Assert.assertEquals(100, fcdc.getBalance(), 0);
        Assert.assertEquals("FCDC", fcdc.getName());
        fcdc.deposit(50);
        Assert.assertEquals(150, fcdc.getBalance(), 0);
        fcdc.withdraw(30);
        Assert.assertEquals(120, fcdc.getBalance(), 0);
    }

    @Test
    public void testDeposit() {
        BankDeposit deposit = new BankDeposit(1000, "USD", "Deposit");
        Assert.assertEquals("USD", deposit.getCurrency());
        Assert.assertEquals(1000, deposit.getBalance(), 0);
        Assert.assertEquals("Deposit", deposit.getName());
        deposit.deposit(500);
        Assert.assertEquals(1500, deposit.getBalance(), 0);
        deposit.withdraw(300);
        Assert.assertEquals(1200, deposit.getBalance(), 0);
        deposit.close();
        Assert.assertEquals(0, deposit.getBalance(), 0);
    }
}
