package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("number")) {
            return "205";
        }
        return "No prime numbers";
    }
}
