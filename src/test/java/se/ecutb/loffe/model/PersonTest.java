package se.ecutb.loffe.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutb.loffe.model.Person;

public class PersonTest
{
    Person p;

    @Before
    public void setup(){
        p = new Person(1, "Kalle", "Karlsson");
    }

    @Test
    public void testGetName(){
        Assert.assertEquals("Kalle", p.getFirstName());
    }

    @Test
    public void testGetLastName(){
        Assert.assertEquals("Karlsson", p.getLastName());
    }

    @Test
    public void testGetPersonId(){
        Assert.assertEquals(1, p.getPersonId());
    }

    @Test
    public void testSetFirstAndLastName(){
        p.setFirstName("Karl");
        p.setLastName("Son");
        Assert.assertEquals("Karl", p.getFirstName());
        Assert.assertEquals("Son", p.getLastName());
    }

}