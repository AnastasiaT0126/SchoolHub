package edu.school.dascalnik.repo;

import java.util.List;

import edu.school.dascalnik.models.Subject;
import edu.school.dascalnik.models.User;

public interface ISubjectRepo 
{
	List<Subject> geAll();
	void create(Subject subject);
	Subject getById(Subject id);
	List<User> getUsersBySubject(Subject subject);
}
