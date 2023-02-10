package com.dqt.student.service;

import com.dqt.student.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();

    void save(Student student);

    Optional<Student> findById(Long id);

    void deleteById(Long id);

    List<Student> search(String name);

    List<Student> findAll(Sort sort);

    Page<Student> pagefindAll(int pageNumber,String sortField, String sortDir);

//    Page<Student> findAll();
}
