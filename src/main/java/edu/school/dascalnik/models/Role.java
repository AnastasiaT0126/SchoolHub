package edu.school.dascalnik.models;

public enum Role 
{
	
	STUDENT(1),
	TEACHER(2),
	PARENT(4),
	HEADMASTER(8),
	ADMINVV(16);

	private int value;
	
	private Role(int value) 
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}
