package se.ecutb.loffe.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.ecutb.loffe.model.Person;
import se.ecutb.loffe.model.Todo;

import static org.junit.jupiter.api.Assertions.*;

public class TodoItemsTest {

    private TodoItems testObject;
    private Person testPerson;


    @BeforeEach
    public void setup(){
        testObject = new TodoItems();
        PersonSequencer.reset();
        testPerson = new Person(1, "TestPerson", "Testson");
        testObject.clear();
        TodoSequencer.reset();
        testObject.createNewTodo("Testdescription1");
        testObject.createNewTodo("Testdescription2", testPerson);
        testObject.createNewTodo("Testdescription3");
    }

    @Test
    public void ThreeItemsAreSuccessfullyCreated(){
        assertEquals(3, testObject.size());
    }

    @Test
    public void FindById2ReturnsTodo2(){
        Todo result = testObject.findById(2);

        assertNotNull(result);
        assertEquals(2, result.getTodoID());
        assertEquals("Testdescription2", result.getDescription());
        assertFalse(result.isDone());
        assertNotNull(result.getAssignee());
    }

    @Test
    public void findAllReturn3(){
        assertEquals(3, testObject.findAll().length);
    }

    @Test
    public void givenFalseFindByDoneStatusReturnSize3(){
        Todo[] result = testObject.findByDoneStatus(false);
        assertEquals(3, result.length);
    }

    @Test
    public void givenId1ReturnPersonWithId1(){
        Todo[] result = testObject.findByAssignee(1);

        assertEquals(1, result.length);
        assertEquals("TestPerson", result[0].getAssignee().getFirstName());
    }

    @Test
    public void dontFindById(){
        Todo result = testObject.findById(99);

        assertNull(result);
    }

    @Test
    public void findByAssigne(){
        Todo[] result = testObject.findByAssignee(testPerson);

        assertNotNull(result);
        assertEquals("TestPerson", result[0].getAssignee().getFirstName());
    }

    @Test
    public void testFindUnassignedTodos(){
        Todo[] result = testObject.findUnassignedTodoItems();

        assertEquals(2, result.length);
        assertEquals("Testdescription3", result[1].getDescription());
    }

}
