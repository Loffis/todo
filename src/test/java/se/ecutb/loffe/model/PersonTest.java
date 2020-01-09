package se.ecutb.loffe.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonTest
{
    Person p;

    @BeforeEach
    public void setup(){
        p = new Person(1, "Kalle", "Karlsson");
    }

    @Test
    public void testGetName(){
        Assertions.assertEquals("Kalle", p.getFirstName());
    }

    @Test
    public void testGetLastName(){
        Assertions.assertEquals("Karlsson", p.getLastName());
    }

    @Test
    public void testGetPersonId(){
        Assertions.assertEquals(1, p.getPersonId());
    }

    @Test
    public void testSetFirstAndLastName(){
        p.setFirstName("Karl");
        p.setLastName("Son");
        Assertions.assertEquals("Karl", p.getFirstName());
        Assertions.assertEquals("Son", p.getLastName());
    }

}