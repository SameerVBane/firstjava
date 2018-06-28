package com.sam.client;

import com.sam.helper.*;

public class TestClient2 extends Helper
{
// 2 methods implemented here and one method from helper class
	@Override
	public void morning() {
		// TODO Auto-generated method stub
		System.out.println(" test client2 Good Morning!!!");
	}

	@Override
	public void evening() {
		// TODO Auto-generated method stub
		System.out.println(" test client2 Good Evening!!!");	
	}
public static void main(String[] args)
{
	TestClient2 t = new TestClient2();
	t.morning();
	t.evening();
	t.night();
}
}
