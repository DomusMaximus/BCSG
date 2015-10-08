/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcsg;

import com.bcsg.csv.mapping.CreditCardMapper;
import com.bcsg.io.CSVReader;
import com.bcsg.model.CreditCard;
import com.bcsg.utils.Mask;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Dominic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> bankMasks = new HashMap<String, String>();
        bankMasks.put("HSBC Canada", "##xx-xxxx-xxxx-xxxx");
        bankMasks.put("Royal Bank of  Canada", "####-xxxx-xxxx-xxxx");
        bankMasks.put("American Express", "xxxx-xxxx-xxxx-###");
        
        try
        {
            CSVReader reader = new CSVReader();
            String[][] rows = reader.Read("midtest.csv");
            
            CreditCardMapper mapper = new CreditCardMapper();
            List<CreditCard> creditCards = mapper.Map(rows);
            
            Collections.sort(creditCards);
            for(CreditCard card : creditCards){
                System.out.println(String.format("%s\t%s\t%s", card.getBank(), card.getCardNumber(), Mask.CardNumber(card.getCardNumber(),bankMasks.get(card.getBank()))));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
