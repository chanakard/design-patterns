package com.designpattern.builder;

public class HttpClient {

	private String method;
	private String url;
	private String userName;
	private String password;
	private String headers;
	private String body;

	public HttpClient(String method, String url, String userName, String password, String headers, String body) {
		super();
		this.method = method;
		this.url = url;
		this.userName = userName;
		this.password = password;
		this.headers = headers;
		this.body = body;
	}
	
	public HttpClient(HttpClientBuilder builder) {
		this.method = builder.method;
		this.url = builder.url;
		this.userName = builder.userName;
		this.password = builder.password;
		this.headers = builder.headers;
		this.body = builder.body;
	}
		
	
	public static class HttpClientBuilder{
		
		private String method;
		private String url;
		private String userName;
		private String password;
		private String headers;
		private String body;
		
		public HttpClientBuilder method(String method)
		{
			this.method = method;
			return this;
		}
		
		public HttpClientBuilder url(String url)
		{
			this.url = url;
			return this;
		}
		
		public HttpClientBuilder secure(String userName, String password)
		{
			this.userName = userName;
			this.password = password;
			return this;
		}
		
		public HttpClient build()
		{
			return new HttpClient(this);
		}
	}


	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", url=" + url + ", userName=" + userName + ", password=" + password
				+ ", headers=" + headers + ", body=" + body + "]";
	}
	
	
}
