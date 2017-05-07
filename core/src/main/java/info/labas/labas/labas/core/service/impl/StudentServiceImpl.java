package info.labas.labas.labas.core.service.impl;

import info.labas.labas.labas.core.dao.StudentDao;
import info.labas.labas.labas.core.model.Student;
import info.labas.labas.labas.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.findAllStudents();
    }

}
