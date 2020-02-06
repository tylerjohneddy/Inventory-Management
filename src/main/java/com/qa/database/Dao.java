package com.qa.database;

import java.util.ArrayList;

/**
 * @author Admin
 *
 * @param <T>
 */
public interface Dao<T> {

	// C

	public void create(T t);

	// R

	public ArrayList<String> readAll();
	// U

	public void update(T t);
	// D

	public void delete(int id);
}
