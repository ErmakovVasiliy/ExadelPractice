package com.exadel.studbase.service.impl;

import com.exadel.studbase.dao.IFeedbackDAO;
import com.exadel.studbase.domain.impl.Feedback;
import com.exadel.studbase.service.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class FeedbackServiceImpl implements IFeedbackService {

    @Autowired
    private IFeedbackDAO feedbackDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Feedback save(Feedback feedback) {
        return feedbackDAO.saveOrUpdate(feedback);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Feedback getById(Long id) {
        return feedbackDAO.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Feedback feedback) {
        feedbackDAO.delete(feedback);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Collection<Feedback> getAllAboutStudent(Long studentId) {
        return feedbackDAO.getAllAboutStudent(studentId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Collection<Feedback> getAllByEmployee(Long employeeId) {
        return feedbackDAO.getAllByEmployee(employeeId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addFeedbacksWhenAppointingCurators(Long[] studentsIds, Long[] curatorsIds) {
        feedbackDAO.addFeedbacksWhenAppointingCurators(studentsIds, curatorsIds);
    }

    @Override
    public Collection<Feedback> getAllAboutStudentByEmployee(Long studentId, Long employeeId) {
        return feedbackDAO.getAllAboutStudentByEmployee(studentId, employeeId);
    }
}
