package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	boolean q = true;
    	
    	while(q) {
    		System.out.print(">> ");
    		String insult = sc.nextLine();
    		
    		if(insult.equals("/q")) {
    			q = false;
    			System.out.println("종료합니다.");
    			sc.close();
    			break;
    		}
    		
    		try {
    			String[] split = insult.split(" ");
    		
    			int a = Integer.parseInt(split[0]);
    			int b = Integer.parseInt(split[2]);
    		
    			switch (split[1]) {
    			
    			case "+": Add add = new Add();
    				add.setValue(a, b);
    				System.out.println(">> " + add.calculate());
    				break;
    				
    			case "-": Sub sub = new Sub();
    				sub.setValue(a, b);
    				System.out.println(">> " + sub.calculate());
    				break;
    				
    			case "*": Mul mul = new Mul();
    				mul.setValue(a, b);
    				System.out.println(">> " + mul.calculate());
    				break;
    				
    			case "/": Div div = new Div();
    				div.setValue(a, b);
    				System.out.println(">> " + div.calculate());
    				break;
    				
    			default :
    				System.out.println("알 수 없는 연산입니다.");
    				break;
    			}
    		
    		} catch (Exception e) {
//    			System.err.println("규격을 맞춰주세용~");
    		}
    		
    	}
    	
    }
    
}
