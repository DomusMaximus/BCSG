/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcsg.utils;

/**
 *
 * @author Dominic
 */
public class Mask {
    public static String CardNumber(String cardNumber, String mask) {
        StringBuilder maskedNumber = new StringBuilder();
        for (int i = 0; i < mask.length(); i++) {
            if (i >= cardNumber.length()){
                break;
            }
            char c = mask.charAt(i);
            if (c == '#') {
                maskedNumber.append(cardNumber.charAt(i));
            } else if (c == 'x') {
                maskedNumber.append(c);
            } else {
                maskedNumber.append(c);
            }
        }
        return maskedNumber.toString();
    }    
}
