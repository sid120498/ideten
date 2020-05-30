package com.sam.ideten.controller;

import com.sam.ideten.domain.Submission;
import com.sam.ideten.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubmissionController {
    @Autowired
    @Qualifier(value = "submission_service")
    private SubmissionService submissionService;

    // @Todo create exception class and exception handler for rest "https://spring.io/guides/tutorials/bookmarks/ "
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "submission",method= RequestMethod.POST)
    public Submission createSubmission(@RequestBody Submission submission){
        return this.submissionService.create(submission);
    }

    @RequestMapping(value = "submission/{id}",method = RequestMethod.GET)
    public Submission getOne(@PathVariable("id") String id){
        return this.submissionService.get(id);
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value="submission/{id}", method = RequestMethod.PUT)
    public void updateSubmission(@PathVariable("id") String id, @RequestBody Submission submission){
        this.submissionService.update(id,submission);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value="submission/{id}", method = RequestMethod.DELETE)
    public void deleteSubmission(@PathVariable("id") String id){
        this.submissionService.delete(id);
    }
}
