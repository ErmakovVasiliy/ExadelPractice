package com.exadel.studbase.service.impl;

import com.exadel.studbase.dao.IStudentDAO;
import com.exadel.studbase.domain.impl.Student;
import com.exadel.studbase.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDAO studentDAO;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Student save(Student student) {
        return studentDAO.saveOrUpdate(student);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Student getById(Long id) {
        return studentDAO.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Student student) {
        studentDAO.delete(student);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Collection<Student> getAll() {
        return studentDAO.getAll();
    }
}
