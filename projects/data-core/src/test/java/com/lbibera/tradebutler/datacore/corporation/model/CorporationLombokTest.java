package com.lbibera.tradebutler.datacore.corporation.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Separate Lombok tests from regular business case tests
 */
@ExtendWith(SpringExtension.class) //Change this after upgrading to Spring Boot 2.0
public class CorporationLombokTest {

    @Test
    void accessorsAndMutatorsWithLombokShouldWork() {
        String name = "BDO Unibank, Inc.";
        String description = "BDO Unibank Inc. (BDO), originally known as Acme Savings Bank, was acquired by the SM Group in 1976. BDO listed its shares on the Philippine Stock Exchange on May 21, 2002. The Company merged with Equitable PCI Bank in May 2007. ";
        Sector sector = Sector.FINANCIALS;
        SubSector subSector = SubSector.BANKS;
        LocalDate incorporationDate = LocalDate.of(1968, 1, 2);

        Corporation corporation = new Corporation();
        corporation.setName(name);
        corporation.setDescription(description);
        corporation.setSector(sector);
        corporation.setSubSector(subSector);
        corporation.setIncorporationDate(incorporationDate);

        assertAll("Lombok Getters and Setters Should Work",
                ()-> assertEquals(name, corporation.getName()),
                ()-> assertEquals(description, corporation.getDescription()),
                ()-> assertEquals(name, corporation.getName()),
                ()-> assertEquals(incorporationDate, corporation.getIncorporationDate()),
                ()-> assertEquals(subSector, corporation.getSubSector()));
    }
}
