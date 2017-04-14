package com.lbibera.tradebutler.datacore.corporation.repository;

import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CorporationsRestRepository extends PagingAndSortingRepository<Corporation, Long> {
}
