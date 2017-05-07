package info.labas.labas.labas.core.dao;

import info.labas.labas.labas.core.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAllStudents();

}
