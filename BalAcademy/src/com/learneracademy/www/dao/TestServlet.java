package com.learneracademy.www.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//Define datasource/connection pool for reference
	
	@Resource(name="jdbc_database")
	private DataSource dataSource;
	
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Set the printwriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		// establish connection to the DB
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			myConn = dataSource.getConnection();
		//create a sql statement
		String sql = "select * from students";
		myStmt = myConn.createStatement();
		
		
		//execute the sql statement
		myRs = myStmt.executeQuery(sql);
		
		//process the resultset
		while(myRs.next()) {
			String fname = myRs.getString("fname");
			out.println(fname);
			
		}
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
