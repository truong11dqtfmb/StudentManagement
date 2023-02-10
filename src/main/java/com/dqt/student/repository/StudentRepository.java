package com.dqt.student.repository;

import com.dqt.student.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
//    List<Student> findAllByFirstName(String name);
    List<Student> findByFirstNameContaining(String name);

    List<Student> findAll(Sort sort);

    Page<Student> findAll(Pageable page);


}
