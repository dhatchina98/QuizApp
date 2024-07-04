package com.decode.quizapp.dao;

import com.decode.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

    List<Question> findByqLanguage(String qLanguage);
    @Query(value="SELECT * FROM quizdb_schema.questions q WHERE q.q_language=:qLanguage ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
    List<Question> findRandomQuestionsByqLanguage(String qLanguage, Integer numQ);
}
