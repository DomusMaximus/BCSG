/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcsg.test.utils;

import com.bcsg.utils.Mask;
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
public class MaskTest {
    
    public MaskTest() {
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
    public void testCorrectPatternForSameSize(){
        Assert.assertEquals("1234-xxxx-xxxx-xxxx", Mask.CardNumber("1234-5678-9101-1123", "####-xxxx-xxxx-xxxx"));
    }

    @Test
    public void testCorrectPatternForShortSize(){
        Assert.assertEquals("1234-xxxx-xxxx", Mask.CardNumber("1234-5678-9101", "####-xxxx-xxxx-xxxx"));
    }
    
    @Test
    public void testCorrectPatternForLongSize(){
        Assert.assertEquals("1234-xxxx-xxxx-xxxx", Mask.CardNumber("1234-5678-9101-1234-1234", "####-xxxx-xxxx-xxxx"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
