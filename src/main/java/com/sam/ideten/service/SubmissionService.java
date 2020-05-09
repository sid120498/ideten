package com.sam.ideten.service;

import com.sam.ideten.dao.SubmissionDao;
import com.sam.ideten.model.Submission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionService {
    private final SubmissionDao submissionDao;

    @Autowired
    public SubmissionService(@Qualifier("mongoDao") SubmissionDao submissionDao) {
        this.submissionDao = submissionDao;
    }

    public String addSubmission(Submission submission){
        return submissionDao.insertSubmission(submission);
    }

    public Submission get(String id){
        return submissionDao.getSubmission(id);
    }

    public List<Submission> getAllSubmission(){
        return submissionDao.getAll();
    }
}
