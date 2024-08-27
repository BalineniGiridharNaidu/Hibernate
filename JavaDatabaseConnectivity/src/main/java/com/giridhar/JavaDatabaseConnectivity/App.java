package com.giridhar.JavaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.utils.connection;

public class App 
{	
	
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Connection con = connection.getConnection();
        Statement st = con.createStatement();
        
//        String query = "create table test_jdbc.user(\r\n"
//        		+ "uid int primary key,\r\n"
//        		+ "uname varchar(45),\r\n"
//        		+ "uage int check (uage >= 18)\r\n"
//        		+ ");";
        
//        String query = "show tables;";
        
//        String query = "insert into test_jdbc.user\r\n"
//        		+ "(uid, uname, uage)\r\n"
//        		+ "values\r\n"
//        		+ "(1, 'Giri', 34),\r\n"
//        		+ "(2, 'Nina', 89),\r\n"
//        		+ "(3, 'Vishal', 90);";
        
//        String query = "select * from test_jdbc.user;";
        
//        String query = "create table test_jdbc.voter_list(\r\n"
//        		+ "vid int primary key,\r\n"
//        		+ "vname varchar(45) not null,\r\n"
//        		+ "vage int check (vage >= 18),\r\n"
//        		+ "vcountry varchar(45) default 'India'\r\n"
//        		+ ");";
        
//        String query = "insert into test_jdbc.voter_list\r\n"
//        		+ "(vid, vname, vage)\r\n"
//        		+ "values\r\n"
//        		+ "(101, 'max', 18 ),\r\n"
//        		+ "(102, 'runi', 28 ),\r\n"
//        		+ "(103, 'varsha', 18 );";
        
        
        String query = "select * from test_jdbc.voter_list;";
        
        boolean isResultSet = st.execute(query);
        
        if(isResultSet)
        {
        	System.out.println("Output is a result set");
        	ResultSet rs = st.getResultSet();
        	while(rs.next())
        	{
        		System.out.println(rs.getInt(1)+" -- "+rs.getString(2)+ " -- "+ rs.getInt(3));
        	}
        	
        } else {
        	
        	System.out.println("Output is an update count ------- "+ st.getUpdateCount());
        	
        }
     
    }
}
