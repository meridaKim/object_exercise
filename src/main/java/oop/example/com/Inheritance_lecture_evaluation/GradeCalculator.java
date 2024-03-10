package oop.example.com.Inheritance_lecture_evaluation;

import java.util.Arrays;

public class GradeCalculator {
    public static void main(String [] args){
        Lecture lecture = new Lecture("객체지향 프로그래밍", 70, Arrays.asList(81,95,75,50,45));

        String evaluration = lecture.evaluate();
        System.out.println(evaluration);
    }

}
