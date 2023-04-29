package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void remainIfAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void shouldRemainToCashback1() {
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount=1100;
        
        int actual= cashbackHackService.remain(amount);
        int expected=900;
        assertEquals(actual,expected);
    }
    @Test
    void shouldRemainToCashback2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(expected,actual);
    }
    

}
