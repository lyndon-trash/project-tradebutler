package com.lbibera.tradebutler.datacore.security.model;

public enum  TradingStatus {

    /**
     * Open for trading
     */
    OPEN,

    /**
     * Means the temporary stoppage or suspension of the trading of a listed security or suspension of trading in the Exchange
     * Not sure about this but PSE allows a trading halt up to 48 hours, otherwise you probably need to file a suspension.
     */
    HALT,

    /**
     * Similar to a trading halt but longer/indefinite duration
     */
    SUSPENSION,
}
