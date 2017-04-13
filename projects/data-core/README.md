# Data Core
Center of the Trade Butler System. Stores all polished data.

## Scope
- entity storage
```
Corporation
Stocks
HistoricalPrice
Dividend
```

## Build and Run: Maven Plugin for Spring Boot
```
mvnw clean package
mvnw spring-boot:run
```

## Build and Run: IntelliJ
```
Main Class: com.lbibera.tradebutler.datacore.DataCoreApplication
Program Arguments: --debug=true --management.security.enabled=false
```

## Configuration
```
Check:
src/resources/application.yml
```

## Others
- [Developer Notes](DEVELOPER-NOTES.md)
- [Setup: Data Core](SETUP.md)
- [Architecture](../../ARCHITECTURE.md)
- [Domain Model: Data Core](../../research/StocksDomain.md)
