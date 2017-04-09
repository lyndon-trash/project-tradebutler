package com.lbibera.tradebutler.datacore.corporation.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Corporation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Temporal(TemporalType.DATE)
    Date incorporationDate;

    String name;
    String description;
    String sector;
    String subSector;
}
