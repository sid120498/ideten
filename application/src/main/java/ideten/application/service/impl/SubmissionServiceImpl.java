package ideten.application.service.impl;

import ideten.application.domain.Submission;
import ideten.application.repository.CrudRepository;
import ideten.application.service.SubmissionService;
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
