/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.currencies;

import com.jsonparse.JSONParse;
import com.model.Currency;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SirOncel
 */
public class Test {

    public static void main(String[] args) {
        try {
            List<Currency> currencies = JSONParse.getCurrencies();
            currencies.stream().forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
