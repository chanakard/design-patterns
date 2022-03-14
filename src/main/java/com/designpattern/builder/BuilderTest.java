package com.designpattern.builder;

public class BuilderTest {

	public static void main(String[] args) {
		HttpClient client = new HttpClient(null, null, null, null, null, null);
		
		HttpClient withBuilder = new HttpClient.HttpClientBuilder().method("method").build();
		
		System.out.println(withBuilder);
	}

}
