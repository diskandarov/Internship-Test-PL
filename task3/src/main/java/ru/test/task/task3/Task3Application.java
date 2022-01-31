package ru.test.task.task3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Task3Application {

    public static void main(String[] args) throws IOException {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileReader fileTests = new FileReader(args[0]);
        FileReader fileValues = new FileReader(args[1]);
        Tests tests = gson.fromJson(fileTests, Tests.class);
        Values values = gson.fromJson(fileValues, Values.class);
        fileTests.close();
        fileValues.close();
        List<Test> testList = tests.getTests();
        List<Value> valueList = values.getValues();

        rewriteValue(testList, valueList);

        FileWriter writer = new FileWriter("report.json", false);
        String text = gson.toJson(tests);
        writer.write(text);
        writer.close();
    }

    private static void rewriteValue(List<Test> testList, List<Value> valueList) {
        for (Test test : testList) {
            resultValueInTestList(test, valueList);
        }
    }

    public static void resultValueInTestList(Test test, List<Value> valueList) {
        checkIdAddValue(test, valueList);
        if (test.getValues() != null) {
            for (Test test1 : test.getValues()) {
                resultValueInTestList(test1, valueList);
            }
        }
    }

    public static void checkIdAddValue(Test test, List<Value> values) {
        for (Value value : values) {
            if (value.getId() == test.getId()) {
                test.setValue(value.getValue());
            }
        }
    }

}
