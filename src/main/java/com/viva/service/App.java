package com.viva.service;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition : "+add(a,b));
        System.out.println("Subtraction : "+sub(a,b));
        System.out.println("Multiplication : "+mul(a,b));
        System.out.println("Division : "+div(a,b));
    }
    
    public static int add(int a,int b){
    	return a+b;
    }
    
    public static int sub(int a,int b){
    	return a-b;
    }
    
    public static int mul(int a,int b){
    	return a*b;
    }
    
    public static float div(int a,int b){
    	return (float)a/b;
    }
}
