package com.example.FYP.GRADING;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;

@Entity
@Table(name="finalgrades")
public class Grade {
    @Id
    private Long Grp_Id;
    private double finalgrade;
    private HashMap<Topic, Integer> topics;

    public Grade() {
    }

    public Grade(Long Grp_id , HashMap<Topic, Integer> topics) {
        super();
        // TODO Auto-generated constructor stub
        this.Grp_Id=Grp_id;
        this.finalgrade =0;
        this.topics=topics;
    }


    public Long getGrp_Id() {
        return Grp_Id;
    }

    public void setGrp_Id(Long grp_Id) {
        Grp_Id = grp_Id;
    }

    public double getFinalgrade() {
        return finalgrade;
    }

    public void calculate_Finalgrade() {this.finalgrade = finalgrade;}

    public HashMap<Topic, Integer> getTopics() {
        return topics;
    }

//    public void setTopics(HashMap<> topics) {
//        this.topics = topics;
//    }
}
