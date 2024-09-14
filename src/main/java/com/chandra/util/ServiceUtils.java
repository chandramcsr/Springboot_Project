package com.chandra.util;

import com.chandra.vo.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;


public class ServiceUtils {

    public static void toXmlFromJson(String jsonStr) {
        JSONObject json = new JSONObject(jsonStr);
        String xml = XML.toString(json);
    }

    public static String toJsonFromObject(Customer customer) throws JsonProcessingException {
        ObjectMapper jsonMapper = new ObjectMapper();
        String jsonStr = jsonMapper.writeValueAsString(customer);
        System.out.println(jsonStr);
        return jsonStr;
    }
}
