package com.sam.ideten.service.impl;

import com.sam.ideten.domain.Code;
import com.sam.ideten.repository.CodeRepository;
import com.sam.ideten.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("Mongo_Service")
public class CodeServiceMongoImpl implements CodeService<Code> {
    @Autowired()
    @Qualifier(value ="Code_Mongo")
    private CodeRepository<Code> codeRepository;

    @Override
    public Code create(Code code) {
        return this.codeRepository.create(code);
    }

    @Override
    public Code delete(Long id) {
        return null;
    }

    @Override
    public Code update(Code code) {
        return null;
    }

    @Override
    public Code get(Code code) {
        return null;
    }
}
