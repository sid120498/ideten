package com.sam.ideten.dao;

import com.sam.ideten.model.Submission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("mongoDao")
public class MongoSubmissionRepository implements SubmissionDao{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public String insertSubmission(Submission submission) {
        return mongoTemplate.save(submission).getId();
    }

    @Override
    public Submission updateSubmission(Submission submission) {
        return submission;
    }

    @Override
    public Submission getSubmission(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, Submission.class);
    }

    public List<Submission> getAll(){
        return mongoTemplate.findAll(Submission.class);
    }
}
