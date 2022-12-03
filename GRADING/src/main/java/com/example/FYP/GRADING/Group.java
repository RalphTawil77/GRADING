package com.example.FYP.GRADING;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Groups_")
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long GrpID;
    private float FinalGrade;
    private String Project_Name;
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name = "fk_id",referencedColumnName = "GrpID")
//    private List<Student> students = new ArrayList<>();

    public Group() {
    }

    public Group(Long grpID, float FinalGrade, String Project_Name, List<Student> students) {
        super();
        this.GrpID = grpID;
        this.FinalGrade=FinalGrade;
        this.Project_Name= Project_Name;
//        this.students=students;


    }

    public Long getGrpID() {
        return GrpID;
    }

    public void setGrpID(Long grpID) {
        GrpID = grpID;
    }

    public float getFinalGrade() {
        return FinalGrade;
    }

    public void setFinalGrade(float finalGrade) {
        FinalGrade = finalGrade;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
}
