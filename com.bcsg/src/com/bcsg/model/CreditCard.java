/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcsg.model;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Dominic
 */
public class CreditCard implements Comparable<CreditCard> {
    private String bank;
    private String cardNumber;
    private Date expiry;

    public CreditCard(String bank, String cardNumber, Date expiry) {
        this.bank = bank;
        this.cardNumber = cardNumber;
        this.expiry = expiry;
    }
    
    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @return the expiry
     */
    public Date getExpiry() {
        return expiry;
    }

    @Override
    public int compareTo(CreditCard o) {
        if (o == null || o.getExpiry() == null) {
            return 0;
        }
        return o.getExpiry().compareTo(getExpiry());
    }
}
