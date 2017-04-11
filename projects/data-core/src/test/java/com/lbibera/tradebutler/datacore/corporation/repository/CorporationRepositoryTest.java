package com.lbibera.tradebutler.datacore.corporation.repository;

import static org.junit.Assert.*;

import com.lbibera.tradebutler.datacore.corporation.model.Sector;
import com.lbibera.tradebutler.datacore.corporation.model.SubSector;
import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import com.lbibera.tradebutler.datacore.corporation.rest.CorporationRestRepository;
import com.lbibera.tradebutler.datacore.security.model.IssueType;
import com.lbibera.tradebutler.datacore.security.model.Security;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;


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

    @Test
    @Sql
    public void saveWithMultipleSecuritiesShouldSaveSecuritiesTransitively() {
        Corporation sanMiguelCorporation = new Corporation();
        sanMiguelCorporation.setName("San Miguel Corporation");
        //sanMiguelCorporation.setSector(Sector.HOLDING_FIRMS);
        //sanMiguelCorporation.setSubSector(SubSector.HOLDING_FIRMS);

        Security smc = new Security();
        smc.setSymbol("SMC");
        smc.setIssueType(IssueType.COMMON);
        smc.setName("San Miguel Corporation");

        Security smc2d = new Security();
        smc2d.setSymbol("SMC2D");
        smc2d.setIssueType(IssueType.PREFFERED);
        smc2d.setName("SMC Preffered Shares Series 2D");

        //sanMiguelCorporation.setSecurities(Arrays.asList(smc, smc2d));

        repository.save(sanMiguelCorporation);

        assertNotNull(sanMiguelCorporation.getId());
        assertNotNull(smc.getId());
        assertNotNull(smc2d.getId());
    }
}
