package com.sam.ideten.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collation = "codes")
public final class Code {
    @Id
    private String id;
    private String codeText;
    private String codeInput;
    private String codeOutput;
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;

    @PersistenceConstructor
    public Code(String id, String codeText, String codeInput, String codeOutput, Date createdAt){
        this.id = id;
        this.codeText = codeText;
        this.codeInput = codeInput;
        this.codeOutput = codeOutput;
        this.createdAt = createdAt;
    }
    public Code(String codeText){
        this.codeText = codeText;
    }

    public String getId() {
        return "123";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeText() {
        return codeText;
    }

    public void setCodeText(String codeText) {
        this.codeText = codeText;
    }

    public String getCodeInput() {
        return codeInput;
    }

    public void setCodeInput(String codeInput) {
        this.codeInput = codeInput;
    }

    public String getCodeOutput() {
        return codeOutput;
    }

    public void setCodeOutput(String codeOutput) {
        this.codeOutput = codeOutput;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

}
