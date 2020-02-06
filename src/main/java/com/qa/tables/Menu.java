package com.qa.project.five.week.tables;

import java.util.Scanner;



public class Menu {
Scanner consoleLine = new Scanner(System.in);
public Menu() {
	String option = "";
	

	do
	{
		System.out.println("Welcome to the inventroy managagment system");
		System.out.println("Main Menu\n");
		//Database IMS = new Database();
		option = consoleLine.nextLine();
		//option = System.console().readLine();
		topMenu(option);
	}while(!"exit".equals(option));

}

public void topMenu(String a) {
	switch (a) {
	case "exit":
		System.out.println("Good Bye Have A Nice Day!\n");
		break;

	case "c":
	case "customer":
		subMenuStarter("customer");
		break;

	case "i":
	case "item":
		subMenuStarter("item");
		break;

	case "o":
	case "order":
		subMenuStarter("order");
		break;

	case "h":
	case "help":
		System.out.println("Options avalible:\n\n(c)ustomer menu\n(i)tem menu\n(o)der menu");
		break;

	default:
		System.out.println("Sorry please select a valid option!\n");
		break;
	}
}

public void subMenuStarter(String topMenuOption) {
	String subOption = "";
	System.out.printf("You've entered the %s menu\nPlease select your next option\n",topMenuOption);
	do {
		//SubOption = System.console().readLine();
		subOption = consoleLine.nextLine();

		SubMenu(subOption, topMenuOption);
	} while (!"exit".equals(subOption));
}

public void subMenuOption(String a, String topMenuOption) {
	System.out.printf("Please enter the %s name:\n",topMenuOption);
	String userInput = consoleLine.nextLine();
	System.out.println(a + ": " + userInput);
}

public void SubMenu(String a, String b) {
	switch (a) {
	case "exit":
		break;

	case "a":
	case "add":
		subMenuOption("add", b);
		break;
	case "d":
	case "delete":
		subMenuOption("delete", b);
		break;
	case "u":
	case "update":
		subMenuOption("update", b);
		break;
	case "v":
	case "view":
		subMenuOption("view", b);
		break;
	case "h":
	case "help":
		System.out.println("Options avalible\n\n(h)elp: displays this message\n(a)dd new " + b
				+ "\n(d)elete excisting" + b + "\n(v)iew all " + b + "'s'");
		break;
	default:
		System.out.println("Sorry please select a valid option!\n");
		break;
	}

}

}