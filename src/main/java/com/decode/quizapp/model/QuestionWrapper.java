package com.decode.quizapp.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Column;
import lombok.Data;

@Data
@JsonPropertyOrder({"qid", "qlanguage", "question", "qoption1", "qoption2", "qoption3"})
public class QuestionWrapper {
    private Integer qId;
    private String qLanguage;
    private String question;
    private String qOption1;
    private String qOption2;
    private String qOption3;

    public QuestionWrapper(Integer qId, String qLanguage, String question, String qOption1, String qOption2, String qOption3) {
        this.qId = qId;
        this.qLanguage = qLanguage;
        this.question = question;
        this.qOption1 = qOption1;
        this.qOption2 = qOption2;
        this.qOption3 = qOption3;
    }
}
