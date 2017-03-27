package com.ygaps.listview.model;

import java.util.ArrayList;

/**
 * Created by tpl on 3/27/17.
 */

public class YearInfo {
    private String name;
    private ArrayList<SemesterInfo> semesterList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SemesterInfo> getSemesterList() {
        return semesterList;
    }

    public void setSemesterList(ArrayList<SemesterInfo> semesterList) {
        this.semesterList = semesterList;
    }
}
