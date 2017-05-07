package info.labas.labas.labas.core.dao.impl;

import info.labas.labas.labas.core.dao.StudentDao;
import info.labas.labas.labas.core.dao.repository.StudentRepository;
import info.labas.labas.labas.core.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
