package com.sam.ideten.dao;

import com.sam.ideten.model.Submission;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeSubmissionDataAccessService implements SubmissionDao {
    private static List<Submission> DB = new ArrayList<>();

    @Override
    public String insertSubmission(Submission submission) {
        return null;
    }

    @Override
    public Submission updateSubmission(Submission submission) {
        return null;
    }

    @Override
    public Submission getSubmission(String id) {
        return null;
    }

    @Override
    public List<Submission> getAll() {
        return DB;
    }

}
