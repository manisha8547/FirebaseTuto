package com.example.manisha.firebasetuto;

public class Questions {
    String questionid;
    String question;
    String answer;

    public Questions(){

    }

    public Questions(String questionid, String question, String answer) {
        this.questionid = questionid;
        this.question = question;
        this.answer = answer;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
