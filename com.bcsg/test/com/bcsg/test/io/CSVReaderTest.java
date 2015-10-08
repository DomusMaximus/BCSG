package com.bcsg.test.io;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bcsg.io.CSVReader;
import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Dominic
 */
public class CSVReaderTest {
    
    private final String CSV_PATH = "midtest.csv"; 
    
    public CSVReaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testNoFile()           
    {
        String[][] csv = new String[0][0];
        try
        {
            CSVReader reader = new CSVReader();
            csv = reader.Read("");
        }
        catch(Exception e)
        {
            //TODO: log error
        }
        Assert.assertEquals(0, csv.length);
    }    
    
    @Test
    public void testRows()           
    {
        String[][] csv = new String[0][0];
        try
        {
            CSVReader reader = new CSVReader();
            csv = reader.Read(CSV_PATH);
        }
        catch(Exception e)
        {
            //TODO: log error
        }
        Assert.assertEquals(3, csv.length);
    }        
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
