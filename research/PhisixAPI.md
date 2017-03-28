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

## Company Data:
```
POST
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getSecuritiesByCompany&ajax=true
```
###### Request:
###### Response:
```json
{  
   "count":1,
   "records":[  
      {  
         "foreignLimit":40,
         "yearEndEPSDate":"2015-12-31 00:00:00.0",
         "listingDate":"2002-05-21 00:00:00.0",
         "securityID":"468",
         "interimPeriod":"9 months Sep-30",
         "listedShares":4.366889524E9,
         "subsector":"ph.com.headway.model.Subsector@768f7242[subsectorID=1]",
         "yearEndEPS":6.84,
         "priorClose":120,
         "securityStatus":"O",
         "freeFloatLevel":45,
         "securityISIN":"PHY077751022",
         "interimEPS":5.2,
         "securityType":"S",
         "parValue":10,
         "boardLot":10,
         "securitySymbol":"BDO",
         "stockTransferAgent":"ph.com.headway.model.StockTransferAgent@439687dd[staID=PSE_STA2009000000026]",
         "outstandingShares":4.367024454E9
      }
   ]
}
```

## Historical Data: Security Quote
```
POST
http://www.pse.com.ph/stockMarket/companyInfoHistoricalData.html?method=getRecentSecurityQuoteData&ajax=true
```

###### Request:
```
Query Params:
method:getRecentSecurityQuoteData
ajax:true

Form Params:
security:146
```

