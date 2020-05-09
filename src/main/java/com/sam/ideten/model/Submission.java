package com.sam.ideten.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Submission {
    private String id;
    private String name;
    private String status;
    private String code;
    private String language;
    private String verdict;

    public Submission(@JsonProperty("id") String id,
                      @JsonProperty("name") String name,
                      @JsonProperty("code") String code,
                      @JsonProperty("language") String language) {
        this.id = id;
        this.name = name;
        this.status = "default";
        this.code = code;
        this.language = language;
        this.verdict = "pending";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }

    public String getVerdict() {
        return verdict;
    }
}
