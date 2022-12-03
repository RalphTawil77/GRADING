package com.example.FYP.GRADING;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name="Groups_")
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long GrpID;
    private double FinalGrade;
    private String Project_Name;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_id",referencedColumnName = "GrpID")
    private List<Student> students = new ArrayList<>();

    private HashMap<Long, Double> topicgrades = new HashMap<Long,Double>();
    public Group() {
    }

    public Group(Long grpID, String Project_Name, List<Student> students,List<Topic> topics) {
        super();
        this.GrpID = grpID;
        this.FinalGrade=0;
        this.Project_Name= Project_Name;
        for (Topic t : topics) {
            topicgrades.put(t.getTopic_id(), t.getTopic_grade());
        }
       this.students=students;
    }

    public Long getGrpID() {
        return GrpID;
    }

    public void setGrpID(Long grpID) {
        GrpID = grpID;
    }

    public double getFinalGrade() {
        topicgrades.forEach((k, v)
                -> FinalGrade+=v);
        FinalGrade*=5;
        return FinalGrade;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }
//
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
