package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {

    CashbackHacker service = new CashbackHacker();

    @org.junit.jupiter.api.Test
    public void shouldReturn1000whenPurchase0() {
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn999whenPurchase1() {
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn500whenPurchase500() {
        int expected = 500;
        int actual = service.remain(500);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn1whenPurchase999() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnLimitWhenPurchaseMoreLimit() {
        int expected = 1000;
        int actual = service.remain(3000);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0WhenPurchase1000() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0WhenPurchaseIsNegative() {
        int expected = 0;
        int actual = service.remain(-1);
        assertEquals(expected, actual);
    }
}
