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
                       |----<| Sec Data  |
                             +-----------+

```

```
Company
- name
- description
- sector
- subSector
- incorporationDate
- numberOfDirectors
- stockHoldersMeeting
- fiscalYear
- officers
- boardOfDirectors

Sec Data
- ???

Security
- name
- symbol
- ISIN
unique identifier (https://en.wikipedia.org/wiki/International_Securities_Identification_Number)
- type
S(Common Shares), W(Warrants), M(Mutual Fund), P(Preferred Shares), G(Government Bond), 
D(Common Dollar), R(Philippine Deposit Receipts)
- sector
- subSector


Dividend
https://en.wikipedia.org/wiki/Dividend
- type (CASH, PROPERTY, STOCK, INTERIM, OTHER)
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
