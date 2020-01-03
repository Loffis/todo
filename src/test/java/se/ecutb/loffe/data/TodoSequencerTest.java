package se.ecutb.loffe.data;

import org.junit.Assert;
import org.junit.Test;

public class TodoSequencerTest {

    @Test
    public void testNextTodoId(){
        TodoSequencer.setTodoId(0);
        int before = TodoSequencer.getTodoId();
        TodoSequencer.nextTodoId();
        int after = TodoSequencer.getTodoId();
        Assert.assertNotEquals(before, after);
        Assert.assertEquals(1, after);

    }

    @Test
    public void testReset(){
        TodoSequencer.setTodoId(99);
        Assert.assertEquals(99, TodoSequencer.getTodoId());
        TodoSequencer.reset();
        Assert.assertEquals(0, TodoSequencer.getTodoId());
    }

}