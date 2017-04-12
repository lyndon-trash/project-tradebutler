package com.lbibera.tradebutler.datacore.historicalprice.rest;

import com.lbibera.tradebutler.datacore.historicalprice.model.HistoricalPrice;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface HistoricalPriceRESTRepository extends PagingAndSortingRepository<HistoricalPrice, Long> {
}
