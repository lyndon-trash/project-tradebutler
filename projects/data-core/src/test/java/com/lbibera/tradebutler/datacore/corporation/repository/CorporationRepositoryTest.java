package com.lbibera.tradebutler.datacore.corporation.repository;

import static org.junit.Assert.*;

import com.lbibera.tradebutler.datacore.corporation.model.Sector;
import com.lbibera.tradebutler.datacore.corporation.model.SubSector;
import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import com.lbibera.tradebutler.datacore.corporation.rest.CorporationsRESTRepository;
import com.lbibera.tradebutler.datacore.stock.model.IssueType;
import com.lbibera.tradebutler.datacore.stock.model.Stock;
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
    private CorporationsRESTRepository repository;

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
        sanMiguelCorporation.setSector(Sector.HOLDING_FIRMS);
        sanMiguelCorporation.setSubSector(SubSector.HOLDING_FIRMS);

        Stock smc = new Stock();
        smc.setSymbol("SMC");
        smc.setIssueType(IssueType.COMMON);
        smc.setName("San Miguel Corporation");

        Stock smc2d = new Stock();
        smc2d.setSymbol("SMC2D");
        smc2d.setIssueType(IssueType.PREFFERED);
        smc2d.setName("SMC Preffered Shares Series 2D");

        sanMiguelCorporation.setStocks(Arrays.asList(smc, smc2d));

        repository.save(sanMiguelCorporation);

        System.out.print("corporation:" + sanMiguelCorporation + ": " + smc + smc2d);

        assertNotNull(sanMiguelCorporation.getId());
        assertNotNull(smc.getId());
        assertNotNull(smc2d.getId());
    }
}
