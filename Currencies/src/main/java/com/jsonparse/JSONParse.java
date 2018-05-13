/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsonparse;

import com.model.Currency;
import com.requesturl.RequestUrl;
import com.tags.Tags;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author SirOncel
 */
public class JSONParse {

    public static List<Currency> getCurrencies() throws MalformedURLException, IOException {
        List<Currency> currencies = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(((HttpURLConnection) new URL(RequestUrl.REQUEST_URL).openConnection()).getInputStream()));
        StringBuilder builder = new StringBuilder();
        String line = "";
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        JSONArray array = new JSONArray(builder.toString());
        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            currencies.add(new Currency(object.getString(Tags.NAME), object.getString(Tags.FULL_NAME), object.getString(Tags.CODE), object.getDouble(Tags.SELLING), object.getDouble(Tags.BUYING), object.getDouble(Tags.CHANGE_RATE), object.getInt(Tags.CURRENCY), object.getLong(Tags.UPDATE_DATE)));
        }
        return currencies;
    }

}
