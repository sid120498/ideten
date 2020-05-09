package com.sam.ideten.dao;

import com.sam.ideten.model.Submission;

import java.util.List;
import java.util.UUID;

public interface SubmissionDao {
    String insertSubmission(Submission submission);

    Submission updateSubmission(Submission submission);

    Submission getSubmission(String id);

    List<Submission> getAll();

}
