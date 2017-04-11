# System Architecture

#### Version 0.1:
```
Data Core
- master data storage
- stores the following data: Corporation, Security, HistoricalPrice, Dividend


Data Miner [PSE]
- harvests master data from the Phisix Server
- possibly illegal **wink**
- receives mining commands from a Messaging Queue (Kafka)
- as of the moment, just manually send Messages to test functionality

+------------+
| PostgreSQL |
+------------+
      ↑
  Spring Data
      ↑
+--------------------+          +------------------------------------+          +---------------+
|      Data Core     | ← REST ← |           Data Miner[PSE]          | → REST → | PHISIX SERVER |
+--------------------+          +------------------------------------+          +---------------+
                                                   ↑
                                             Spring Integration
                                                   ↑
                                              +---------+
                                              |  Kafka  |
                                              +---------+
```

###### For Reference:
```
← ↑ → ↓ ↔ ↕ ↖ ↗ ↘ ↙
```
