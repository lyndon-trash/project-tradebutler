# Phisix API
http://www.pse.com.ph/stockMarket/home.html

## List Securities/Company
```
POST
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getListedRecords&common=yes&ajax=true
```

###### Request:
```
Query Params:
method:getListedRecords
common:yes
ajax:true

Form Params:
start:25
limit:25
company:
sector:
subsector:
listingDate:
```

###### Response:
```json
{  
   "count":25,
   "totalCount":318,
   "records":[  
      {  
         "securityStatus":"O",
         "listingDate":"1996-03-19 00:00:00.0",
         "securityType":"S",
         "subsectorName":"9",
         "indexName":"",
         "securitySymbol":"ALCO",
         "securityName":"ARTHALAND CORPORATION",
         "companyId":"172",
         "companyName":"Arthaland Corporation",
         "securitySymbolId":"316"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1997-01-06 00:00:00.0",
         "securityType":"S",
         "subsectorName":"2",
         "indexName":"",
         "securitySymbol":"BLFI",
         "securityName":"BDO LEASING & FINANCE, INC.",
         "companyId":"31",
         "companyName":"BDO Leasing and Finance, Inc.",
         "securitySymbolId":"121"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1950-09-28 00:00:00.0",
         "securityType":"S",
         "subsectorName":"4",
         "indexName":"",
         "securitySymbol":"BMM",
         "securityName":"BOGO-MEDELLIN MILLING COMPANY",
         "companyId":"181",
         "companyName":"Bogo-Medellin Milling Company, Inc.",
         "securitySymbolId":"359"
      }
   ]
}
```

## Search Securities/Company
```
POST
http://www.pse.com.ph/stockMarket/home.html?method=findSecurityOrCompany&ajax=true
```

###### Request:
```
Query Params:
method:findSecurityOrCompany
ajax:true

Form Params:
start:0
limit:6
query:bdo
```
###### Response:
```json
{  
   "count":1,
   "totalCount":1,
   "records":[  
      {  
         "securityStatus":"O",
         "listedCompany_companyId":"260",
         "symbol":"BDO",
         "listedCompany_companyName":"BDO Unibank, Inc.",
         "securityId":"468",
         "securityName":"BDO UNIBANK, INC."
      }
   ]
}
```

## Company Info: Dividend Rights
```
POST
http://www.pse.com.ph/stockMarket/dividendRights.html?method=getDividends&ajax=true
```

###### Request:
```
Query Params:
method:getDividends
ajax:true

Form Params:
start:0
limit:5
secid:165
```

###### Response:
```json
{  
   "count":5,
   "totalCount":9,
   "records":[  
      {  
         "dividendType":"PROPERTY",
         "securityID":"165",
         "disclosureNo":"7730-2013",
         "dividendId":"PSE_DVDND20130000150",
         "dividendValue":"240,196,000 common shares of stock of Top Frontier Investment Holdings, Inc. (\"Top Frontier\")",
         "companyName":"San Miguel Corporation",
         "exDividendDate":"2013-10-30 00:00:00.0",
         "disclosureLocation":"/resource/disclosures/2013/pdf/dc2013-7730_SMC.pdf",
         "recordDate":"2013-11-05 00:00:00.0",
         "securitySymbol":"SMC",
         "disclosureID":"PSE_DSCLR20130009186",
         "securityName":"SAN MIGUEL CORPORATION",
         "companyId":"154"
      },
      {  
         "dividendType":"CASH",
         "securityID":"165",
         "disclosureNo":"4849-2013",
         "dividendId":"PSE_DVDND20130000071",
         "dividendValue":"P0.35 per common share",
         "companyName":"San Miguel Corporation",
         "exDividendDate":"2013-06-25 00:00:00.0",
         "disclosureLocation":"/resource/disclosures/2013/pdf/dc2013-4849_SMC.pdf",
         "recordDate":"2013-06-28 00:00:00.0",
         "disclosureID":"PSE_DSCLR20130006042",
         "securitySymbol":"SMC",
         "securityName":"SAN MIGUEL CORPORATION",
         "companyId":"154",
         "datePayable":"2013-07-15 00:00:00.0"
      },
      {  
         "dividendType":"CASH",
         "securityID":"165",
         "disclosureNo":"2879-2013",
         "dividendId":"PSE_DVDND2012022780",
         "dividendValue":"P0.35 per common share",
         "companyName":"San Miguel Corporation",
         "exDividendDate":"2013-04-23 00:00:00.0",
         "disclosureLocation":"/resource/disclosures/2013/pdf/dc2013-2879_SMC.pdf",
         "recordDate":"2013-04-26 00:00:00.0",
         "disclosureID":"PSE_DSCLR20130003693",
         "securitySymbol":"SMC",
         "securityName":"SAN MIGUEL CORPORATION",
         "companyId":"154",
         "datePayable":"2013-05-06 00:00:00.0"
      }
   ]
}
```

## Company Info: Fetch Headers
```
POST
http://www.pse.com.ph/stockMarket/companyInfo.html?method=fetchHeaderData&ajax=true
```

###### Request:
```
Query Params:
method:fetchHeaderData
ajax:true

Form Params:
company:154
security:165
```

###### Response:
```json
{  
   "count":1,
   "records":[  
      {  
         "headerSqLow":"103.0000000000",
         "headerFiftyTwoWeekHigh":"108.0000000000",
         "headerChangeClose":"-0.4000000000",
         "headerChangeClosePercChangeClose":"",
         "lastTradedDate":"2017-03-23 00:00:00.0",
         "headerTotalValue":"38,322,707.0000000000",
         "headerLastTradePrice":"104.0000000000",
         "headerSqHigh":"104.2000000000",
         "headerPercChangeClose":"-0.3831400000",
         "headerFiftyTwoWeekLow":"65.0000000000",
         "headerSqPrevious":"104.4000000000",
         "securitySymbol":"SMC",
         "headerCurrentPe":"41.1067193676",
         "headerSqOpen":"103.0000000000",
         "headerAvgPrice":"103.1816779301",
         "headerTotalVolume":"371,410.0000000000"
      }
   ]
}
```

## Company Info: Year Totals
```
POST
http://www.pse.com.ph/stockMarket/companyInfoSecurityInformation.html?method=getSecurityYearTotals&ajax=true
```

###### Request:
```
Query Params:
method:getSecurityYearTotals
ajax:true

Form Params:
security:468
```

###### Response:
```json
{  
   "count":7,
   "records":[  
      {  
         "valueTotal":6.5072100467509E10,
         "yearTotal":2016,
         "volumeTotal":6.09120401E8
      },
      {  
         "valueTotal":9.19579048577054E10,
         "yearTotal":2015,
         "volumeTotal":8.5895736E8
      },
      {  
         "valueTotal":1.002656749149182E11,
         "yearTotal":2014,
         "volumeTotal":1.100479842E9
      },
      {  
         "valueTotal":8.43445937861725E10,
         "yearTotal":2013,
         "volumeTotal":1.022895439E9
      },
      {  
         "valueTotal":5.746559362491E10,
         "yearTotal":2012,
         "volumeTotal":8.80561756E8
      },
      {  
         "valueTotal":3.770580104318E10,
         "yearTotal":2011,
         "volumeTotal":6.72513769E8
      },
      {  
         "valueTotal":3.2976476110758E10,
         "yearTotal":2010,
         "volumeTotal":6.76411464E8
      }
   ]
}
```
