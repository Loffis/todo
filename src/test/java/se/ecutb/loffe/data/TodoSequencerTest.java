package se.ecutb.loffe.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoSequencerTest {

    @BeforeEach
    void setUp() {
        TodoSequencer.reset();
    }

    @Test
    void todoIdIs1() {
        assertEquals(1, TodoSequencer.nextTodoId());
    }
}