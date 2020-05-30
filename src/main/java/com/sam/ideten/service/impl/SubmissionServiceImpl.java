package com.sam.ideten.service.impl;

import com.sam.ideten.domain.Submission;
import com.sam.ideten.repository.CrudRepository;
import com.sam.ideten.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("submission_service")
public class SubmissionServiceImpl implements SubmissionService {
    @Autowired()
    @Qualifier(value = "submission_mongo")
    private CrudRepository<Submission> submissionRepository;

    @Override
    public Submission create(Submission submission) {
        return this.submissionRepository.create(submission);
    }

    @Override
    public void delete(String id) {
        this.submissionRepository.delete(id);
    }

    @Override
    public void update(String id, Submission submission) {
         this.submissionRepository.update(id,submission);
    }

    @Override
    public Submission get(String id) {
        return this.submissionRepository.get(id);
    }
}
