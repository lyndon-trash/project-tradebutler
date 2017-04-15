package com.lbibera.tradebutler.datacore.corporation.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Sample code for Json Serialization/Deserialization Test
 */
@ExtendWith(SpringExtension.class) //Change this after upgrading to Spring Boot 2.0
@SpringBootTest
public class CorporationJsonTest {

    @Autowired
    ObjectMapper objectMapper;

    JacksonTester<Corporation> json;

    @BeforeEach
    public void setUp() {
        JacksonTester.initFields(this, objectMapper);
    }

    @Test
    public void serializeJsonWithValidCorporationShouldHaveIncorporationDate() throws IOException {
        Corporation corporation = new Corporation();
        corporation.setIncorporationDate(LocalDate.of(2017, 01, 02));

        assertThat(json.write(corporation)).hasJsonPathStringValue("@.incorporationDate");
    }

    @Test
    public void deserializeJsonWithValidCorporationShouldMatchExpectedObject() throws IOException {
        String corporationJson = "{\"incorporationDate\":\"2017-01-02\"}";
        Corporation corporationObject = new Corporation();
        corporationObject.setIncorporationDate(LocalDate.of(2017, 01, 02));

        assertThat(json.parse(corporationJson)).isEqualTo(corporationObject);
    }

}
