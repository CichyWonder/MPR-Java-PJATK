package lab9.zad1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository){
            this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public String showStudents(Model model){

        List<Student> studentList = studentRepository.findAll();
        model.addAttribute("students", studentList);
        return "view-students";
    }

    @GetMapping("/students/add")
    public String displayStudentForAdding(Model model, Student student){

        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/students/add")
    public String addStudent(Student student){

        studentRepository.save(student);
        return "add-student";
    }

    @GetMapping("/students/update")
    public String displayStudentForUpdate(Model model, long id){

        List<Student> studentList = studentRepository.findAll();
        model.addAttribute("students", studentList);
        model.addAttribute("student", new Student() = studentRepository.findById(id).get());
        model.addAttribute("student", studentRepository.findById(id));

        return "update-student";
    }

    @PostMapping("/students/update")
    public String updateStudent(Student student){


        studentRepository.save(student);

        return "update-student";
    }

    @GetMapping("/students/delete")
    public String displayStudentForDelete(Model model, Student student){

        List<Student> studentList = studentRepository.findAll();
        model.addAttribute("students", studentList);

        model.addAttribute("student", student);


        return "delete-student";
    }

    @PostMapping("/students/delete")
    public String deleteStudent(Student student){

        studentRepository.delete(student);
        return "delete-student";
    }
}
