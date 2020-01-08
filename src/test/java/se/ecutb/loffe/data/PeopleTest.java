package se.ecutb.loffe.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PeopleTest {

    People p;
    @Before
    public void setup(){
        p = new People();
        p.clear();
        p.createPerson("Test", "Testson");
        p.createPerson("Test2", "Testson2");
    }


    @Test
    public void testCreatePerson(){

        Assert.assertEquals("Test", p.findById(1).getFirstName());
        Assert.assertEquals("Testson2", p.findById(2).getLastName());
    }

    @Test
    public void testSize(){
        int expected = 2;
        int actual = p.size();

        Assert.assertEquals(expected, actual);
        Assert.assertNotEquals(expected - 1, actual);
    }

    @Test
    public void testFindAll(){
        Assert.assertEquals(0, p.findAll());
    }
}
