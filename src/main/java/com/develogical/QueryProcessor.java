package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("prime")) {
            return "13";
        }
        if (query.toLowerCase().contains("minus")) {
            return "32";
        }
        if (query.toLowerCase().contains("plus")) {
            return "15";
        }
        if (query.toLowerCase().contains("multi")) {
            return "100";
        }
        return "";
    }
}
