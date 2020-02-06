package com.qa.tables;

import java.util.Scanner;

import com.qa.ims.Runner;



public class Menu {
Scanner consoleLine = new Scanner(System.in);
public Menu() {
	String option = "";
	

	do
	{
		Runner.LOGGER.info("Welcome to the inventroy managagment system");
		Runner.LOGGER.info("Main Menu\n");
		//Database IMS = new Database();
		option = consoleLine.nextLine();
		//option = System.console().readLine();
		topMenu(option);
	}while(!"exit".equals(option));

}

public void topMenu(String a) {
	switch (a) {
	case "exit":
		
		Runner.LOGGER.info("Good Bye Have A Nice Day!\n");
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
		Runner.LOGGER.info("Options avalible:\n\n(c)ustomer menu\n(i)tem menu\n(o)der menu");
		break;

	default:
		Runner.LOGGER.info("Sorry please select a valid option!\n");
		break;
	}
}

public void subMenuStarter(String topMenuOption) {
	String subOption = "";
	Runner.LOGGER.info(String.format("You've entered the %s menu\nPlease select your next option\n",topMenuOption));
	do {
		//SubOption = System.console().readLine();
		subOption = consoleLine.nextLine();

		SubMenu(subOption, topMenuOption);
	} while (!"exit".equals(subOption));
}

public void subMenuOption(String a, String topMenuOption) {
	Runner.LOGGER.info(String.format("Please enter the %s name:\n",topMenuOption));
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
		Runner.LOGGER.info(String.format("Options avalible\n\n(h)elp: displays this message\n(a)dd new " + b
				+ "\n(d)elete excisting" + b + "\n(v)iew all " + b + "'s'"));
		break;
	default:
		Runner.LOGGER.info(String.format("Sorry please select a valid option!\n"));
		break;
	}

}

}
