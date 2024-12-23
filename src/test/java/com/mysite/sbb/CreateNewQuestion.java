package com.mysite.sbb;

import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class CreateNewQuestion {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuestionService questionService;

    @Test
    @DisplayName("질문 게시글 추가")
    void t001() {
        Question q = new Question();
        q.setSubject("테스트 질문글");
        q.setContent("테스트 질문글 내용");
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }

    @Test
    @DisplayName("질문 200개 추가")
    void t002() {
        for (int i = 1; i <= 200; i++) {
            String subject = String.format("[%03d]번째 테스트 데이터 입니다.", i);
            String content = String.format("[%03d]번째 테스트 데이터 입니다.", i);
            this.questionService.create(subject, content, null);
        }
    }
}