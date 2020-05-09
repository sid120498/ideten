package com.sam.ideten.repository.impl;

import com.sam.ideten.domain.Code;
import com.sam.ideten.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository("Code_Mongo")
public class CodeRepositoryMongoImpl implements CodeRepository<Code> {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public CodeRepositoryMongoImpl(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Code create(Code code) {
       return this.mongoTemplate.save(code, "codes");
    }

    @Override
    public Code get(Long id) {
        return null;
    }

    @Override
    public Code update(Long id, Code code) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
