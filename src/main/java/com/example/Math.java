package com.example;
public class Math {
    public int multiply(int a,int b){
        return a*b;
    }
	public int add(int a,int b){
		if(a>b){
			return a+b*a;
		}
		else{
			return a-b*a;
		}
    }
	public int subtraction(int x,int y){
        return x-y;
    }
}
