package com.example.FYP.GRADING;


import javax.persistence.*;

@Entity
@Table(name="topics")
public class Topic {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long topic_id;
    private String topic_description;
    private String topic_Name;
    private double E;
    private double D;
    private double B;
    private double A;
    private double pourcentage;
    private double topic_grade;


    public Topic() {
    }

    public Topic(Long topic_id, String topic_description, String topic_name, double pourcentage) {
        super();
        this.topic_id = topic_id;
        this.topic_description = topic_description;
        topic_Name = topic_name;

        E = 0;
        D = 0;
        B = 0;
        A = 0;
        this.pourcentage = pourcentage;
        this.topic_grade = 0;
    }

    public Long getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Long topic_id) {
        this.topic_id = topic_id;
    }

    public String getTopic_description() {
        return topic_description;
    }

    public void setTopic_description(String topic_description) {
        this.topic_description = topic_description;
    }

    public void incrementE() {E++;}
    public void incrementD() {
        D++;
    }

    public void incrementB() {B++;}

    public void incrementA() {
        A++;
    }

    public double getPourcentage() {return pourcentage;}

    public void setPourcentage(double pourcentage) {this.pourcentage = pourcentage;}

    public double getTopic_grade() {return topic_grade;}

    public void calculate_topicgrade() {
        this.topic_grade = ((E+A+B+D)/16)*getPourcentage();
    }

    public String getTopic_Name() {
        return topic_Name;
    }

    public void setTopic_Name(String topic_Name) {
        this.topic_Name = topic_Name;
    }
}
