package com.jahnestacado.chatari.db;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class ClientConnection {
	private final static JedisPool connectionPool = new ClientConnectionPool("localhost", 6379).getPool();
	
	public static Jedis create(){
		return connectionPool.getResource();
	}
}
