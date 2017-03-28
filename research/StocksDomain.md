# Domain Research: Company, Securities, and Stock Prices

Entities: Version 0.1
```
                              +----------+
                       |----< | Dividend |
                       |      +----------+
                       |
 +-------- +       +----------+         +-------------------+
 | Company | ----< | Security | ------< | Historical Price  |
 +---------+       +----------+         +-------------------+
                       | 
                       |      +-----------+
                       |----< | Sec Data  |
                              +-----------+

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

```
Sec Data
- ???
```

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

```
Sec Data
```

Sector List:
```
<select id="sector" name="sector" style="width:300px;">
<option value="ALL">ALL</option>
<option value="Financials">Financials</option>
<option value="Industrial">Industrial</option>
<option value="Holding Firms">Holding Firms</option>
<option value="Property">Property</option>
<option value="Services">Services</option>
<option value="Mining and Oil">Mining and Oil</option>
<option value="Small, Medium &amp; Emerging Board">Small, Medium &amp; Emerging Board</option>
<option value="ETF">ETF</option>
</select>
```

Subsector List:
```
<select id="subsector" name="subsector" style="width:300px;">
<option value="ALL">ALL</option>
<option value="Banks">Banks</option>
<option value="Other Financial Institutions">Other Financial Institutions</option>
<option value="Electricity, Energy, Power &amp; Water">Electricity, Energy, Power &amp; Water</option>
<option value="Food, Beverage &amp; Tobacco">Food, Beverage &amp; Tobacco</option>
<option value="Construction, Infra. &amp; Allied Services">Construction, Infra. &amp; Allied Services</option>
<option value="Chemicals">Chemicals</option>
<option value="Other Industrials">Other Industrials</option>
<option value="Holding Firms">Holding Firms</option>
<option value="Property">Property</option>
<option value="Media">Media</option>
<option value="Telecommunications">Telecommunications</option>
<option value="Information Technology">Information Technology</option>
<option value="Transportation Services">Transportation Services</option>
<option value="Hotel &amp; Leisure">Hotel &amp; Leisure</option>
<option value="Education">Education</option>
<option value="Other Services">Other Services</option>
<option value="Mining">Mining</option>
<option value="Oil">Oil</option>
<option value="Preferred">Preferred</option>
<option value="Warrants, Phil. Deposit Receipts, etc.">Warrants, Phil. Deposit Receipts, etc.</option>
<option value="Small, Medium &amp; Emerging Board">Small, Medium &amp; Emerging Board</option>
<option value="Bonds">Bonds</option>
<option value="Dollar Denominated Trading">Dollar Denominated Trading</option>
<option value="Electrical Components &amp; Equipment">Electrical Components &amp; Equipment</option>
<option value="Casinos &amp; Gaming">Casinos &amp; Gaming</option>
<option value="Retail">Retail</option>
<option value="ETF-Equity">ETF-Equity</option>
</select>
```
