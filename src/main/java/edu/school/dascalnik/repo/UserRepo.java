package edu.school.dascalnik.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.school.dascalnik.models.Subject;
import edu.school.dascalnik.models.User;

@Repository
public class UserRepo implements IUserRepo
{

	@Override
	public List<User> getAll() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(User user) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject> getAllSubjectsByUser(User user) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
