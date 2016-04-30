package com.jahnestacado.chatari.db;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

public class ClientConnectionPool {
	private final JedisPool jedisPool;

	public ClientConnectionPool(String host, int port) {
		jedisPool = new JedisPool(new JedisPoolConfig(), host, port, Protocol.DEFAULT_TIMEOUT, null);
	}

	public JedisPool getPool() {
		return jedisPool;
	}
}
