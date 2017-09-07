package com.xuewenhui.base.adapter;

import android.content.Context;
import android.widget.TextView;

import com.xuewenhui.base.R;
import com.xuewenhui.base.bean.Bean;

import java.util.List;

/**
 * Created by
 * Create Time: 2017/9/4
 * Description:
 */

public class DataAdapter extends CommonAdapter<Bean> {

    public DataAdapter(Context context, List<Bean> mDatas, int layoutId) {
        super(context, mDatas, layoutId);
    }

    @Override
    public void convert(ViewHolder holder, Bean bean) {
        TextView txtId = holder.getView(R.id.txt_id);
        TextView txtName = holder.getView(R.id.txt_name);
        txtId.setText(bean.getId() + "");
        txtName.setText(bean.getName());
    }
}
