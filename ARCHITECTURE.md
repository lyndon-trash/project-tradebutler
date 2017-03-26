# System Architecture

```
Version 0.1:
Alfred
- master data storage
- stores the following data: Stocks, StockPrice


Bautista
- harvests master data from the Phisix Server
- possibly illegal **wink**

+------------+
| PostgreSQL |
+------------+
      ^
      |
      |
+------------------+       +-----------------------------+
|Data Core (Alfred)|<----- |Phisix Data Miner (Bautista) |
+------------------+       +-----------------------------+
```
