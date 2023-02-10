package com.dqt.student.controller;

import com.dqt.student.entity.Student;
import com.dqt.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

//    1.GET   index()                 URL("")
//    2.GET   create()                URL("/add")
//    3.POST  save(Request)           URL("/add")
//    4.GET   show(ID)                URL("/show/ID")
//    5.GET   edit(ID)                URL("/update/ID")
//    6.POST  update(Request,ID)      URL("/update/ID")
//    7.GET   delete(ID)              URL("/delete/ID")

//    @GetMapping("/student")
//    public String index(Model model) {
//
//        model.addAttribute("students", studentService.findAll());
//        return "student";
//    }
//
//    @GetMapping("/student/add")
//    public String create() {
//        return "student_add";
//    }
//
//    @PostMapping("/student/save")
//    public String save(Student student) {
//        studentService.save(student);
//        return "redirect:/student";
//    }
//
//    @GetMapping("/student/edit/{id}")
//    public String edit(Model model, @PathVariable("id") Long id) {
//        Optional<Student> student = studentService.findById(id);
//        if (student.isPresent()) {
//            model.addAttribute("student", student.get());
//            return "student_edit";
//        }
//        return "student";
//    }
//
//    @PostMapping("/student/update/{id}")
//    public String update(Student student, @PathVariable Long id) {
//        Optional<Student> entityStudent = studentService.findById(id);
//        if (entityStudent.isPresent()) {
//            Student studentGet = entityStudent.get();
//            studentGet.setId(id);
//            studentGet.setFirstName(student.getFirstName());
//            studentGet.setLastName(student.getLastName());
//            studentGet.setEmail(student.getEmail());
//            studentService.save(studentGet);
//            return "redirect:/student";
//        }
//        return "redirect:/student";
//    }
//
//    @GetMapping("/student/delete/{id}")
//    public String delete(@PathVariable Long id) {
//        studentService.deleteById(id);
//        return "redirect:/student";
//    }

    //    Pagination
    @GetMapping(value = {"/student/page/{pageNumber}"})
    public String page(Model model, @PathVariable(name = "pageNumber") int currentPage, @RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir){
        Page<Student> page = studentService.pagefindAll(currentPage, sortField, sortDir);
        long totalItem = page.getTotalElements();
        int totalPages = page.getTotalPages();

        model.addAttribute("totalItem", totalItem);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reSortDir", sortDir.equals("asc") ? "desc" : "asc");
        model.addAttribute("students", page.getContent());

//        model.addAttribute("students", studentService.findAll());
        return "student";
    }

    //  IndexOrShow
    @GetMapping(value = {"/student", "/student/{id}"})
    public String indexOrShow(Model model, @PathVariable(name = "id") Optional<Long> id) {
        if (id.isPresent()) {
            Optional<Student> student = studentService.findById(id.get());
            if (student.isPresent()) {
                model.addAttribute("student", student.get());
                return "student_show";
            }
            return "redirect: /student";
        }
        return page(model,1,"id","asc");
    }

    //  CreateOrEdit
    @GetMapping(value = {"/student/save", "/student/save/{id}"})
    public String createOrEdit(Model model, @PathVariable(name = "id") Optional<Long> id) {
        if (id.isPresent()) {
            Optional<Student> student = studentService.findById(id.get());
            if (student.isPresent()) {
                model.addAttribute("student", student.get());
                return "student_edit";
            }
            return "student_add";
        }
        return "student_add";
    }

    //    SaveOrUpdate
    @PostMapping(value = {"/student/save", "student/save/{id}"})
    public String saveOrUpdate(Model model, Student student, @PathVariable("id") Optional<Long> id) {
        if (id.isPresent()) {
            Optional<Student> entityStudent = studentService.findById(id.get());
            if (entityStudent.isPresent()) {
                entityStudent.get().setId(id.get());
                entityStudent.get().setFirstName(student.getFirstName());
                entityStudent.get().setLastName(student.getLastName());
                entityStudent.get().setEmail(student.getEmail());
                studentService.save(entityStudent.get());
                return "redirect:/student";
            }
            return "redirect:/student";
        }
        studentService.save(student);
        return "redirect:/student";
    }


    //  Delete
    @GetMapping("/student/delete/{id}")
    public String delete(@PathVariable Long id) {
        System.out.println("delete");
        studentService.deleteById(id);
        return "redirect:/student";
    }


    //    Search
    @GetMapping("/student/search")
    public String search(Model model, @RequestParam("key_search") Optional<String> key_search) {
        if (key_search.isPresent()) {
            if (!key_search.get().isBlank()) {
                model.addAttribute("students", studentService.search(key_search.get()));
                return "student_search";
            }
            model.addAttribute("students", studentService.findAll());
            return "student_search";
        }
        model.addAttribute("students", studentService.findAll());
        return "redirect:/student";
    }


}
