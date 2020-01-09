package se.ecutb.loffe.data;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.ecutb.loffe.model.Person;

import static org.junit.jupiter.api.Assertions.*;

public class PeopleTest {

    private People testObject;
    private Person testPerson;

    @BeforeEach
    public void setup(){
        testObject = new People();
        testObject.clear();
        PersonSequencer.reset();
        testPerson = testObject.createPerson("Test1", "Testson1");
        testObject.createPerson("Test2", "Testson2");
        testObject.createPerson("Test3", "Testson3");
    }


    @Test
    public void givenNamesCreatesPerson(){
        String firstName = "Test100", lastName = "Testson100";
        testObject.clear();
        Person result = testObject.createPerson(firstName, lastName);

        assertNotNull(result);
        assertTrue(result.getPersonId() > 0);
        assertEquals(1, testObject.size());
    }

    @Test
    public void findAllReturnArraySize(){
        Person[] result = testObject.findAll();

        assertEquals(3, result.length);
    }

    @Test
    public void given1FindByIdReturnTestPerson(){
        Person result = testObject.findById(1);
        assertEquals(1, result.getPersonId());
        assertEquals("Test1", result.getFirstName());
        assertEquals("Testson1", result.getLastName());
    }

    @Test
    public void given99FindByIdReturnNull(){
        Person result = testObject.findById(99);
        assertNull(result);
    }

}
