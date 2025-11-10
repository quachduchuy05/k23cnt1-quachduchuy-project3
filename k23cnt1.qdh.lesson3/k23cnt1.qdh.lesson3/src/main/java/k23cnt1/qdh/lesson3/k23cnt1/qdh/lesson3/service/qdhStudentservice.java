package k23cnt1.qdh.lesson3.k23cnt1.qdh.lesson3.service;

import k23cnt1.qdh.lesson3.k23cnt1.qdh.lesson3.entity.qdhStudent;
import java.util.*; // cần import để dùng List, ArrayList, Arrays

public class qdhStudentservice {
    private List<qdhStudent> students = new ArrayList<>();

    public qdhStudentservice() {
        students.addAll(Arrays.asList(
                new qdhStudent(1L, "quachduchuy 1", 20, "Nam", "Số 25 VNP", "0123456789", "huychuoi05@gmail.com"),
                new qdhStudent(2L, "quachduchuy 2", 25, "Nữ", "Số 28 Cầu Giấy", "0987654321", "contact@devmaster.edu.vn"),
                new qdhStudent(3L, "quachduchuy 3", 22, "Nam", "Số 15 Trần Duy Hưng", "0911222333", "dev3@devmaster.edu.vn"),
                new qdhStudent(4L, "quachduchuy 4", 21, "Nữ", "Số 99 Kim Mã", "0909090909", "dev4@devmaster.edu.vn"),
                new qdhStudent(5L, "quachduchuy 5", 23, "Nam", "Số 68 Thái Hà", "0977554433", "dev5@devmaster.edu.vn")
        ));
    }


    // Lấy toàn bộ danh sách sinh viên
    public List<qdhStudent> getStudents() {
        return students;
    }

    // Lấy sinh viên theo id
    public qdhStudent getStudent(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Thêm mới một sinh viên
    public qdhStudent addStudent(qdhStudent student) {
        students.add(student);
        return student;
    }

    // Cập nhật thông tin sinh viên
    public qdhStudent updateStudent(Long id, qdhStudent student) {
        qdhStudent existing = getStudent(id);
        if (existing == null) {
            return null;
        }
        existing.setName(student.getName());
        existing.setAddress(student.getAddress());
        existing.setEmail(student.getEmail());
        existing.setPhone(student.getPhone());
        existing.setAge(student.getAge());
        existing.setGender(student.getGender());
        return existing;
    }

    // Xóa thông tin sinh viên
    public boolean deleteStudent(Long id) {
        qdhStudent check = getStudent(id);
        if (check != null) {
            return students.remove(check);
        }
        return false;
    }
}

