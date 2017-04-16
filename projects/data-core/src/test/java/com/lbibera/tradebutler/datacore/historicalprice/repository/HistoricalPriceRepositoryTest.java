package com.lbibera.tradebutler.datacore.historicalprice.repository;

import com.lbibera.tradebutler.datacore.historicalprice.model.HistoricalPrice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
@Sql
public class HistoricalPriceRepositoryTest {

    @Autowired
    HistoricalPriceRestRepository restRepository;

    @Test
    public void findAllWithFirstPageShouldReturnAll() {
        Page<HistoricalPrice> allHistoricalPrice = restRepository.findAll(new PageRequest(0, 10));

        assertEquals("There should be 5 Historical Prices", 5, allHistoricalPrice.getTotalElements());
    }
}
