# POC for HttpClient

```java
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

    ...codes...

OkHttpClient client = new OkHttpClient();

MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8");
RequestBody body = RequestBody.create(mediaType, "security=187");
Request request = new Request.Builder()
    .url("http://www.pse.com.ph/stockMarket/companyInfoHistoricalData.html?method=getRecentSecurityQuoteData&ajax=true")
    .post(body)
    .addHeader("referer", "http://www.pse.com.ph/")
    .build();

Response response = client.newCall(request).execute();
System.out.println(response.isSuccessful());
System.out.println(IOUtils.toString(response.body().byteStream(), "UTF-8"));
```
