# Domain Research: Company, Securities, and Stock Prices

Entities: Version 0.1
```                          +----------+
                       |----<| Dividend |
                       |     +----------+
                       |
 +-------- +       +----------+         +------------------ +
 | Company | ----< | Security | ------> | Historical Price  |
 +---------+       +----------+         +-------------------+
                       | 
                       |     +-----------+
                       |-----| Sec Data  |
                             +-----------+

```

```
Company
- name

Security
- company
- name
- code
- ISIN
- issueType (

SecurityPrice
- security
- company
- price
- date
```
