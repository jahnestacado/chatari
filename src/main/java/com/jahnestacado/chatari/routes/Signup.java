package com.jahnestacado.chatari.routes;

import static spark.Spark.post;
import org.json.JSONObject; 

import com.jahnestacado.chatari.db.ClientConnection;

import redis.clients.jedis.Jedis;

public class Signup {
	
	public Signup(){
		post("/signup", (request, response) -> {
			final Jedis db = ClientConnection.create();
			final JSONObject body = new JSONObject(request.body());
			
			System.out.println(body.get("username"));
			System.out.println(body.get("password"));
			
			return "OK";
		});
		
	}
}
