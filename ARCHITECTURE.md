# System Architecture

#### Version 0.1:
```
Data Core
- master data storage
- stores the following data: Corporation, Stock, HistoricalPrice


Data Miner [PSE]
- harvests master data from the Phisix Server
- possibly illegal **wink**
- receives mining commands from a Messaging Queue (Kafka)
- for the current milestone, just manually send Messages to test functionality

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
