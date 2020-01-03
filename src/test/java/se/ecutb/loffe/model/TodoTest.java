package se.ecutb.loffe.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutb.loffe.model.Person;
import se.ecutb.loffe.model.Todo;

public class TodoTest {

    Todo t;
    Person p;

    @Before
    public void setup(){
        t = new Todo(1, "teststring");
        p = new Person(1, "Loffe", "Knutsson");
    }

    @Test
    public void testGetandSet(){
        t.setAssignee(p);
        t.setDescription("description");
        t.setDone(false);

        Assert.assertEquals(1, t.getTodoID());
        Assert.assertEquals(p, t.getAssignee());
        Assert.assertEquals(false, t.isDone());
        Assert.assertEquals("description", t.getDescription());
    }
}
