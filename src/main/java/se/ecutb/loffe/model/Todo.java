package se.ecutb.loffe.model;

public class Todo {
    final int todoID;
    String description;
    boolean done;
    Person assignee;

    public Todo(int todoID, String description) {
        this.todoID = todoID;
        this.description = description;
    }

    public int getTodoID() {
        return todoID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
