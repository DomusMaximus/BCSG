/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcsg.csv.mapping;

import com.bcsg.model.CreditCard;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Dominic
 */
public class CreditCardMapper {
    public List<CreditCard> Map(String[][] rows){
        DateFormat format = new SimpleDateFormat("MMM-yyyy", Locale.ENGLISH);
            
        List<CreditCard> creditCards = new ArrayList<CreditCard>();                    
        for(String[] columns : rows) {
            if (columns.length != 3){
                continue;
            }
            try {
                Date expiryDate = format.parse(columns[2]);
                creditCards.add(new CreditCard(columns[0], columns[1], expiryDate));
            } catch (ParseException e){
            }               
        }
        
        return creditCards;
    }
}
