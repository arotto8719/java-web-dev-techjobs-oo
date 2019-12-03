package org.launchcode.techjobs_oo;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = this.id;
        this.id = nextId;
        nextId++;
    }
    public JobField (String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }
}
