package com.sam.ideten.controller;

import com.sam.ideten.domain.Code;
import com.sam.ideten.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {
    @Autowired
    @Qualifier(value = "Code_Service")
    private CodeService<Code> codeService;
    @RequestMapping(value = "/list", method= RequestMethod.POST)
    public Code list(@RequestBody String codeText){

        Code code =  new Code(codeText);
        return this.codeService.create(code);
    }

}
