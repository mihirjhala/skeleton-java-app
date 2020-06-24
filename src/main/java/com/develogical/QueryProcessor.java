package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("number")) {
            return "1";
        }
        return "Still this game is interesting";
    }
}