###### Response:
```json
{  
   "count":30,
   "records":[  
      {  
         "sqLow":8.5,
         "sqOpen":8.5,
         "sqHigh":8.75,
         "percChangeClose":2.94118,
         "sqClose":8.75,
         "secQid":"SCYQT_20170300014226",
         "changeClose":0.25,
         "totalValue":2407765,
         "totalVolume":277500,
         "lastTradePrice":8.75,
         "avgPrice":8.67663063063063,
         "tradingDate":"2017-03-24 00:00:00.0",
         "sqPrevious":8.5
      },
      {  
         "sqLow":8.35,
         "sqOpen":8.4,
         "sqHigh":8.63,
         "percChangeClose":1.19048,
         "sqClose":8.5,
         "secQid":"SCYQT_20170300013990",
         "changeClose":0.1,
         "totalValue":1982294,
         "totalVolume":231700,
         "lastTradePrice":8.5,
         "avgPrice":8.55543375053949,
         "tradingDate":"2017-03-23 00:00:00.0",
         "sqPrevious":8.4
      }
      {  
         "sqLow":7.75,
         "sqOpen":7.79,
         "sqHigh":7.9,
         "percChangeClose":1.026957,
         "sqClose":7.87,
         "secQid":"SCYQT_20170200007497",
         "changeClose":0.07999992,
         "totalValue":563237,
         "totalVolume":71800,
         "lastTradePrice":7.87,
         "avgPrice":7.844526462395543,
         "tradingDate":"2017-02-13 00:00:00.0",
         "sqPrevious":7.79
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

## Others: Security Type
```
GET
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getSecurityTypes&ajax=true&_dc=1490519319702
```

###### Request:
```
Query Params:
method:getSecurityTypes
ajax:true
```

###### Response:
```json
{  
   "count":7,
   "records":[  
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Common",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"S"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Warrants",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"W"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Mutual Fund",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"M"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Preferred",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"P"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Government Bond",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"G"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Common Dollar",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"D"
      },
      {  
         "declaringClass":"class ph.com.headway.model.SecurityType",
         "name":"Philippine Deposit Receipts",
         "class":"class ph.com.headway.model.SecurityType",
         "code":"R"
      }
   ]
}
```

## Others: Sector
```
GET
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getSectors&ajax=true&_dc=1490519319799
```

###### Request
```
Query Params:
method:getSectors
ajax:true
```

###### Response
```json
{  
   "count":10,
   "records":[  
      {  
         "indexId":"PSE_MKTIN20080000001",
         "isSectoral":"Y",
         "sortOrder":2,
         "indexName":"All Shares",
         "indexAbb":"ALL"
      },
      {  
         "indexId":"PSE_MKTIN20080000002",
         "isSectoral":"N",
         "sortOrder":1,
         "indexName":"PSEi",
         "indexAbb":"PSE"
      },
      {  
         "indexId":"PSE_MKTIN20080000003",
         "isSectoral":"Y",
         "sortOrder":3,
         "indexName":"Financials",
         "indexAbb":"FIN"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "isSectoral":"Y",
         "sortOrder":4,
         "indexName":"Industrial",
         "indexAbb":"IND"
      },
      {  
         "indexId":"PSE_MKTIN20080000004",
         "isSectoral":"Y",
         "sortOrder":5,
         "indexName":"Holding Firms",
         "indexAbb":"HDG"
      },
      {  
         "indexId":"PSE_MKTIN20080000007",
         "isSectoral":"Y",
         "sortOrder":7,
         "indexName":"Mining and Oil",
         "indexAbb":"M-O"
      },
      {  
         "indexId":"PSE_MKTIN20080000005",
         "isSectoral":"Y",
         "sortOrder":8,
         "indexName":"Property",
         "indexAbb":"PRO"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "isSectoral":"Y",
         "sortOrder":6,
         "indexName":"Services",
         "indexAbb":"SVC"
      },
      {  
         "indexId":"PSE_MKTIN20080000009",
         "isSectoral":"Y",
         "sortOrder":9,
         "indexName":"SME",
         "indexAbb":"SME"
      },
      {  
         "indexId":"PSE_MKTIN20080000010",
         "isSectoral":"Y",
         "sortOrder":9,
         "indexName":"ETF Equity",
         "indexAbb":"ETF"
      }
   ]
}
```

## Others: Sub-sector
```
GET
http://www.pse.com.ph/stockMarket/companyInfoSecurityProfile.html?method=getSubsectors&ajax=true&_dc=1490519319900
```

###### Request
```
Query Params:
method:getSubsectors
ajax:true
```

###### Response
```json
{  
   "count":27,
   "records":[  
      {  
         "indexId":"PSE_MKTIN20080000003",
         "subsectorName":"Banks",
         "subsectorID":"1"
      },
      {  
         "indexId":"PSE_MKTIN20080000003",
         "subsectorName":"Other Financial Institutions",
         "subsectorID":"2"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Electricity, Energy, Power & Water",
         "subsectorID":"3"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Food, Beverage & Tobacco",
         "subsectorID":"4"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Construction, Infra. & Allied Services",
         "subsectorID":"5"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Chemicals",
         "subsectorID":"6"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Other Industrials",
         "subsectorID":"7"
      },
      {  
         "indexId":"PSE_MKTIN20080000004",
         "subsectorName":"Holding Firms",
         "subsectorID":"8"
      },
      {  
         "indexId":"PSE_MKTIN20080000005",
         "subsectorName":"Property",
         "subsectorID":"9"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Media",
         "subsectorID":"10"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Telecommunications",
         "subsectorID":"11"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Information Technology",
         "subsectorID":"12"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Transportation Services",
         "subsectorID":"13"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Hotel & Leisure",
         "subsectorID":"14"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Education",
         "subsectorID":"15"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Other Services",
         "subsectorID":"16"
      },
      {  
         "indexId":"PSE_MKTIN20080000007",
         "subsectorName":"Mining",
         "subsectorID":"17"
      },
      {  
         "indexId":"PSE_MKTIN20080000007",
         "subsectorName":"Oil",
         "subsectorID":"18"
      },
      {  
         "subsectorName":"Preferred",
         "subsectorID":"19"
      },
      {  
         "subsectorName":"Warrants, Phil. Deposit Receipts, etc.",
         "subsectorID":"20"
      },
      {  
         "indexId":"PSE_MKTIN20080000009",
         "subsectorName":"Small, Medium & Emerging Board",
         "subsectorID":"21"
      },
      {  
         "subsectorName":"Bonds",
         "subsectorID":"22"
      },
      {  
         "subsectorName":"Dollar Denominated Trading",
         "subsectorID":"23"
      },
      {  
         "indexId":"PSE_MKTIN20080000008",
         "subsectorName":"Electrical Components & Equipment",
         "subsectorID":"24"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Casinos & Gaming",
         "subsectorID":"25"
      },
      {  
         "indexId":"PSE_MKTIN20080000006",
         "subsectorName":"Retail",
         "subsectorID":"26"
      },
      {  
         "indexId":"PSE_MKTIN20080000010",
         "subsectorName":"ETF-Equity",
         "subsectorID":"27"
      }
   ]
}
```

## Disclosures: Unstructured Types
```
GET
http://www.pse.com.ph/stockMarket/disclosuresDisclosures.html?method=getUnstructuredTypes&ajax=true&_dc=1490521494863
```

###### Request:
```
method:getUnstructuredTypes
ajax:true
_dc:1490521494863
```

###### Response:
```json
{  
   "count":17,
   "records":[  
      {  
         "formTypeId":"17-C",
         "unstructuredType":"Company Announcements",
         "categoryCode":"CDIS",
         "utId":"PSE_UNTYP20080000001"
      },
      {  
         "formTypeId":"20-IS\n",
         "unstructuredType":"Definitive Information Statement",
         "categoryCode":"DINF",
         "utId":"PSE_UNTYP20080000002"
      },
      {  
         "formTypeId":"17-C",
         "unstructuredType":"Dividend Notice",
         "categoryCode":"DIV",
         "utId":"PSE_UNTYP20080000003"
      },
      {  
         "formTypeId":"23-A",
         "unstructuredType":"Initial Statement of Beneficial Ownership of Securities ",
         "categoryCode":"BOR",
         "utId":"PSE_UNTYP20080000004"
      },
      {  
         "unstructuredType":"Notice of Analysts'/Investors' Briefing",
         "categoryCode":"NAIB",
         "utId":"PSE_UNTYP20080000006"
      },
      {  
         "formTypeId":"17-L",
         "unstructuredType":"Request for extension to file SEC Form 17-A/SEC Form 17-Q",
         "categoryCode":"NIF",
         "utId":"PSE_UNTYP20080000007"
      },
      {  
         "unstructuredType":"Others",
         "categoryCode":"OTHD",
         "utId":"PSE_UNTYP20080000008"
      },
      {  
         "formTypeId":"20-IS",
         "unstructuredType":"Preliminary Information Statement ",
         "categoryCode":"INFO",
         "utId":"PSE_UNTYP20080000009"
      },
      {  
         "formTypeId":"18-A",
         "unstructuredType":"Report by Owner of More Than Five Percent",
         "categoryCode":"OMFP",
         "utId":"PSE_UNTYP20080000010"
      },
      {  
         "unstructuredType":"Report on Lost Stock Certificates",
         "categoryCode":"LOST",
         "utId":"PSE_UNTYP20080000011"
      },
      {  
         "formTypeId":"18-AS",
         "unstructuredType":"Short Form Report by Certain Institutional Owners of More Than Five Percent",
         "categoryCode":"CIOM",
         "utId":"PSE_UNTYP20080000013"
      },
      {  
         "formTypeId":"23-B",
         "unstructuredType":"Statement of Changes in Beneficial Ownership of Securities ",
         "categoryCode":"CBOS",
         "utId":"PSE_UNTYP20080000014"
      },
      {  
         "unstructuredType":"Stock Rights Notice",
         "categoryCode":"RGTS",
         "utId":"PSE_UNTYP20080000015"
      },
      {  
         "formTypeId":"19-1",
         "unstructuredType":"Tender Offer Report ",
         "categoryCode":"TEND",
         "utId":"PSE_UNTYP20080000016"
      },
      {  
         "unstructuredType":"Verification of Mines and Geosciences Bureau",
         "categoryCode":"VBM",
         "utId":"PSE_UNTYP20080000017"
      },
      {  
         "unstructuredType":"Verification of Department of Energy",
         "categoryCode":"VDE",
         "utId":"PSE_UNTYP20080000018"
      },
      {  
         "formTypeId":"17-C",
         "unstructuredType":"Annual/Special Stockholders' Meeting",
         "categoryCode":"SM",
         "utId":"PSE_UNTYP20080000020"
      }
   ]
}
```

## Circulars
```
POST
http://www.pse.com.ph/stockMarket/disclosuresDisclosures.html?method=searchCompanyDisclosures&ajax=true
```

###### Request:
```
Query Params:
method:getCircularsForThisDate
ajax:true

