package com.sam.ideten.repository.impl;

import com.sam.ideten.domain.Code;
import com.sam.ideten.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository("Code_Mongo")
public class CodeCrudRepositoryMongoImpl implements CrudRepository<Code> {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public CodeCrudRepositoryMongoImpl(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Code create(Code code) {
       return this.mongoTemplate.save(code, "codes");
    }

    @Override
    public Code get(String id) {
        return null;
    }

    @Override
    public Code update(String id, Code code) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
