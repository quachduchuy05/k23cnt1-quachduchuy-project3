package k23cnt1.qdh.lesson3.k23cnt1.qdh.lesson3.controller;


import k23cnt1.qdh.lesson3.k23cnt1.qdh.lesson3.entity.qdhStudent;
import k23cnt1.qdh.lesson3.k23cnt1.qdh.lesson3.service.qdhStudentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students") // ✅ URL gốc
public class qdhStudentcontroller {

    @Autowired
    private qdhStudentservice studentService; // ✅ inject service

    // Lấy toàn bộ danh sách sinh viên
    @GetMapping
    public List<qdhStudent> getAllStudents() {
        return studentService.getStudents();
    }

    // Lấy sinh viên theo ID
    @GetMapping("/{id}")
    public qdhStudent getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    // Thêm sinh viên mới
    @PostMapping
    public qdhStudent addStudent(@RequestBody qdhStudent student) {
        return studentService.addStudent(student);
    }

    // Cập nhật sinh viên
    @PutMapping("/{id}")
    public qdhStudent updateStudent(@PathVariable Long id, @RequestBody qdhStudent student) {
        return studentService.updateStudent(id, student);
    }

    // Xóa sinh viên
    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}


