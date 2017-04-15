package com.lbibera.tradebutler.datacore.corporation.model;

import com.lbibera.tradebutler.datacore.stock.model.IssueType;
import com.lbibera.tradebutler.datacore.stock.model.Stock;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, mappedBy = "corporation")
    List<Stock> stocks;

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

    public Optional<Stock> findPrimaryStock() {
        if (CollectionUtils.isEmpty(stocks)) return Optional.empty();

        return stocks.stream().filter(Stock::isCommonStock).findFirst();
    }
}
