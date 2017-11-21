package cn.edu.pku.ss.zhangqx.a2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.edu.pku.app.MyApplication;
import cn.edu.pku.bean.City;

/**
 * Created by kk on 2017/10/18.
 */

public class SelectCity extends Activity implements View.OnClickListener {
    private ImageView mBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_city);
        initViews();

    }

    private void initViews(){
        mBackBtn =(ImageView) findViewById(R.id.title_back);
        mBackBtn.setOnClickListener(this);

        MyApplication myApplication = (MyApplication)getApplication();
        final List<City> mCityList =myApplication.getCityList();
        ArrayList<String>mCityArrayList =new ArrayList<>();
        for (int i=0;i<mCityArrayList.size();i++){
            String cityName =mCityList.get(i).getCity();
            mCityArrayList.add(cityName);
        }
        ListView mCityListLV =(ListView)findViewById(R.id.selectcity_listview);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(SelectCity.this,android.R.layout.simple_lisst_item_1,mCityArrayList);
        mCityListLV.setAdapter(adapter);
        mCityListLV.setOnItemClickListener((parent, view, position, id) → {
            Intent iNewCD = new Intent ();
            iNewCD.putExtra("cityCode",mCityList.get(position).get(position).getNumber());
            setResult(RESULT_OK,iNewCD);
            finish();


        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.title_back:
                Intent i = new Intent();
                i.putExtra("cityCode", "101160101");
                setResult(RESULT_OK, i);
                finish();
                break;
            default:
                break;
        }
    }
}


