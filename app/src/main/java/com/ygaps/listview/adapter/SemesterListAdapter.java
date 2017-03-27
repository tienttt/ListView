package com.ygaps.listview.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.ygaps.listview.R;
import com.ygaps.listview.model.SemesterInfo;
import com.ygaps.listview.model.YearInfo;

import java.util.ArrayList;

/**
 * Created by tpl on 3/27/17.
 */

public class SemesterListAdapter extends BaseAdapter {

    ArrayList<SemesterInfo> mData;
    Context mContext;
    LayoutInflater inflater;

    public SemesterListAdapter(ArrayList<SemesterInfo> data, Context context) {
        mData = data;
        mContext = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int arg0) {
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.semester_info_row, null);
        }

        SemesterInfo si = mData.get(position);
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_Name);
        tvName.setText(si.getName());
        ListView lvCourse = (ListView) convertView.findViewById(R.id.lv_Courses);
        lvCourse.setAdapter(new CourseListAdapter(si.getCourseList(), mContext));

        Resources r = ((Activity)mContext).getResources();
        int HeightOfCourse = 30;
        int DividerOfCourse = 4;
        int t = 0;
        int size = si.getCourseList().size();
        if(size >= 1){
            t = size * HeightOfCourse + (size-1) * DividerOfCourse;
        }
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, t, r.getDisplayMetrics());
        LinearLayout.LayoutParams mParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,(int)(px));
        lvCourse.setLayoutParams(mParam);

        return convertView;
    }
}
