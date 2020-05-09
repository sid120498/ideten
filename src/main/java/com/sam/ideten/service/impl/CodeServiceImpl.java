package com.sam.ideten.service.impl;

import com.sam.ideten.domain.Code;
import com.sam.ideten.repository.CrudRepository;
import com.sam.ideten.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("Code_Service")
public class CodeServiceImpl implements CodeService<Code> {
    @Autowired()
    @Qualifier(value = "Code_Mongo")
    private CrudRepository<Code> codeRepository;

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
