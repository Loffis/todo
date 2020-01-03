package se.ecutb.loffe.data;

import org.junit.Assert;
import org.junit.Test;

public class PersonSequencerTest {

    @Test
    public void testNextPersonId(){
        PersonSequencer.setPersonId(0);
        int before = PersonSequencer.getPersonId();
        PersonSequencer.nextPersonId();
        int after = PersonSequencer.getPersonId();
        Assert.assertNotEquals(before, after);
        Assert.assertEquals(1, after);

    }

    @Test
    public void testReset(){
        PersonSequencer.setPersonId(99);
        Assert.assertEquals(99, PersonSequencer.getPersonId());
        PersonSequencer.reset();
        Assert.assertEquals(0, PersonSequencer.getPersonId());
    }
}
