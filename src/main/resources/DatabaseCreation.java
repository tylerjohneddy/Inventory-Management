
public class DatabaseCreation {
	public void tableSQL() {
		String inventoryManagementDatabase = "create database if not exists inventory_management;";
		
		//String useDatabase = "use inventory_management;";

		String customersTable = "create table if not exists customers(id int primary key auto_increment,forename varchar(50) not null,surname varchar(50) not null);";

		String itemsTable = "create table if not exists items(id int primary key auto_increment,name varchar(40) not null,value float(7,2) default(0.00),in_stock int);";

		String ordersTable = "create table if not exists orders(id int primary key auto_increment,cost float (9,2),customer_id int not null,discount int default 0,date_time timestamp not null,foreign key (customer_id) references customers(id));";

		String itemOrderTable = "create table if not exists item_order(id int primary key auto_increment,order_id int,item_id int,item_quantity int not null,sold_cost float(7,2) default(0.00),foreign key (item_id) references items(id),foreign key (order_id) references orders(id));";

		String usersTable = "create table if not exists users(id int primary key auto_increment,name varchar(40) not null unique,password varchar(20) not null);";


	}
}