package com.ygaps.listview.model;

import java.util.ArrayList;

/**
 * Created by tpl on 3/27/17.
 */

public class SemesterInfo {
    private String name;
    private ArrayList<CourseInfo> courseList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CourseInfo> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<CourseInfo> courseList) {
        this.courseList = courseList;
    }
}
