package com.natarajanthangaraj.problemsolving.kfcordertracker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main implements Runnable{
    static Queue<Order> list=new LinkedList<Order>();
	public static void main(String[] args) {
		Main orderTrack=new Main();
		orderTrack.start();
	}

	private void start() {
		Scanner scan=new Scanner(System.in);
		Thread thread =new Thread(new Main());
		introduction();
		int select;
		boolean flag=true;
		do {
			if(!list.isEmpty()&&flag) {
				flag=false;
				thread.start();
			}else if(list.isEmpty()) {
				flag=true;
			}
			     options();
			     System.out.print("Enter the Number : ");
			     select=scan.nextInt();
			     if(select==1) {
				   list.add(placeOrder());
			     }else if(select==2) {
				   viewList(list);
			     }
			
		}while(select!=0);
		conclusion();
	}

	private static  void viewList(Queue<Order> list) {
		int index=1;
		for(Order eachObject :list) {
			System.out.println((index++)+" - "+eachObject.getOrderNumber());
		}
	}

	private Order  placeOrder() {
		Scanner scan=new Scanner(System.in);
		System.out.print(" Enter the Order Number [like ddmm-num ]:");
		Order orderNumber=new Order(scan.nextLine());
		return orderNumber;
	}

	private static void options() {
		System.out.println();
		System.out.println(" 1 - Place Order ");
		System.out.println(" 2 - View List  ");
		System.out.println(" 0 - To Exit  ");
		System.out.println();
		
	}
	private static void introduction() {
		System.out.println();
		System.out.println("     WELCOME  TO  KFC    ");
		System.out.println(" --*--  PLACE YOUR ORDER HERE  --*--  ");
		System.out.println();
		
	}
	private static void conclusion() {
		System.out.println();
		System.out.println(" --*--  THANK YOU ! VISIT AGAIN !!!  --*--  ");
		System.out.println();
		
	}

	@Override
	public void run() {
		while(!list.isEmpty()) {
			Order nextOrder=list.remove();
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("          "+nextOrder.getOrderNumber()+" <--- THIS ORDER IS READY ! ");
			
		}
		
	}

}
