package oop.example.com.Inheritance_lecture_evaluation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture  {
    private int pass; // 이수여부
        private String title; // 과목명
        private List<Integer> scores = new ArrayList<>(); // 성적을 보관할 List scores를 인스턴스 변수로 가짐

        public Lecture(String title, int pass, List<Integer> scores) {
            this.title = title;
            this.pass = pass;
            this.scores = scores;
        }

        public double average() {
            return scores.stream().mapToInt(Integer::intValue).average().orElse(0);
        }

        public List<Integer> getScores() {
            return Collections.unmodifiableList(scores);
        }

        public String evaluate() {
            return String.format("Pass:%d Fail:%d", passCount(), failCount());
        }

        private long passCount() {
            return scores.stream().filter(score -> score >= pass).count();
        }

        private long failCount() {
            return scores.size() - passCount();
        }
}