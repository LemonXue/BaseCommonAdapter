package com.xuewenhui.base.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by
 * Create Time: 2017/9/4
 * Description:
 */

public abstract class CommonAdapter<T> extends BaseAdapter {
    protected Context context;
    protected List<T> mDatas;
    private int layoutId;

    public CommonAdapter(Context context, List<T> mDatas, int layoutId) {
        this.context = context;
        this.mDatas = mDatas;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        if (mDatas == null) {
            return 0;
        }
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        if (mDatas == null) {
            return null;
        }
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        if (mDatas == null) {
            return 0;
        }
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.get(context, convertView, layoutId);
        convert(holder, mDatas.get(position));
        return holder.getConvertView();
    }

    public abstract void convert(ViewHolder holder, T t);
}
