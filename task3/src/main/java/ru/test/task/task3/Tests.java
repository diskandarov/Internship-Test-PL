package ru.test.task.task3;

import java.util.List;

public class Tests {

    private List<Test> tests;

    public Tests() {
    }

    public Tests(List<Test> values) {
        this.tests = values;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
