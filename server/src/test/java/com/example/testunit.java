/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
package com.example;

/**
 *
 * @author Finder
 */
public class testunit {
    JunitTesting test = new JunitTesting();
    int output = test.countA("javaevean");
    assertEquals(2,output);
}
