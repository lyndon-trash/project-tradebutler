package com.lbibera.tradebutler.datacore.corporation.rest;

import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CorporationsRESTRepository extends PagingAndSortingRepository<Corporation, Long> {
}
