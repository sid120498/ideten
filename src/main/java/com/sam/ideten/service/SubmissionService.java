package com.sam.ideten.service;

import com.sam.ideten.domain.Submission;

public interface SubmissionService {
    Submission create(Submission submission);
    void delete(String id);
    void update(String id,Submission submission);
    Submission get(String id);
}