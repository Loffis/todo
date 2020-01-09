package se.ecutb.loffe.data;

import se.ecutb.loffe.model.Person;
import se.ecutb.loffe.model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static Todo[] todoItems;

    static {
        todoItems = new Todo[0];
    }

    public void clear(){
        todoItems = new Todo[0];
    }

    public int size(){
        return todoItems.length;
    }

    public Todo[] findAll(){
        return todoItems;
    }

    public Todo findById(int todoId){
        for (Todo todo : todoItems){
            if (todo.getTodoID() == todoId){
                return todo;
            }
        }
        return null;
    }

    public Todo createNewTodo(String description) {
        Todo newTodo = new Todo(TodoSequencer.nextTodoId(), description);
        return addToArray(newTodo);
    }


    private Todo addToArray(Todo newTodo){
        Todo[] temp = new Todo[todoItems.length + 1];
        for (int i = 0; i < temp.length; i++){
            if (i == temp.length - 1){
                temp[i] = newTodo;
            } else {
                temp[i] = todoItems[i];
            }
        }
        todoItems = temp;
        return newTodo;
    }

    public Todo createNewTodo(String description, Person assignee){
        Todo newTodo = createNewTodo(description);
        newTodo.setAssignee(assignee);
        return newTodo;
    }

    private int countByDoneStatus(boolean doneStatus){
        int neededSize = 0;
        for (Todo todo : todoItems){
            if (todo.isDone() == doneStatus){
                ++neededSize;
            }
        }
        return neededSize;
    }

    public Todo[] findByDoneStatus(boolean doneStatus){
        Todo[] todos = new Todo[countByDoneStatus(doneStatus)];

        for (int i = 0, j = 0; j < todos.length; i++){
            Todo current = todoItems[i];
            if (current.isDone() == doneStatus){
                todos[j] = current;
                j++;
            }
        }
        return todos;
    }

    public Todo[] findByAssignee(int personId){
        return Arrays.stream(todoItems)
                .filter(todo -> todo.getAssignee() != null)
                .filter(todo -> todo.getAssignee().getPersonId() == personId)
                .toArray(Todo[]::new);
    }

    public Todo[] findByAssignee(Person assignee){
        return Arrays.stream(todoItems)
                .filter(todo -> todo.getAssignee() != null)
                .filter(todo -> todo.getAssignee().equals(assignee))
                .toArray(Todo[]::new);
    }

    public Todo[] findUnassignedTodoItems(){
        return Arrays.stream(todoItems)
                .filter(todo -> todo.getAssignee() == null)
                .toArray(Todo[]::new);
    }



}
