package com.lbibera.tradebutler.poc.requestspammer;

import static java.lang.String.format;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class Main {
	
	public static AtomicLong successCounter = new AtomicLong();
	public static AtomicLong failureCounter = new AtomicLong();

	public static void main(String[] args) {
		runInfinitely(Main::reportStatus, 10000);

		for (int i=0; i<50; i++) runInfinitely(Main::sendRequest, 1);
	}

	public static void runInfinitely(Runnable runnable, long msCooldown) {
		new Thread(() -> {
			while (true) {
				try {
					runnable.run();
					Thread.sleep(msCooldown);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public static void reportStatus() {
		System.out.println(format("Success: %s Failure: %s", successCounter.get(), failureCounter.get()));
	}

	public static void sendRequest() {
		try {
			OkHttpClient client = new OkHttpClient();

			MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8");
			RequestBody body = RequestBody.create(mediaType, "security=187");
			Request request = new Request.Builder()
					.url("http://www.pse.com.ph/stockMarket/companyInfoHistoricalData.html?method=getRecentSecurityQuoteData&ajax=true")
					.post(body)
					.addHeader("referer", "http://www.pse.com.ph/")
					.build();

			Response response;
			response = client.newCall(request).execute();
			if (response.isSuccessful()) {
				successCounter.incrementAndGet();
			} else {
				failureCounter.incrementAndGet();
			}
		} catch (IOException e) {
			failureCounter.incrementAndGet();
		}
	}
}
