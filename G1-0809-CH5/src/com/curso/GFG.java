package com.curso;
//Java Program to Convert java.sql.Date to java.util.Date

//Importing utility package
//Importing SQL package
import java.sql.*;
import java.util.*;

//Main Class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Date class of Util package contains both date and
		// time information
		java.util.Date utilPackageDate
			= new java.util.Date();

		// Print and display the utility package date in
		// java
		System.out.println("Util Package date in Java is : "
						+ utilPackageDate);

		// Date class of sql package contains only date
		// information without time
		java.sql.Date sqlPackageDate
			= new java.sql.Date(utilPackageDate.getTime());

		// Print and display the SQL java package
		System.out.println("SQL Package date in Java : "
						+ sqlPackageDate);
	}
}

