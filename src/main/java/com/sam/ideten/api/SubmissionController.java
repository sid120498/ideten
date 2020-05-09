package com.sam.ideten.api;

import com.sam.ideten.model.Submission;
import com.sam.ideten.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/submission")
@RestController
public class SubmissionController {
    private final SubmissionService submissionService;

    @Autowired
    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @PostMapping("")
    public String addSubmission(@RequestBody Submission submission){
        return submissionService.addSubmission(submission);
    }

    @GetMapping("")
    public List<Submission> getAllSubmission(){
        return submissionService.getAllSubmission();
    }

    @GetMapping("/{id}")
    public Submission get(@PathVariable String id){
        return submissionService.get(id);
    }

}
