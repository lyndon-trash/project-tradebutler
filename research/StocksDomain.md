# Domain Research: Company, Securities, and Stock Prices

Entities: Version 0.1
```
                                        +----------+
                       |--------------< | Dividend |
                       |                +----------+
                       |
 +-------- +       +----------+         +-------------------+
 | Company | ----< | Security | ------< | Historical Price  |
 +---------+       +----------+         +-------------------+
```


###### Company
|  Field                |  Type             |  Description  |
|-----------------------|-------------------|---------------|
| name                  |  String           |               |
| description           |  String           |               |
| sector                |  String           |               |
| subSector             |  String           |               |
| incorporationDate     |  String           |               |
| numberOfDirectors     |  Integer          |               |
| stockHoldersMeeting   |  Date             |               |
| fiscalYear            |  Date             |               |
| officers              |  List<String>     |               |
| boardOfDirectors      |  List<String>     |               |


###### Security
|  Field                |  Type             |  Description  |
|-----------------------|-------------------|---------------|
| company               |  Company           |               |
| name                  |  String           |               |
| symbol                |  String           |               |
| ISIN                  |  String           | unique identifier (https://en.wikipedia.org/wiki/International_Securities_Identification_Number) |
| type                  |  String           | S(Common Shares), W(Warrants), M(Mutual Fund), P(Preferred Shares), G(Government Bond), D(Common Dollar), R(Philippine Deposit Receipts)            |
| status                |  String           | O(Open)       |
| sector                |  String           |               |
| subSector             |  String           |               |
| listingDate           |  LocalDate        |               |
| boardLot              |  Integer          |               |
| parValue              |  BigDecimal       |               |
| foreignOwnershipLimit |  Float            | 0 to 1        |


###### Dividend
|  Field                |  Type             |  Description  |
|-----------------------|-------------------|---------------|
| security              |  Security         |               |
| type                  |  String           |  CASH, PROPERTY, STOCK, INTERIM, OTHER  |
| value                 |  String?          |               |
| exDate                |  LocalDate        |               |
| recordDate            |  LocalDate        |               |
| payableDate           |  LocalDate        |               |


###### Historical Price
|  Field                |  Type             |  Description  |
|-----------------------|-------------------|---------------|
| security              |  Security         |               |
| date                  |  LocalDate        |               |
| open                  |  BigDecimal       |               |
| close                 |  BigDecimal       |               |
| high                  |  BigDecimal       |               |
| low                   |  BigDecimal       |               |
| volume                |  BigInteger       |               |
| price                 |  BigDecimal       |               |
| value                 |  BigDecimal       |               |


Sectors:
```
Financials
Industrial
Holding Firms
Property
Services
Mining and Oil
Small, Medium &amp; Emerging Board
ETF
```

Subsectors:
```
Banks
Other Financial Institutions
Electricity, Energy, Power & Water
Food, Beverage & Tobacco
Construction, Infra. & Allied Services
Chemicals
Other Industrials
Holding Firms
Property
Media
Telecommunications
Information Technology
Transportation Services
Hotel & Leisure
Education
Other Services
Mining
Oil
Preferred
Warrants, Phil. Deposit Receipts, etc.
Small, Medium & Emerging Board
Bonds
Dollar Denominated Trading
Electrical Components & Equipment
Casinos & Gaming
Retail
ETF-Equity
```
