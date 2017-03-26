# Phisix API
http://www.pse.com.ph/stockMarket/home.html

## Search Securities
POST
http://www.pse.com.ph/stockMarket/home.html?method=findSecurityOrCompany&ajax=true

Form Params:
```
start:0
limit:6
query:bdo
```
Response:
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
