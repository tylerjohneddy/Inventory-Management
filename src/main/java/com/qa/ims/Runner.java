package com.qa.ims;


import org.apache.log4j.Logger;

import com.qa.database.*;
import com.qa.tables.Menu;

/**
 * @author Tyler Eddy
 *
 */
public class Runner {

	public static final Logger LOGGER= Logger.getLogger(Runner.class); 
	
	public static void main(String[] args) {

		new Menu();

		new Mysql().close();

	}// end main
}// end Runner
