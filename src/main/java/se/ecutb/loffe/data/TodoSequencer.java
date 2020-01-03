package se.ecutb.loffe.data;

public class TodoSequencer {
    private static int todoId;

    public TodoSequencer(int todoId) {
        TodoSequencer.todoId = todoId;
    }

    static int nextTodoId(){
        todoId++;
        return todoId;
    }

    static int reset(){
        todoId = 0;
        return todoId;
    }

    public static int getTodoId() {
        return todoId;
    }

    public static void setTodoId(int todoId) {
        TodoSequencer.todoId = todoId;
    }
}