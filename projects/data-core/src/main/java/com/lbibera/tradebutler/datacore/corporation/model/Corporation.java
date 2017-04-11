package com.lbibera.tradebutler.datacore.corporation.model;

import com.lbibera.tradebutler.datacore.security.model.Security;
import lombok.Data;

import javax.persistence.*;
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
    List<Security> securities;

    @Column
    LocalDate incorporationDate;

    String name;
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
