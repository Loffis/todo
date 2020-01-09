package se.ecutb.loffe.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonSequencerTest {

    @BeforeEach
    void setUp() {
        PersonSequencer.reset();
    }

    @Test
    public void nextIdIs1() {
        assertEquals(1, PersonSequencer.nextPersonId());
    }

}
