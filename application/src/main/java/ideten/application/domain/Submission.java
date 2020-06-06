package ideten.application.domain;

import ideten.application.config.Constant;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Document(collection = Constant.SubmissionCollection)
public final class Submission {
    @Id
    private String id;
    @NotEmpty
    private String code;

    private String input;

    private String output;

    private String verdict;

    private Integer executed;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;

    public Submission(String code) {
        this.code = code;
    }

    public Submission(String code, String input) {
        this.code = code;
        this.input = input;
    }

    public Submission() {
    }

    @PersistenceConstructor
    public Submission(String id, String code, String input, String output, Date createdAt, int executed) {
        this.id = id;
        this.code = code;
        this.input = input;
        this.output = output;
        this.createdAt = createdAt;
        this.executed = executed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public Integer getExecuted() {
        return executed;
    }

    public void setExecuted(Integer executed) {
        this.executed = executed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
