package com.ygaps.listview.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ygaps.listview.R;
import com.ygaps.listview.model.YearInfo;

import java.util.ArrayList;

/**
 * Created by tpl on 3/27/17.
 */

public class YearListAdapter extends BaseAdapter {

    ArrayList<YearInfo> mData;
    Context mContext;
    LayoutInflater inflater;

    public YearListAdapter(ArrayList<YearInfo> data, Context context) {
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
            convertView = mInflater.inflate(R.layout.year_info_row, null);
        }

        return convertView;
    }
}
