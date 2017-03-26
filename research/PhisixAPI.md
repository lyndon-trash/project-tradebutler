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
         "listingDate":"2016-12-06 00:00:00.0",
         "securityType":"P",
         "subsectorName":"9",
         "indexName":"",
         "securitySymbol":"ALCPB",
         "securityName":"ARTHALAND CORPORATION SERIES \"B\" PERPETUAL PREFERRED SHARES",
         "companyId":"172",
         "companyName":"Arthaland Corporation",
         "securitySymbolId":"630"
      },
      {  
         "securityStatus":"S",
         "listingDate":"1973-03-22 00:00:00.0",
         "securityType":"S",
         "subsectorName":"8",
         "indexName":"",
         "securitySymbol":"AAA",
         "securityName":"ASIA AMALGAMATED HOLDINGS",
         "companyId":"55",
         "companyName":"Asia Amalgamated Holdings Corporation",
         "securitySymbolId":"347"
      },
      {  
         "securityStatus":"O",
         "listingDate":"2013-05-17 00:00:00.0",
         "securityType":"S",
         "subsectorName":"1",
         "indexName":"",
         "securitySymbol":"AUB",
         "securityName":"ASIA UNITED BANK CORPORATION",
         "companyId":"641",
         "companyName":"Asia United Bank Corporation",
         "securitySymbolId":"584"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1979-07-10 00:00:00.0",
         "securityType":"S",
         "subsectorName":"5",
         "indexName":"",
         "securitySymbol":"ABG",
         "securityName":"ASIABEST GROUP INTERNATIONAL INC.",
         "companyId":"176",
         "companyName":"Asiabest Group International Inc.",
         "securitySymbolId":"350"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1996-01-25 00:00:00.0",
         "securityType":"S",
         "subsectorName":"13",
         "indexName":"",
         "securitySymbol":"ATI",
         "securityName":"ASIAN TERMINALS, INC.",
         "companyId":"53",
         "companyName":"Asian Terminals, Inc.",
         "securitySymbolId":"141"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1970-11-17 00:00:00.0",
         "securityType":"S",
         "subsectorName":"17",
         "indexName":"",
         "securitySymbol":"AT",
         "securityName":"ATLAS CONSOLIDATED MINING & DEVELOPMENT CORPORATION",
         "companyId":"34",
         "companyName":"Atlas Consolidated Mining and Development Corporation",
         "securitySymbolId":"320"
      },
      {  
         "securityStatus":"S",
         "listingDate":"1948-01-08 00:00:00.0",
         "securityType":"S",
         "subsectorName":"17",
         "indexName":"",
         "securitySymbol":"AB",
         "securityName":"ATOK-BIG WEDGE COMPANY, INC. \"A\"",
         "companyId":"19",
         "companyName":"Atok-Big Wedge Co., Inc.",
         "securitySymbolId":"181"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1976-11-08 00:00:00.0",
         "securityType":"S",
         "subsectorName":"8",
         "indexName":"",
         "securitySymbol":"AC",
         "securityName":"AYALA CORPORATION",
         "companyId":"57",
         "companyName":"Ayala Corporation",
         "securitySymbolId":"180"
      },
      {  
         "securityStatus":"S",
         "listingDate":"2008-11-25 00:00:00.0",
         "securityType":"P",
         "subsectorName":"8",
         "indexName":"",
         "securitySymbol":"ACPA",
         "securityName":"AYALA CORPORATION PREFERRED CLASS \"A\" SHARES",
         "companyId":"57",
         "companyName":"Ayala Corporation",
         "securitySymbolId":"546"
      },
      {  
         "securityStatus":"O",
         "listingDate":"2006-07-21 00:00:00.0",
         "securityType":"P",
         "subsectorName":"8",
         "indexName":"",
         "securitySymbol":"ACPB1",
         "securityName":"AYALA CORPORATION PREFERRED CLASS \"B\" SHARES",
         "companyId":"57",
         "companyName":"Ayala Corporation",
         "securitySymbolId":"523"
      },
      {  
         "securityStatus":"O",
         "listingDate":"2014-11-05 00:00:00.0",
         "securityType":"P",
         "subsectorName":"8",
         "indexName":"",
         "securitySymbol":"ACPB2",
         "securityName":"Ayala Corporation Class \"B\" Series 2 Preferred Shares",
         "companyId":"57",
         "companyName":"Ayala Corporation",
         "securitySymbolId":"606"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1991-07-05 00:00:00.0",
         "securityType":"S",
         "subsectorName":"9",
         "indexName":"",
         "securitySymbol":"ALI",
         "securityName":"AYALA LAND, INC.",
         "companyId":"180",
         "companyName":"Ayala Land, Inc.",
         "securitySymbolId":"293"
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
         "listingDate":"2002-05-21 00:00:00.0",
         "securityType":"S",
         "subsectorName":"1",
         "indexName":"",
         "securitySymbol":"BDO",
         "securityName":"BDO UNIBANK, INC.",
         "companyId":"260",
         "companyName":"BDO Unibank, Inc.",
         "securitySymbolId":"468"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1973-04-02 00:00:00.0",
         "securityType":"S",
         "subsectorName":"8",
         "indexName":"",
         "securitySymbol":"BH",
         "securityName":"BHI HOLDINGS, INC.",
         "companyId":"62",
         "companyName":"BHI Holdings, Inc.",
         "securitySymbolId":"358"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1971-10-12 00:00:00.0",
         "securityType":"S",
         "subsectorName":"1",
         "indexName":"",
         "securitySymbol":"BPI",
         "securityName":"BANK OF THE PHILIPPINE ISLANDS",
         "companyId":"234",
         "companyName":"Bank of the Philippine Islands",
         "securitySymbolId":"101"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1973-10-16 00:00:00.0",
         "securityType":"S",
         "subsectorName":"3",
         "indexName":"",
         "securitySymbol":"BSC",
         "securityName":"BASIC ENERGY CORPORATION",
         "companyId":"60",
         "companyName":"Basic Energy Corporation",
         "securitySymbolId":"188"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1977-02-02 00:00:00.0",
         "securityType":"S",
         "subsectorName":"9",
         "indexName":"",
         "securitySymbol":"BEL",
         "securityName":"BELLE CORPORATION",
         "companyId":"21",
         "companyName":"Belle Corporation",
         "securitySymbolId":"252"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1950-01-04 00:00:00.0",
         "securityType":"S",
         "subsectorName":"17",
         "indexName":"",
         "securitySymbol":"BC",
         "securityName":"BENGUET CORPORATION \"A\"",
         "companyId":"108",
         "companyName":"Benguet Corporation",
         "securitySymbolId":"353"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1950-01-04 00:00:00.0",
         "securityType":"S",
         "subsectorName":"17",
         "indexName":"",
         "securitySymbol":"BCB",
         "securityName":"BENGUET CORPORATION \"B\"",
         "companyId":"108",
         "companyName":"Benguet Corporation",
         "securitySymbolId":"322"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1974-05-29 00:00:00.0",
         "securityType":"P",
         "subsectorName":"17",
         "indexName":"",
         "securitySymbol":"BCP",
         "securityName":"BENGUET CORPORATION - 8% CUMULATIVE CONVERTIBLE PREF. A",
         "companyId":"108",
         "companyName":"Benguet Corporation",
         "securitySymbolId":"354"
      },
      {  
         "securityStatus":"O",
         "listingDate":"1948-11-29 00:00:00.0",
         "securityType":"S",
         "subsectorName":"25",
         "indexName":"",
         "securitySymbol":"BCOR",
         "securityName":"BERJAYA PHILIPPINES, INC.",
         "companyId":"9",
         "companyName":"Berjaya Philippines Inc.",
         "securitySymbolId":"391"
      },
      {  
         "securityStatus":"O",
         "listingDate":"2000-10-17 00:00:00.0",
         "securityType":"S",
         "subsectorName":"25",
         "indexName":"",
         "securitySymbol":"BLOOM",
         "securityName":"BLOOMBERRY RESORTS CORPORATION",
         "companyId":"49",
         "companyName":"Bloomberry Resorts Corporation",
         "securitySymbolId":"233"
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
