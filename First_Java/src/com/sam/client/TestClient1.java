package com.sam.client;

import com.sam.declarations.Messages;

public class TestClient1 implements Messages{

	@Override
	public void morning() {
		// TODO Auto-generated method stub
		System.out.println("Good Morning!!!");
	}

	@Override
	public void evening() {
		// TODO Auto-generated method stub
		System.out.println("Good Evening!!!");	
	}

	public void night() {
		// TODO Auto-generated method stub
		System.out.println("Good Night!!!");
	}
	
	public static void main(String[] args)
	{
		TestClient1 t = new TestClient1();
		t.morning();
		t.evening();
		t.night();
	}

}
