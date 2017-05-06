# Project: Trade Butler
A trading assistant platform for assisting busy individuals with their stock portfolios. This problem is close to my heart and inspired by the manga "[Investor Z](http://animanga.wikia.com/wiki/Investor_Z)".

Beginner Investors Mostly Make the Following Common Mistakes:
- Failure to Make an Entry/Exit Strategy
- Failure to Plan for a Diversified Portfolio
- Failure to Research

#### References
- [Udemy: Python for Finance](https://www.udemy.com/python-for-finance-investment-fundamentals-data-analytics/learn/v4/overview)
- [Udemy; Microservices with Spring Cloud](https://www.udemy.com/microservices-with-spring-cloud/learn/v4/overview)

[System Architecture](ARCHITECTURE.md)

[Developer Notes](DEVELOPER-NOTES.md)


#### Problems:
- Correlate Historical Data with Historical Information
- Entry/Exit Strategy: figuring out when to buy and sell stocks
- Manage Portfolio Composition
- Pickles: identifying pickled stocks
- Research Consolidation: easy way to read updates and be alerted on selected companies

#### Components:
- [Data Core](projects/data-core)

## Roadmap
#### (CURRENT) Version 0.1: Basic Stock Data
- MasterList: PH Stock List
- Stock Prices (Daily Closing)

[System Architecture v0.1](ARCHITECTURE.md)

#### Version 0.2: User Management Endpoints
- User Management
- User Portfolio (Store By Transaction, Add Target BUY/SELL Points)
- Target Portfolio (Custom Portfolio, Shareable)
- PSE Index (Model Portfolio)
- Warning System for Price Ranges

#### Version 0.3: Mobile Client
- Web Mobile Client

#### Version 1.0: MVP
- Mobile Gateway
- User Security
- Inter-server Security
- Secure Kafka
- Remove all direct REST calls from server and move all communication to Kafka

#### Version 2.0: Historical Data
- Stock Prices (Historical Price Points)
- Research Consolidation
- Research Overlay
- Simple PDF files gathered from various sources

#### Version 3.0: Transaction Analysis
- Rating/Scoring Transaction Quality
- Post-Transaction Analysis: Identifying Optimal Selling Point

#### Version 4.0: User Sentiments
- User Sentiments on News




