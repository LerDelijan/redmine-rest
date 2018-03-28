package ru.del.domain;

import java.util.HashMap;
import java.util.Map;

public class IssueFilter {
    private Map<String, String> parameters = new HashMap<>();

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}