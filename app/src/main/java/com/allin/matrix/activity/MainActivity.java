package com.allin.matrix.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.allin.matrix.R;
import com.allin.matrix.adapter.MainAdapter;

/**
 * Created by a on 2016/6/20.
 * Author: Allin
 */
public class MainActivity extends BaseActivity {
    private ListView listView;

    private String[] activitys = {
        "TabActivity"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        ListAdapter adapter = new MainAdapter(activitys);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    String activity = String.format("com.allin.matrix.activity.%s", activitys[position]);
                    Intent intent = new Intent(MainActivity.this, Class.forName(activity));
                    startActivity(intent);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
