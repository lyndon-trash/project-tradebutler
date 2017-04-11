package com.lbibera.tradebutler.datacore.security.rest;

import com.lbibera.tradebutler.datacore.security.model.Security;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SecurityRESTRepository extends PagingAndSortingRepository<Security, Long> {
}
