package com.codecool.flight_api_project.util;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

public class JSONReader
{
    // parsing file "JSONExample.json"
    Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));

    // typecasting obj to JSONObject
    JSONObject jo = (JSONObject) obj;

    // getting firstName and lastName
    String firstName = (String) jo.get("firstName");
    String lastName = (String) jo.get("lastName");

    // getting age
    int age = (int) jo.get("age");

    // getting address
    Map address = ((Map)jo.get("address"));

    // iterating address Map
    Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");

        // iterating phoneNumbers
        Iterator itr2 = ja.iterator();

        while (itr2.hasNext())
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }

    public JSONReader() throws FileNotFoundException, ParseException
    {
    }
}
}
