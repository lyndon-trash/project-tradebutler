package com.lbibera.tradebutler.datacore.stock.repository;

import static org.junit.Assert.*;

import com.lbibera.tradebutler.datacore.stock.model.Stock;
import com.lbibera.tradebutler.datacore.stock.rest.StockRestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class StockRepositoryTest {

    @Autowired
    StockRestRepository repository;

    @Test
    @Sql
    public void findAllWithFirstPageShouldReturnFirstPage() {
        Pageable page = PageRequest.of(0, 10);
        Page<Stock> firstPage = repository.findAll(page);

        assertEquals("There should be 2 entries", 2, firstPage.getTotalElements());
    }
}
