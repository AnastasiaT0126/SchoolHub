package edu.school.dascalnik.models;

public class User 
{
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String password;
	
	
	public User(String firstName, String lastName, String email, String phone, String address, String password)
	{
		//id = 0L;
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhone(phone);
		setAddress(address);
		setPassword(password);
	}
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(long id) 
	{
		this.id = id;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		if(firstName != null)
			this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		if(lastName != null)
			this.lastName = lastName;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		if(email != null)
			this.email = email;
	}
	
	public String getPhone() 
	{
		return phone;
	}
	
	public void setPhone(String phone) 
	{
		if(phone != null)
			this.phone = phone;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		if(address != null)
			this.address = address;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		if(password != null)
			this.password = password;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if(!(o instanceof User))
			return false;
		
		User toCompareUser = (User)o;
		return toCompareUser.getId() == getId();
	}
	
	@Override
	public int hashCode()
	{
		return getId().hashCode();
	}
}
