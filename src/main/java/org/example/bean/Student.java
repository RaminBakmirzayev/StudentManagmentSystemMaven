package org.example.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends Person{
    private String schoolName;
    private double scolarship;


public String toString() {
 return  super.toString() +"\n SchoolName:"+getSchoolName()+  "\n ScholarShip:"+getScolarship();

}

}
