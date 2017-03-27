package com.ygaps.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ygaps.listview.adapter.CourseListAdapter;
import com.ygaps.listview.adapter.YearListAdapter;
import com.ygaps.listview.model.CourseInfo;
import com.ygaps.listview.model.SemesterInfo;
import com.ygaps.listview.model.YearInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<YearInfo> yearList = new ArrayList<>();

        //2015: S1 (CS112), S2 (CS211, CS212)
        //2016: S3 (CS311, CS312, CS313)
        //2017:

        YearInfo yearInfo1 = new YearInfo();
        yearInfo1.setName("2015");
        yearList.add(yearInfo1);
        SemesterInfo semesterInfo1 = new SemesterInfo();
        semesterInfo1.setName("S1");
        yearInfo1.getSemesterList().add(semesterInfo1);
        CourseInfo courseInfo1 = new CourseInfo();
        courseInfo1.setName("CS112");
        courseInfo1.setGrade(8);
        semesterInfo1.getCourseList().add(courseInfo1);

        SemesterInfo semesterInfo2 = new SemesterInfo();
        semesterInfo2.setName("S2");
        yearInfo1.getSemesterList().add(semesterInfo2);
        CourseInfo courseInfo2 = new CourseInfo();
        courseInfo2.setName("CS211");
        courseInfo2.setGrade(7);
        semesterInfo2.getCourseList().add(courseInfo2);
        CourseInfo courseInfo3 = new CourseInfo();
        courseInfo3.setName("CS212");
        courseInfo3.setGrade(6);
        semesterInfo2.getCourseList().add(courseInfo3);

        YearInfo yearInfo2 = new YearInfo();
        yearInfo2.setName("2016");
        yearList.add(yearInfo2);
        SemesterInfo semesterInfo3 = new SemesterInfo();
        semesterInfo3.setName("S3");
        yearInfo2.getSemesterList().add(semesterInfo3);
        CourseInfo courseInfo4 = new CourseInfo();
        courseInfo4.setName("CS311");
        courseInfo4.setGrade(7);
        semesterInfo3.getCourseList().add(courseInfo4);
        CourseInfo courseInfo5 = new CourseInfo();
        courseInfo5.setName("CS312");
        courseInfo5.setGrade(5);
        semesterInfo3.getCourseList().add(courseInfo5);
        CourseInfo courseInfo6 = new CourseInfo();
        courseInfo6.setName("CS313");
        courseInfo6.setGrade(8);
        semesterInfo3.getCourseList().add(courseInfo6);

        YearInfo yearInfo3 = new YearInfo();
        yearInfo3.setName("2017");
        yearList.add(yearInfo3);


        ListView lvYear = (ListView) findViewById(R.id.lv_years);
        lvYear.setAdapter(new YearListAdapter(yearList, this));
    }
}
