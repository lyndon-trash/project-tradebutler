package com.lbibera.tradebutler.datacore.corporation.repository;

import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import com.lbibera.tradebutler.datacore.corporation.model.Sector;
import com.lbibera.tradebutler.datacore.corporation.model.SubSector;
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

import static org.junit.Assert.assertNotNull;


/**
 * Integration Test for Persisting the Corporation Entity
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CorporationRepositoryTest {

    @Autowired
    private CorporationsRestRepository repository;

    @Test
    @Sql
    public void findByIdShouldReturnCorrectCorporation() {
        Corporation actualCorporation = repository.findOne(1l).orElse(null);

        assertNotNull(actualCorporation);
    }

    @Test
    @Sql
    public void saveWithMultipleStocksShouldSaveSecuritiesTransitively() {
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
        smc2d.setIssueType(IssueType.PREFERRED);
        smc2d.setName("SMC Preffered Shares Series 2D");

        sanMiguelCorporation.setStocks(Arrays.asList(smc, smc2d));

        repository.save(sanMiguelCorporation);
        assertNotNull(sanMiguelCorporation.getId());

        Corporation afterSave = repository.findOne(sanMiguelCorporation.getId()).orElse(null);

        assertNotNull(afterSave);
        assertNotNull("SMC Stock should be present", afterSave.getStocks().get(0));
        assertNotNull("SMC Stock should be present", afterSave.getStocks().get(1));
        assertNotNull("SMC Stock should also have an id", afterSave.getStocks().get(0).getId());
        assertNotNull("SMC Stock should also have an id", afterSave.getStocks().get(1).getId());
    }
}
