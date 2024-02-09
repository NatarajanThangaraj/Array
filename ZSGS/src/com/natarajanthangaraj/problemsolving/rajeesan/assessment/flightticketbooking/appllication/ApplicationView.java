package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.appllication;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.BaseView;

public class ApplicationView extends BaseView{
	ApplicationViewModel applicationViewModel;
	public ApplicationView()   {
		this.applicationViewModel=new ApplicationViewModel(this);
	}
	public void start() {
		System.out.println("+---------------------------+");
        System.out.println("|   WELCOME TO AIR INDIA   |");
        System.out.println("|---------------------------|");
        System.out.println("| 1 : Booking               |");
        System.out.println("| 2 : Get PNR Number        |");
        System.out.println("| 3 : Booked tickets        |");
        System.out.println("| 4 : Cancel Tickets        |");
        System.out.println("| 5 : Search Passenger      |");
        System.out.println("| 6 : Change ticket status  |");
        System.out.println("| 7 : List Flight Routes    |");
        System.out.println("| 8 : Add Flight Routes     |");
        System.out.println("+---------------------------+");
		applicationViewModel.actionListener(getSelection());
		
	}
	int getSelection() {
		System.out.print(" Enter your Option : ");
		return getInt();
	}
}
