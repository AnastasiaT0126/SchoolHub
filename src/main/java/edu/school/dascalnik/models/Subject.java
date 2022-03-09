package edu.school.dascalnik.models;

public class Subject 
{
	private Long id;
	private String name;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		if(name != null)
			this.name = name;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if(!(o instanceof Subject))
			return false;
		
		Subject toCompareSubject = (Subject)o;
		return toCompareSubject.getId() == getId();
	}
	
	@Override
	public int hashCode()
	{
		return getId().hashCode();
	}
	
}
