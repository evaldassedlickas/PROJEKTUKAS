package info.labas.labas.labas.web.controller;

import info.labas.labas.labas.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public String getAllNames(Model model) {
        model.addAttribute("students", studentService.getStudents());
        return "students";
    }

}
