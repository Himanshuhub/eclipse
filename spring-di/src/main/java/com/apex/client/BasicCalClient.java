package com.apex.client;

import com.apex.server.BasicCalc;

public class BasicCalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalc n = new BasicCalc();
		int a = n.add(2, 4);
		int b = n.sub(4, 2);
		int c = n.mult(4, 2);
		int d = n.div(4, 2);
		int e = n.quo(4, 2);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}