package ru.intf;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Enumeration<Driver> en = DriverManager.getDrivers();
		} catch (Exception e) {
			System.out.println("" + e);
		}
	}

}