Form Params:
start:0
limit:15
circularType:ALL TYPES
```

###### Response:
```json
{  
   "count":15,
   "totalCount":735,
   "records":[  
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-03-21 00:00:00.0",
         "circularTitle":"DDS Training Session",
         "noOfPages":4,
         "endDate":"2017-03-24 00:00:00.0",
         "dateUploaded":"2017-03-21 17:57:53.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0013.pdf",
         "circularID":"CN_2017-0013"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-03-20 00:00:00.0",
         "circularTitle":"5th Asia Pacific Real Estate Investment Summit Philippines",
         "noOfPages":4,
         "endDate":"2017-04-01 00:00:00.0",
         "dateUploaded":"2017-03-20 14:03:27.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0012.pdf",
         "circularID":"CN_2017-0012"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-03-15 00:00:00.0",
         "circularTitle":"Share Allocation to Trading Participants during Public Offering of Dollar Denominated Securities",
         "noOfPages":1,
         "endDate":"2017-05-15 00:00:00.0",
         "dateUploaded":"2017-03-15 12:03:09.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0011.pdf",
         "circularID":"CN_2017-0011"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-03-02 00:00:00.0",
         "circularTitle":"PSE Cash Dividends",
         "noOfPages":7,
         "endDate":"2017-04-27 00:00:00.0",
         "dateUploaded":"2017-03-02 12:10:29.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0010.pdf",
         "circularID":"CN_2017-0010"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-03-01 00:00:00.0",
         "circularTitle":"Additional Revisions to the Proposed Listing Rule Amendment",
         "noOfPages":5,
         "endDate":"2017-03-10 00:00:00.0",
         "dateUploaded":"2017-03-01 17:53:16.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0009.pdf",
         "circularID":"CN_2017-0009"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-02-22 00:00:00.0",
         "circularTitle":"RECOMPOSITION OF PSE INDICES",
         "noOfPages":7,
         "endDate":"2017-03-22 00:00:00.0",
         "dateUploaded":"2017-02-22 12:30:12.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0008.pdf",
         "circularID":"CN_2017-0008"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-01-25 00:00:00.0",
         "circularTitle":"PSE LIBRARY & INVESTORS' LOUNGE CLOSED ON FEBRUARY 9, 2017",
         "noOfPages":1,
         "endDate":"2017-02-09 00:00:00.0",
         "dateUploaded":"2017-01-25 14:24:44.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0007.pdf",
         "circularID":"CN_2017-0007"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-01-20 00:00:00.0",
         "circularTitle":"Reminder for the Submission of the 2016 Corporate Governance Guidelines Disclosure Survey",
         "noOfPages":37,
         "endDate":"2017-04-07 00:00:00.0",
         "dateUploaded":"2017-01-20 14:20:02.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0006(1).pdf",
         "circularID":"CN_2017-0006"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-01-19 00:00:00.0",
         "circularTitle":"Proposed SEC Rules and Regulations Governing the Registration and Trading of Structured Warrants",
         "noOfPages":22,
         "endDate":"2017-02-10 00:00:00.0",
         "dateUploaded":"2017-01-19 09:26:27.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0005.pdf",
         "circularID":"CN_2017-0005"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-01-17 00:00:00.0",
         "circularTitle":"EXTENSION of Survey on the 2016 Code of Corporate Governance",
         "noOfPages":1,
         "endDate":"2017-01-27 00:00:00.0",
         "dateUploaded":"2017-01-17 10:06:48.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0004.pdf",
         "circularID":"CN_2017-0004"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-01-12 00:00:00.0",
         "circularTitle":"ING BANK N.V., MANILA BRANCH - Accredited Firm for Issuing Fairness Opinions and Valuation Reports",
         "noOfPages":2,
         "endDate":"2018-01-12 00:00:00.0",
         "dateUploaded":"2017-01-12 16:15:37.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0003.pdf",
         "circularID":"CN_2017-0003"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-01-09 00:00:00.0",
         "circularTitle":"Updated List of Shariah-Compliant Securities",
         "noOfPages":4,
         "endDate":"2017-01-23 00:00:00.0",
         "dateUploaded":"2017-01-09 09:22:30.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0002.pdf",
         "circularID":"CN_2017-0002"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2017-01-04 00:00:00.0",
         "circularTitle":"Additional Training Sessions on Dollar Denominated Securities",
         "noOfPages":3,
         "endDate":"2017-01-11 00:00:00.0",
         "dateUploaded":"2017-01-04 16:51:48.0",
         "circularLocation":"/resource/memos/2017/CN_2017-0001.pdf",
         "circularID":"CN_2017-0001"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2016-12-27 00:00:00.0",
         "circularTitle":"Survey on the 2016 Code of Corporate Governance for Publicly Listed Companies",
         "noOfPages":1,
         "endDate":"2017-01-11 00:00:00.0",
         "dateUploaded":"2016-12-27 11:15:58.0",
         "circularLocation":"/resource/memos/2016/CN_2016-0087.pdf",
         "circularID":"CN_2016-0087"
      },
      {  
         "circularType":"CIRCULAR",
         "startDate":"2016-12-20 00:00:00.0",
         "circularTitle":"Proposed Amendment to the Listing Rules",
         "noOfPages":4,
         "endDate":"2016-12-29 00:00:00.0",
         "dateUploaded":"2016-12-20 18:09:12.0",
         "circularLocation":"/resource/memos/2016/CN_2016-0086.pdf",
         "circularID":"CN_2016-0086"
      }
   ]
}
```
