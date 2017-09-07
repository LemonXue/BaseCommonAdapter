package com.xuewenhui.base.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ListView;

import com.xuewenhui.base.R;
import com.xuewenhui.base.adapter.DataAdapter;
import com.xuewenhui.base.bean.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 * 创建人：XueWenhui
 * 创建时间：17.9.4
 * getSupportActionBar().hide();
 * //去状态栏 加沉浸式
 * getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
 */
public class MainActivity extends AppCompatActivity {
    private List<Bean> list;
    private ListView lvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        lvData = (ListView) findViewById(R.id.list_view);
        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Bean(i + 1, "数据：" + i));
        }
        DataAdapter adapter = new DataAdapter(this, list, R.layout.item_data);
        lvData.setAdapter(adapter);
    }
}
