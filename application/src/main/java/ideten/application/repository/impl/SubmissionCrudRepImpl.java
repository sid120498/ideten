package ideten.application.repository.impl;

import ideten.application.config.Constant;
import ideten.application.domain.Submission;
import ideten.application.repository.CrudRepository;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.UUID;

@Repository("submission_mongo")
public class SubmissionCrudRepImpl implements CrudRepository<Submission> {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public SubmissionCrudRepImpl(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Submission create(Submission submission) {
        submission.setId(UUID.randomUUID().toString());
        submission.setExecuted(0);
        submission.setVerdict("running");
        submission.setCreatedAt(new Date());
       return this.mongoTemplate.save(submission, Constant.SubmissionCollection);
    }

    @Override
    public Submission get(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
         return this.mongoTemplate.findOne(query,Submission.class, Constant.SubmissionCollection);
    }

    @Override
    public void update(String id, Submission submission) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        Update update = this.getUpdateExcludeNull(submission);
        this.mongoTemplate.updateFirst(query,update, Constant.SubmissionCollection);
    }

    @Override
    public void delete(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        this.mongoTemplate.remove(query, Constant.SubmissionCollection);
    }

    private Update getUpdateExcludeNull(Submission submission){
        Update update = new Update();
        Document doc = new Document();
        this.mongoTemplate.getConverter().write(submission,doc);
        for(String key:doc.keySet()){
            Object value = doc.get(key);
            if(value!=null){
                update.set(key, value);
            }
        }
        return update;
    }
}
