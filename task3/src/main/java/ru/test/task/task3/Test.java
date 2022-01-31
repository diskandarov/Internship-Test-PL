package ru.test.task.task3;

import com.google.gson.annotations.Expose;

import java.util.List;


public class Test {
    private int id;
    private String title;
    @Expose(serialize = false, deserialize = false)
    private String value;
    @Expose(serialize = false, deserialize = false)
    private List<Test> values;

    public Test() {
    }

    public Test(int id, String title, String value, List<Test> values) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.values = values;
    }

    public Test(int id, String title, String value) {
        this.id = id;
        this.title = title;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Test> getValues() {
        return values;
    }

    public void setValues(List<Test> values) {
        this.values = values;
    }
}
