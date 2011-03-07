package com.rabbitmq.socks.api;

public class ProtocolURL
{
	public ProtocolURL(final String protocol, final String url)
	{
		this.protocol = protocol;
		this.url = url;
	}
	
	public final String protocol;
	
	public final String url;
}
