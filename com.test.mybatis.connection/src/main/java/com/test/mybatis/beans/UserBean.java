package com.test.mybatis.beans;


public class UserBean {
	private int id;
	private String username;
	private String password;
	private double account;

	public UserBean() {

	}

	public UserBean(int id, String name, String password, double account ) {

		this.id = id;
		this.username = name;
		this.password = password;
		this.account = account;
	}

	public int getId()
	{
		return this.id;
	}
	
	public void setId( int id )
	{
		this.id = id;
	}

	public String getName()
	{
		return this.username;
	}
	
	public void setName( String name )
	{
		this.username = name;
	}

	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword( String password )
	{
		this.password = password;
	}

	public double getAccount()
	{
		return this.account;
	}
	
	public void setAccount( double account )
	{
		this.account = account;
	}

}
