package se.ecutb.loffe.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoTest {

    Todo t;
    Person p;

    @BeforeEach
    public void setup(){
        t = new Todo(1, "teststring");
        p = new Person(1, "Loffe", "Knutsson");
    }

    @Test
    public void testGetandSet(){
        t.setAssignee(p);
        t.setDescription("description");
        t.setDone(false);

        Assertions.assertEquals(1, t.getTodoID());
        Assertions.assertEquals(p, t.getAssignee());
        Assertions.assertFalse(t.isDone());
        Assertions.assertEquals("description", t.getDescription());
    }
}
