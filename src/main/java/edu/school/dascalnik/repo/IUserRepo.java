package edu.school.dascalnik.repo;

import java.util.List;

import edu.school.dascalnik.models.Subject;
import edu.school.dascalnik.models.User;

public interface IUserRepo 
{
	List<User> getAll();
	User getById(User id);
	void create(User user);
	List<Subject> getAllSubjectsByUser(User user);
}
