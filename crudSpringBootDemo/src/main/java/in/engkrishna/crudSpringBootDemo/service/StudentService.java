package in.engkrishna.crudSpringBootDemo.service;

import in.engkrishna.crudSpringBootDemo.entity.Student;
import in.engkrishna.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    // first work is End point ko listen karna h jaise ki (app/student/s post)
         private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
     studentReq.setDeleted(false);
        Student studentResp =   studentRepository.save(studentReq);
          return  studentResp;
    }

    // business logic
    public  Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findByIdAndDeletedIsFalse(id);
        if(studentResp.isPresent()){
            return  studentResp.get();
        }
        return null;
    }
public List<Student> getAllStudent(){
      List<Student> studentList=  studentRepository.findByDeletedIsFalse();
       return  studentList;
    }

    public Student updateStudent(Long id,Student studentReq){
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
        if(existingStudent.isEmpty()){
            return  null;
        }

        Student studentToSave = existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setEmail(studentReq. getEmail());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setDeleted(false);

    return  studentRepository.save(studentToSave);
    }
   public Boolean deleteStudent(Long id){
       Boolean isStudent = studentRepository.existsById(id);
        if(!isStudent)
             return false;
    studentRepository.deleteById(id);
      return  true;
    }

    public  Boolean deleteStudentSoftly(Long id){
      Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
           if(existingStudent.isEmpty()){
               return false;
           }
         Student studentToSave = existingStudent.get();
        studentToSave.setDeleted(true);
        studentRepository.save(studentToSave);
        return true;
    }
}

/*

  System.out.println("Exiting Student Service");

 */