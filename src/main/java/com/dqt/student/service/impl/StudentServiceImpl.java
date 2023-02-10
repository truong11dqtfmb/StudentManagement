package com.dqt.student.service.impl;

import com.dqt.student.entity.Student;
import com.dqt.student.repository.StudentRepository;
import com.dqt.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> search(String name) {
        return studentRepository.findByFirstNameContaining(name);
    }

    @Override
    public List<Student> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Student> pagefindAll(int pageNumber,String sortField, String sortDir) {
        Sort sort = Sort.by(Sort.Direction.ASC,"id");
        sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
        Pageable pageable = PageRequest.of(pageNumber - 1, 3,sort);
        return studentRepository.findAll(pageable);
    }

//    @Override
//    public Page<Student> findAll() {
//        Pageable pageable = PageRequest.of(0, 3);
//        return studentRepository.findAll(pageable);
//    }

//    @Override
//    Page<Student> page(Pageable page){
//        Pageable pageable = PageRequest.of(0, 3);
//        return studentRepository.findAll(pageable);
//    }
}
