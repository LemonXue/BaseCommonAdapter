package com.xuewenhui.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by WuXirui
 * Create Time: 2017/9/4
 * Description:
 */

public class ViewHolder {
    private SparseArray<View> views;
    private View convertView;

    public ViewHolder(Context context, int layoutId) {
        views = new SparseArray<>();
        convertView = View.inflate(context, layoutId, null);

        convertView.setTag(this);
    }


    public static ViewHolder get(Context context, View convertView, int layoutId) {
        if (convertView == null) {
            return new ViewHolder(context, layoutId);
        } else {
            return (ViewHolder) convertView.getTag();
        }
    }

    public <T extends View> T getView(int viewId) {
        View v = views.get(viewId);
        if (v == null) {
            v = convertView.findViewById(viewId);
            views.put(viewId, v);
        }
        return (T) v;
    }

    public View getConvertView() {
        return convertView;
    }
}
