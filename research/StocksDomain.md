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
- issueType 

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
