package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAtmTest {
    @Test
    void testGetPayableAmount() {
        Payable amount = new Amount();
        assertEquals(2134, amount.getPayableAmount(2134));
    }

    @Test
    void testGetPayableAmountCash() {
        Payable cash = new Cash();
        assertEquals(0, cash.getPayableAmount(0));
        assertEquals(10, cash.getPayableAmount(11));
        assertEquals(10, cash.getPayableAmount(12));
        assertEquals(15, cash.getPayableAmount(13));
        assertEquals(15, cash.getPayableAmount(14));
        assertEquals(15, cash.getPayableAmount(15));
        assertEquals(15, cash.getPayableAmount(16));
    }

    @Test
    void testGetPayableAmountAtm() {
        Payable bank = new BankAtm();
        assertEquals(0, bank.getPayableAmount(0));
        assertEquals(1000, bank.getPayableAmount(67));
        assertEquals(1000, bank.getPayableAmount(1000));
    }
}