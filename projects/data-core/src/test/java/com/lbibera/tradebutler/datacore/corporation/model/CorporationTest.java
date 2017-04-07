package com.lbibera.tradebutler.datacore.corporation.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Demonstrate a simple JUnit5 Test
 */
@SpringJUnitConfig
public class CorporationTest {

    @Test
    void hasAllFields() {
        Corporation corporation = new Corporation();
        corporation.setName("test name");
        corporation.setDescription("test description");

        assertAll("corporation",
                ()-> assertEquals("test name", corporation.getName()),
                ()-> assertEquals("test description", corporation.getDescription()));
    }
}
