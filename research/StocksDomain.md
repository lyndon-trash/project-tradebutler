# Domain Research: Company, Securities, and Stock Prices

Entities: Version 0.1
```
                             +----------+
                       |----<| Dividend |
                       |     +----------+
                       |
 +-------- +       +----------+         +------------------ +
 | Company | ----< | Security | ------< | Historical Price  |
 +---------+       +----------+         +-------------------+
                       | 
                       |     +-----------+
                       |---1-| Sec Data  |
                             +-----------+

```

```
Company
- name

Security
- name
- code
- ISIN
- type
S(Common Shares), W(Warrants), M(Mutual Fund), P(Preferred Shares), G(Government Bond), D(Common Dollar), R(Philippine Deposit Receipts)
- sector
- subSector

Dividend
- type
- value
- exDate
- recordDate
- payableDate

Historical Price
- security
- company
- price
- date
- open
- high
- low
- volume
- value

Sec Data
```
