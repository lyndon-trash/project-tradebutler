package com.lbibera.tradebutler.datacore.stock.model;

import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    Corporation corporation;

    /**
     * Unique identifier across international markets.
     * International Securities Identification Number
     *
     * An International Securities Identification Number (ISIN) uniquely identifies a stock.
     * Its structure is defined in ISO 6166. Securities for which ISINs are issued include bonds,
     * commercial paper, stocks and warrants.
     * The ISIN code is a 12-character alpha-numerical code that
     * does not contain information characterizing financial instruments but serves for uniform identification
     * of a stock through normalization of the assigned National Number, where one exists, at trading and settlement.
     * Securities to which ISINs can be issued include debt securities, shares, options, derivatives and futures.
     * ISIN cannot specify a particular trading location in this case, and another identifier,
     * typically MIC (Market Identifier Code) or the three-letter exchange code,
     * will have to be specified in addition to the ISIN.
     * The Currency of the trade will also be required to uniquely identify the instrument using this method.
     *
     * Source: {@link https://en.wikipedia.org/wiki/International_Securities_Identification_Number}
     */
    String isin;

    /**
     * Refer to {@link IssueType}
     */
    @Enumerated(EnumType.STRING)
    IssueType issueType;

    /**
     * Refer to {@link TradingStatus}
     */
    @Enumerated(EnumType.STRING)
    TradingStatus status;

    Integer sortOrder;
    String name;
    String symbol;

    LocalDate listingDate;

    /**
     * A board lot is a standardized number of shares defined by a stock exchange as a trading unit.
     * In most cases, this means 100 shares.
     * The purpose of a board lot is to avoid "odd lots" and to facilitate easier trading.
     * It's more difficult for a broker to find a buyer for, say, 17 shares,
     * than if everybody agrees to trade in 100 share lots
     *
     * Source: {@link http://www.investopedia.com/terms/b/boardlot.asp}
     */
    Integer boardLot;

    /**
     * The price the stock is offered at is called the fixed liquidation value, or par value (just like a bond).
     * So if the company gets liquidated due to bankruptcy or similar event,
     * holders of preferred stock should get repaid with this value.
     */
    BigDecimal parValue;

    /**
     * Maximum percentage of shares allowed to foreign investors.
     * 0 to 100.0
     */
    Float foreignOwnershipLimit;
}
