package com.lbibera.tradebutler.datacore.corporation.model;

import com.lbibera.tradebutler.datacore.stock.model.Stock;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Corporation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * A corporation may issue multiple securities,
     * usually one common stock and many proffered shares.
     */
    @OneToMany(fetch = FetchType.EAGER)
    List<Stock> stocks;

    @Column
    LocalDate incorporationDate;

    String name;

    @Column(length = 10000)
    String description;

    /**
     * Refer to {@link Sector}
     */
    @Enumerated(EnumType.STRING)
    Sector sector;

    /**
     * Refer to {@link SubSector}
     */
    @Enumerated(EnumType.STRING)
    SubSector subSector;
}
