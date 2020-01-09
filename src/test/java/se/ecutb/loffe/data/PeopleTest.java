package se.ecutb.loffe.data;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeopleTest {

    People p;
    @BeforeEach
    public void setup(){
        p = new People();
        p.clear();
        p.createPerson("Test", "Testson");
        p.createPerson("Test2", "Testson2");
    }


    @Test
    public void testCreatePerson(){
        p = new People();
        p.clear();
        p.createPerson("Test", "Testson");
        p.createPerson("Test2", "Testson2");
        Assertions.assertEquals("Test", p.findById(1).getFirstName());
        Assertions.assertEquals("Testson2", p.findById(2).getLastName());
    }

    @Test
    public void testSize(){
        int expected = 2;
        int actual = p.size();

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expected - 1, actual);
    }

    @Test
    public void testFindAll(){
        Assertions.assertEquals(2, p.findAll().length);
    }
}
