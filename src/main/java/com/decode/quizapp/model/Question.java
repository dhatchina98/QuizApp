package com.decode.quizapp.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "questions")
@JsonPropertyOrder({"qid", "qlanguage", "qdifficultyLevel", "question", "qoption1", "qoption2", "qoption3", "qanswer"})
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "q_id")
    private Integer qId;
    @Column(name = "q_language")
    private String qLanguage;
    @Column(name = "q_difficulty_level")
    private String qDifficultyLevel;
    @Column(name = "question")
    private String question;
    @Column(name = "q_option1")
    private String qOption1;
    @Column(name = "q_option2")
    private String qOption2;
    @Column(name = "q_option3")
    private String qOption3;
    @Column(name = "q_answer")
    private String qAnswer;
}


