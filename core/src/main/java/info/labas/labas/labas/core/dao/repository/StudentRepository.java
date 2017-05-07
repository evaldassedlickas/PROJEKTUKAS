package info.labas.labas.labas.core.dao.repository;

import info.labas.labas.labas.core.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
