package com.qa.database;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Admin
 *
 * @param <T>
 */
public interface Dao<T> {

	// C

	public void create(T t);

	// R

	public List<String> readAll();
	// U

	public void update(T t);
	// D

	public void delete(int id);
}
