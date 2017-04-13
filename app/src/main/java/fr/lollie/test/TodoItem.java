package fr.lollie.test;

/**
 * Created by Nelrina on 13/04/2017.
 */

public class TodoItem {

    private int id;
    private String title;
    private String deadline;
    private String color;
    private Boolean done;

    public TodoItem() {
    }

    public TodoItem(int i, String t, String d, String c) {
        this.id = i;
        this.title = t;
        this.deadline = d;
        this.color = c;
        this.done = false;
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

    public void setTitle(String t) {
        this.title = t;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String d) {
        this.deadline = d;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean d) {
        this.done = d;
    }

    @Override
    public String toString() {
        return title + " - " + deadline + " - " + color + " item";
    }

}
