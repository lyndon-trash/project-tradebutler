package com.lbibera.tradebutler.datacore.corporation.model;

import com.lbibera.tradebutler.datacore.stock.model.IssueType;
import com.lbibera.tradebutler.datacore.stock.model.Stock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Demonstrate a simple JUnit5 Test
 */
@ExtendWith(SpringExtension.class) //Change this after upgrading to Spring Boot 2.0
public class CorporationTest {

    @Test
    void findPrimaryStockWithValidStockShouldReturnPrimaryStock() {
        Corporation corporation = new Corporation();

        List<Stock> stocks = new ArrayList<>(3);
        Stock preferredStock = new Stock();
        preferredStock.setIssueType(IssueType.PREFERRED);
        stocks.add(preferredStock);
        Stock unclassifiedStock = new Stock();
        stocks.add(unclassifiedStock);
        Stock commonStock = new Stock();
        commonStock.setIssueType(IssueType.COMMON);
        stocks.add(commonStock);
        corporation.setStocks(stocks);

        assertEquals(commonStock, corporation.findPrimaryStock().get());
    }
}
