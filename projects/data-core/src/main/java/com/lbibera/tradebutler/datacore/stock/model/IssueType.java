package com.lbibera.tradebutler.datacore.stock.model;

/**
 * Types of Issued Stocks
 * http://www.investopedia.com/university/stocks/stocks2.asp
 */
public enum IssueType {

    /**
     * When people talk about stocks they are usually referring to common stock.
     * In fact, the great majority of stock is issued is in this form.
     * Common shares represent a claim on profits (dividends) and confer voting rights.
     *
     * Investors most often get one vote per share-owned to elect board members
     * who oversee the major decisions made by management
     */
    COMMON,

    /**
     * Preferred stock functions similarly to bonds,
     * and usually doesn't come with the voting rights.
     *
     * With preferred shares, investors are usually guaranteed a fixed dividend in perpetuity.
     * This is different from common stock which has variable dividends that are declared by the board of directors
     * and never guaranteed. In fact, many companies do not pay out dividends to common stock at all.
     */
    PREFERRED,
}
