package ru.del.domain;

import java.util.ArrayList;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Issues {

    private ArrayList<Issue> issues;

    @Override
    public String toString() {
        return "Issues{" +
                "issue=" + issues +
                '}';
    }

    public ArrayList<Issue> getIssues() {
        return issues;
    }

    public void setIssues(ArrayList<Issue> issues) {
        this.issues = issues;
    }
}
