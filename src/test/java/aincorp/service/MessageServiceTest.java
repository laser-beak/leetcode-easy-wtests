package aincorp.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceTest {

    @DisplayName("Test MessageService.get()")
    @Test
    void get() {
        assertEquals("Hello JUnit 5", MessageService.get());
    }
}