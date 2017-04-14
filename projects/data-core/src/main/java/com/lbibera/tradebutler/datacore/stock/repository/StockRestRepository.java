package com.lbibera.tradebutler.datacore.stock.repository;

import com.lbibera.tradebutler.datacore.stock.model.Stock;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StockRestRepository extends PagingAndSortingRepository<Stock, Long> {
}
