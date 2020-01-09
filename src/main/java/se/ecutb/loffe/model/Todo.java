package se.ecutb.loffe.model;

public class Todo {
    private final int todoID;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(int todoID, String description) {
        this.todoID = todoID; // false as default.
        setDescription(description);
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
