package com.qa.tables;

import java.util.Scanner;

import com.qa.database.Dao;
import com.qa.database.MysqlCustomerDao;
import com.qa.database.MysqlItemDao;
import com.qa.database.MysqlOrderDao;
import com.qa.ims.Runner;

public class Menu {
	Scanner consoleLine = new Scanner(System.in);

	public Menu() {
		String option = "";
		
		

		do {
			Runner.LOGGER.info("Welcome to the inventroy managagment system");
			Runner.LOGGER.info(String.format("Main Menu%nWhich domain would you like to interact with?"));

			option = consoleLine.nextLine();

			topMenu(option);
			
			
		} while (!"exit".equals(option));

	}

	public void topMenu(String userInput) {
		switch (userInput) {
		case "exit":

			Runner.LOGGER.info(String.format("Good Bye Have A Nice Day!%n"));
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
			Runner.LOGGER.info(String.format("Options avalible:%n%n(c)ustomer menu%n(i)tem menu%n(o)der menu"));
			break;

		default:
			Runner.LOGGER.info(String.format("Sorry please select a valid option!%n"));
			break;
		}
	}

	public void subMenuStarter(String topMenuOption) {
		String subOption = "";
		Runner.LOGGER
				.info(String.format("You've entered the %s menu\nPlease select your next option%n", topMenuOption));
		do {
			subOption = consoleLine.nextLine();

			SubMenu(subOption, topMenuOption);
		} while (!"exit".equals(subOption));
	}

public void subMenuOption(String crudOption, String topMenuOption) {
	
	Runner.LOGGER.info(String.format("Please enter the %s name:%n",topMenuOption));
	
	String userInput = consoleLine.nextLine();


	Runner.LOGGER.info(crudOption + ": " + userInput);
}

public void SubMenu(String a, String topMenuOption) {
	switch (a) {
	case "exit":
		break;

	case "a":
	case "add":
		subMenuOption("add", topMenuOption);
		
		
		
		break;
	case "d":
	case "delete":
		subMenuOption("delete", topMenuOption);
		break;
	case "u":
	case "update":
		subMenuOption("update", topMenuOption);
		break;
	case "v":
	case "view":
		subMenuOption("view", topMenuOption);
		break;
	case "h":
	case "help":
		Runner.LOGGER.info(String.format("Options avalible%n%n(h)elp: displays this message%n(a)dd new %s%n(d)elete excisting %s%n(v)iew all %s's",topMenuOption,topMenuOption,topMenuOption));
		break;
	default:
		Runner.LOGGER.info(String.format("Sorry please select a valid option!\n"));
		break;
	}

}

}
