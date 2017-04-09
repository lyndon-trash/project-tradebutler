package com.lbibera.tradebutler.datacore.corporation.repository;

import static org.junit.Assert.*;

import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import com.lbibera.tradebutler.datacore.corporation.rest.CorporationRestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;


/**
 * Integration Test for Persisting the Corporation Entity
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CorporationRepositoryTest {

    @Autowired
    private CorporationRestRepository repository;

    @Test
    @Sql
    public void findByIdShouldReturnCorrectCorporation() {
        Corporation actualCorporation = repository.findOne(1l).orElse(null);

        assertNotNull(actualCorporation);
    }
}
