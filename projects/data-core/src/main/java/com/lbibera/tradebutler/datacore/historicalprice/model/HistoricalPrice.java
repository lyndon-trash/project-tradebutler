package com.lbibera.tradebutler.datacore.historicalprice.model;

import com.lbibera.tradebutler.datacore.stock.model.Stock;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Data
public class HistoricalPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    Stock stock;

    @Column
    LocalDate date;

    BigDecimal prev;
    BigDecimal open;
    BigDecimal close;
    BigDecimal high;
    BigDecimal low;
    BigInteger volume;

    /**
     * Average price for the day
     */
    BigDecimal price;

    /**
     * Total value turnover
     */
    BigDecimal value;

    /**
     * Percent change from previous trading day
     * -1.0 to 1.0
     */
    Float change;
}
