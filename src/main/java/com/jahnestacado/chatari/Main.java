package com.jahnestacado.chatari;

import com.jahnestacado.chatari.routes.Signup;

import spark.Spark;

public class Main {

	public static void main(String[] args) {
		Spark.staticFileLocation("/public");
		new Signup();
	}

}
