package org.dse;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class SetupData
{
    Object obj = new JSONParser().parse(new FileReader("src/main/java/org/dse/appSettigs.json"));
    JSONObject jo = (JSONObject) obj;
    // Достаём firstName and lastName
    String baseUrl = (String) jo.get("baseUrl");
    String pathToDriver = (String) jo.get("pathToDriver");

    public SetupData() throws IOException, ParseException {
    }
    public Map<String, String> getSettings() {
        Map<String, String> settings = new HashMap<>();
        settings.put("baseUrl", baseUrl);
        settings.put("pathToDriver", pathToDriver);
        return settings;
    }
}
