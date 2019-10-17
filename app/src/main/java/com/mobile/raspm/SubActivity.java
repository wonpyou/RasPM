package com.mobile.raspm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SubActivity extends Activity implements View.OnClickListener {

    private Button[] mButton = new Button[6];

    private ArrayList<String> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        mDataList = new ArrayList<String>();

        mButton[0] = (Button) findViewById(R.id.main_b_00);
        mButton[1] = (Button) findViewById(R.id.main_b_01);
        mButton[2] = (Button) findViewById(R.id.main_b_02);
        mButton[3] = (Button) findViewById(R.id.main_b_03);
        mButton[4] = (Button) findViewById(R.id.main_b_04);
        mButton[5] = (Button) findViewById(R.id.main_b_05);

        final String[] mid = {"강서구","양천구","구로구","강남구"};

        ListView list = (ListView) findViewById(R.id.listview1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mid);
        list.setAdapter(adapter);

        for(int i =0; i<6; i++)
        {
            mButton[i].setTag(i);

            mButton[i].setOnClickListener(this);


            //데이터 저장하는 부분
        }


    }

    public void onClick(View v)
    {
        Button newButton = (Button) v;

        for(Button tempButton : mButton)
        {
            if(tempButton == newButton)
            {
                int position = (Integer)v.getTag();

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

            }
        }

    }


   // public void onClick(View view) {
   //     Intent intent = new Intent(this, MainActivity.class);
    //    startActivity(intent);
   // }


}
