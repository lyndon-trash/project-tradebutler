# Phisix API
http://www.pse.com.ph/stockMarket/home.html

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
