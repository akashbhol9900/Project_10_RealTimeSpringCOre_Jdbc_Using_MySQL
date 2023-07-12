package com.nt.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBo;

public class CustomerDaoImpl implements ICustomerDao {
private DataSource  ds;


public CustomerDaoImpl(DataSource ds)
{
	super();
	System.out.println("this is 0 param constructor");
	this.ds=ds;
}


	public int insert(CustomerBo bo) throws Exception {
		// TODO Auto-generated method stub
		final String INSERT_QUERY="insert into akash.customer(id,name,addres,pamt,rate,time,simpleInterest) values(?,?,?,?,?,?,?)";
		 Connection con=null;
		 PreparedStatement ps=null;
		 int count=0;
		 try {
			 con=ds.getConnection();
			 ps=con.prepareStatement(INSERT_QUERY);
			 ps.setInt(1, bo.getId());
			 ps.setString(2, bo.getName());
			 ps.setString(3, bo.getAddres());
			 ps.setFloat(4, bo.getPamt());
			 ps.setFloat(5, bo.getRate());
			 ps.setFloat(6, bo.getTime());
			 ps.setFloat(7, bo.getSimpleInterest());
			 
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
			 throw se;
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 throw e;
		 }
		 finally
		 {
			 try {
				 if(ps!=null)
					 ps.close();
			 }
			 catch(SQLException e)
			 {
				 e.printStackTrace();
				 throw e;
			 }
			 try {
				 if(con!=null)
					 con.close();
			 }
			 catch (SQLException e) {
				// TODO: handle exception
				 e.printStackTrace();
				 throw e;
			} 
			 
		 }
		return count;
	}

}
