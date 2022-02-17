/*
 * package org.security.resource;
 * 
 * import java.util.List;
 * 
 * import org.security.model.Student; import
 * org.security.serviceStudent.StudentService; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController public class StudentController {
 * 
 * @Autowired private StudentService studentservice;
 * 
 * @GetMapping("/students-list") public ResponseEntity<List<Student>>
 * getAllStudents() { List<Student> list = studentservice.getStudents();
 * 
 * return new ResponseEntity<List<Student>>(list, new HttpHeaders(),
 * HttpStatus.OK); }
 * 
 * @GetMapping("/students-list") public List<Student> allstudents() {
 * System.out.println("aaaaaaaaaa............"); return
 * studentservice.getStudents();
 * 
 * }
 * 
 * }
 */