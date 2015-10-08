/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcsg.test.csv.mapping;

import com.bcsg.csv.mapping.CreditCardMapper;
import com.bcsg.model.CreditCard;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dominic
 */
public class CreditCardMapperTest {
    
    public CreditCardMapperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCSVToCreditCard(){
        final String BANK_NAME = "Bank Name";
        final String CREDIT_CARD = "1234-4567-2235-3232";
        
        String[][] csv = new String[][]{{BANK_NAME,CREDIT_CARD,"Apr-2016"}};
        CreditCardMapper mapper = new CreditCardMapper();
        List<CreditCard> creditCards = mapper.Map(csv);
        Assert.assertEquals(csv.length, creditCards.size());
        if (!creditCards.isEmpty())
        {
            Assert.assertEquals(BANK_NAME, creditCards.get(0).getBank());
            Assert.assertEquals(CREDIT_CARD, creditCards.get(0).getCardNumber());
        }        
    }
    
    @Test
    public void testInvalidCSVToCreditCard(){
        String[][] csv = new String[][]{{"Apr-2016"}};
        CreditCardMapper mapper = new CreditCardMapper();
        List<CreditCard> creditCards = mapper.Map(csv);
        Assert.assertEquals(0, creditCards.size());
    }    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
