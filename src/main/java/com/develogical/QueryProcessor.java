package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "This game is interesting";
        }
        return "Still this game is interesting";
    }
}
