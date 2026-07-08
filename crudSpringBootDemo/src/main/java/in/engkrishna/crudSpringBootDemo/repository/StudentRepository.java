package in.engkrishna.crudSpringBootDemo.repository;


import in.engkrishna.crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Component
//@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

  Optional<Student> findByIdAndDeletedIsFalse(Long id);
   List<Student> findByDeletedIsFalse();
}




/*

public Student saveStudent(Student studentReq){
             // save in DB

          return null;
     }
 System.out.println("Inside Student Repository");
         System.out.println("Exiting Student Repository");

         Student s1 =   new Student();
          s1.setName("krishna");
          s1.setAge(27);
          s1.setEmail("krishna@gmail.com");
          s1.setSubject("spring  boot");
          s1.setRollNo(101);

 */